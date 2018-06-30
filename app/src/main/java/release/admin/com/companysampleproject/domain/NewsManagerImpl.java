package release.admin.com.companysampleproject.domain;

import java.util.ArrayList;
import java.util.List;

import release.admin.com.companysampleproject.newslist.NewsModel;
import release.admin.com.companysampleproject.webservice.ApiClient;
import release.admin.com.companysampleproject.webservice.NewsApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import release.admin.com.companysampleproject.newslist.NewsParentModel;


public class NewsManagerImpl implements NewsManager{

    private NewsApiInterface apiService;

    public NewsManagerImpl() {
        apiService = ApiClient.getClient().create(NewsApiInterface.class);
    }

    /**
     * fetch the news data and maps to news model object
     * @param newsRequestListener
     */
    @Override
    public void fetchNewData(final NewsRequestListener newsRequestListener) {
        Call<NewsResponse> call = apiService.getAllNews();
        call.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if (response.isSuccessful()) {
                    NewsResponse newsResponse = response.body();
                    NewsParentModel newsParentModel = mapNewsResponseToNewsModel(newsResponse);
                    newsRequestListener.onNewsUpdated(newsParentModel);
                } else {
                    newsRequestListener.failureMessage("There is some problem in network, please try again after some time");
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {

            }
        });
    }

    private NewsParentModel mapNewsResponseToNewsModel(NewsResponse newsResponse) {
        NewsParentModel newsParentModel = null;
        if (newsResponse != null) {
            newsParentModel = new NewsParentModel();
            newsParentModel.setTitle(newsResponse.getTitle());
            if (newsResponse.getNewsBodyList() != null && !newsResponse.getNewsBodyList().isEmpty()) {
                List<NewsModel>newsModelList = new ArrayList<>();
                for (NewsBody newsBody : newsResponse.getNewsBodyList()) {
                    NewsModel newsModel = new NewsModel();
                    newsModel.setDescription(newsBody.getDescription());
                    newsModel.setTitle(newsBody.getTitle());
                    newsModel.setImageUrl((String) newsBody.getImageHref());
                    newsModelList.add(newsModel);
                }
                newsParentModel.setNewsBodyList(newsModelList);
            }
        }
        return newsParentModel;
    }
}
