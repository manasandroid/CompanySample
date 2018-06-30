package release.admin.com.companysampleproject.domain;

import release.admin.com.companysampleproject.newslist.NewsParentModel;

public interface NewsRequestListener {

    /**
     * map the news response from web response to news model object which will get used by UI level
     */
    void onNewsUpdated(NewsParentModel newsModel);

    /**
     * fetch the error message from response body and deliver to UI layer
     * @param message
     */
    void failureMessage(String message);
}
