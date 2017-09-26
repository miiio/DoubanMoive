package cn.boji9.doubanmoive.beans;

/**
 * Created by wax on 2017/9/7.
 */

public class User {
    private String uid;
    private String id;
    private String name;
    private String signature;
    private String avatar;

    public User() {
    }

    public User(String uid, String id, String name, String signature, String avatar) {
        this.uid = uid;
        this.id = id;
        this.name = name;
        this.signature = signature;
        this.avatar = avatar;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
