package release.admin.com.companysampleproject.newslist;


import android.util.Log;

import release.admin.com.companysampleproject.domain.NewsManager;
import release.admin.com.companysampleproject.domain.NewsManagerImpl;
import release.admin.com.companysampleproject.domain.NewsRequestListener;

public class NewsListPresenter implements NewsListContract.Presenter {

    private NewsListContract.NewsView mNewsView;
    private NewsManager mNewsManager;

    public NewsListPresenter(NewsListContract.NewsView newsView) {
        this.mNewsView = newsView;
        this.mNewsManager = new NewsManagerImpl();
    }

    /**
     * request manager for fetching news data
     */
    @Override
    public void fetchData() {
        mNewsManager.fetchNewData(new NewsRequestListener() {
            @Override
            public void onNewsUpdated(NewsParentModel newsParentModel) {
                if (newsParentModel != null) {
                    Log.d("NewsListPresenter ", "newsParentModel "+newsParentModel.toString());
                    mNewsView.refreshList(newsParentModel);
                } else {
                    mNewsView.showToast("show error message");
                }
            }

            @Override
            public void failureMessage(String message) {
                mNewsView.showToast(message);
            }
        });
    }
}
