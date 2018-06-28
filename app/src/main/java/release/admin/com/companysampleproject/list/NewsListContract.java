package release.admin.com.companysampleproject.list;


public class NewsListContract {

    public interface Presenter {
        /**
         * fetch the data from web
         */
        void fetchData();
    }

    public interface NewsView {
        /**
         * update the ui with fetched data
         */
        void refreshList();
    }
}
