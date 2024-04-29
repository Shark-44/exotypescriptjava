
public class Photo {
    private String url;
    private String filename;
    private int width;
    private int height;

    public Photo(String url, String filename, int width, int height) {
        this.url = url;
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    public String getUrl() {return url;}
    public String getFilename() {return filename;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}

    public void setUrl(String url) {this.url = url;}
    public void setFilename(String filename) {this.filename = filename;}
    public void setWidth(int width) {this.width = width;}
    public void setHeight(int height) {this.height = height;}
}
