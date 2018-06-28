package release.admin.com.companysampleproject.list;

public class NewsModel {

    private String title;
    private String message;
    private String snippet;
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public NewsModel(String title, String message, String snippet, String imageUrl) {
        this.title = title;
        this.message = message;
        this.snippet = snippet;
        this.imageUrl = imageUrl;
    }
}
