package cn.boji9.doubanmoive.beans;

import java.util.Map;

/**
 * Created by wax on 2017/9/10.
 */

public class Cast {
    private String name;
    private String name_en;

    public Cast(String name, String name_en, boolean isWriters, Avator avator, String id) {
        this.name = name;
        this.name_en = name_en;
        this.isWriters = isWriters;
        this.avator = avator;
        this.id = id;
    }

    public String getName_en() {

        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    private boolean isWriters;
    private Avator avator;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWriters() {
        return isWriters;
    }

    public void setWriters(boolean writers) {
        isWriters = writers;
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
}