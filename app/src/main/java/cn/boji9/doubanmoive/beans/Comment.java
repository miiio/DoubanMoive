package cn.boji9.doubanmoive.beans;

import java.io.Serializable;

/**
 * Created by wax on 2017/9/7.
 */
// {
//         "rating": {
//         "max": 5,
//         "value": 1,
//         "min": 0
//         },
//         "useful_count": 168,
//         "author":
//         {
//         "uid": "62598926",
//         "avatar": "https://img3.doubanio.com/icon/u62598926-1.jpg",
//         "signature": "",
//         "alt": "https://www.douban.com/people/62598926/",
//         "id": "62598926",
//         "name": "小曦讨厌下雨天"
//         },
//         "subject_id": "26865690",
//         "content": "太恐怖了！吓得我从第十分钟开始就没敢睁眼睛，最后直接睡着了。",
//         "created_at": "2017-01-06 15:16:12",
//         "id": "1132938490"
// }
public class Comment{
    private String id;
    private User author;
    private String rating;
    private String useful_count;
    private String subject_id;
    private String content;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Comment(String id, User author, String rating, String useful_count, String subject_id, String content, String date) {
        this.id = id;
        this.author = author;
        this.rating = rating;
        this.useful_count = useful_count;
        this.subject_id = subject_id;
        this.content = content;
        this.date = date;

    }

    public Comment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getUseful_count() {
        return useful_count;
    }

    public void setUseful_count(String useful_count) {
        this.useful_count = useful_count;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
