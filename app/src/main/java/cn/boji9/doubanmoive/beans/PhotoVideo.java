package cn.boji9.doubanmoive.beans;

/**
 * Created by wax on 2017/9/12.
 */

public class PhotoVideo {
    private Avator avator;
    private String id;
    private boolean isVideo;
    private String title;
    private String resourceUrl;

    public
    PhotoVideo(Avator avator, String id) {
        this.avator = avator;
        this.id = id;
        isVideo = false;
        title = "";
        resourceUrl = "";
    }

    public PhotoVideo() {
    }

    public PhotoVideo(Avator avator, String id, boolean isVideo, String title, String resourceUrl) {
        this.avator = avator;
        this.id = id;
        this.isVideo = isVideo;
        this.title = title;
        this.resourceUrl = resourceUrl;
    }

    public Avator getAvator() {
        return avator;
    }

    public void setAvator(Avator avator) {
        this.avator = avator;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
}
