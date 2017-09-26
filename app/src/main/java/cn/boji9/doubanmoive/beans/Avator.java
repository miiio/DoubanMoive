package cn.boji9.doubanmoive.beans;

/**
 * Created by wax on 2017/9/10.
 */

public class Avator {
    private String small;
    private String medium;
    private String large;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public Avator(String small, String medium, String large) {

        this.small = small;
        this.medium = medium;
        this.large = large;
    }
}
