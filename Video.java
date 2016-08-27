package uvdos.uvdos;

/**
 * Created by Keval Rathod on 8/27/2016.
 */
public class Video {

    int id;
    String data,displayName,size,thumbNail;

    public Video(int id, String data, String displayName, String size, String thumbNail) {
        this.id = id;
        this.data = data;
        this.displayName = displayName;
        this.size = size;
        this.thumbNail=thumbNail;
    }

    public Video() {
    }

    public void setThumbNail(String thumbNail) {
        this.thumbNail = thumbNail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getThumbNail() {
        return thumbNail;
    }

    public String getSize() {
        return size;
    }
}
