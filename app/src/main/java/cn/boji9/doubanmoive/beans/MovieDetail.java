package cn.boji9.doubanmoive.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wax on 2017/9/3.
 */

public class MovieDetail {
    private Movie movie;
    private List<Comment> commentList = new ArrayList<>();
    private List<Comment> popular_reviews = new ArrayList<>();
    private int comments_count;
    private List<Cast> casts;
    private List<PhotoVideo> photoVideos;

    public List<PhotoVideo> getPhotoVideos() {
        return photoVideos;
    }

    public void setPhotoVideos(List<PhotoVideo> photoVideos) {
        this.photoVideos = photoVideos;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public void setPopular_reviews(List<Comment> popular_reviews) {
        this.popular_reviews = popular_reviews;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public List<Comment> getPopular_reviews() {
        return popular_reviews;
    }

    public MovieDetail() {
        movie = null;
    }

    private String summary;
    private String ratings_count;

    public MovieDetail(Movie movie, String summary, String ratings_count) {
        this.movie = movie;
        this.summary = summary;
        this.ratings_count = ratings_count;
    }

    public Movie getMovie() {

        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(String ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
