package release.admin.com.companysampleproject.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class NewsResponse {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("rows")
    @Expose
    private List<NewsBody> mNewsBodyList = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<NewsBody> getNewsBodyList() {
        return mNewsBodyList;
    }

    public void setNewsBodyList(List<NewsBody> newsBodyList) {
        this.mNewsBodyList = newsBodyList;
    }

}
