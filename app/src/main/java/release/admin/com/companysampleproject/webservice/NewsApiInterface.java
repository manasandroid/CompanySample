package release.admin.com.companysampleproject.webservice;

import release.admin.com.companysampleproject.domain.NewsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface NewsApiInterface {
    @Headers("Content-Type: application/json")
    @GET("/s/2iodh4vg0eortkl/facts.json")
    Call<NewsResponse> getAllNews();

}
