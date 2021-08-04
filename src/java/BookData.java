import java.io.Serializable;

public class BookData implements Serializable {

    private String ndc           = "";
    private String tyosya_hyouji = "";
    private String id            = "";
    private String title         = "";
    private String author        = "";
    private String publisher     = "";

    public String getNdc() {
        return ndc;
    }

    public void setNdc(String ndc) {
        this.ndc = ndc;
    }

    public String getTyosya_hyouji() {
        return tyosya_hyouji;
    }

    public void setTyosya_hyouji(String tyosya_hyouji) {
        this.tyosya_hyouji = tyosya_hyouji;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}