package release.admin.com.companysampleproject.newslist;


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
        void refreshList(NewsParentModel newsParentModel);

        /**
         * show the progress bar
         */
        void showProgressBar();

        /**
         * hide the progress bar
         */
        void hideProgressBar();

        /**
         * show toast message
         * @param message
         */
        void showToast(String message);
    }
}
