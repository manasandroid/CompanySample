package release.admin.com.companysampleproject.domain;


public interface NewsManager {

    /**
     * fetch the news data from api
     * @return
     */
    public void fetchNewData(NewsRequestListener newsRequestListener);
}
