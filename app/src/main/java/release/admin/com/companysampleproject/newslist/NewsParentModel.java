package release.admin.com.companysampleproject.newslist;

import java.util.List;


public class NewsParentModel {
    private String title;
    private List<NewsModel> mNewsBodyList = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<NewsModel> getNewsBodyList() {
        return mNewsBodyList;
    }

    public void setNewsBodyList(List<NewsModel> newsBodyList) {
        this.mNewsBodyList = newsBodyList;
    }

    @Override
    public String toString() {
        return "NewsParentModel: " + " title > " + title + " NewsModel  >> "
                + toStringNewModelObject();
    }

    private String toStringNewModelObject() {
        StringBuilder stringBuilder = new StringBuilder();
        for (NewsModel newsModel : getNewsBodyList()) {
            stringBuilder.append(newsModel.toString());
        }
        return stringBuilder.toString();
    }
}
