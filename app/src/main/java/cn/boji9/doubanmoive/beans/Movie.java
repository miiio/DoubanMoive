package cn.boji9.doubanmoive.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wax on 2017/9/1.
 */

public class Movie implements Serializable {

    private String id;
    private String title;
    private String largeImage;
    private String smallImage;
    private String durations;

    public String getDurations() {
        return durations;
    }

    public void setDurations(String durations) {
        this.durations = durations;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private String year;

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    private String mediumImage;
    private String average;
    private String date;
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    private List<String> casts;
    private List<String> genres;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getCasts() {
        return casts;
    }

    public void setCasts(List<String> casts) {
        this.casts = casts;
    }

    public Movie() {
    }

    public Movie(String title, String largeImage, String smallImage, String mediumImage, String average, String date, List<String> casts
            , List<String> genres, String director, String id, String year, String durations) {
        this.title = title;
        this.largeImage = largeImage;
        this.smallImage = smallImage;
        this.mediumImage = mediumImage;
        this.average = average;
        this.date = date;
        this.casts = casts;
        this.genres = genres;
        this.director = director;
        this.id = id;
        this.year = year;
        this.durations = durations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public String getCastsStr(){
        String str = "";
        for(int i  =0;i<casts.size();i++){
            if(i==0){
                str += casts.get(i);
            }else{
                str += "/" + casts.get(i);
            }
        }
        return str;
    }

    public String getGenresStr(){
        String str = "";
        for(int i  =0;i<genres.size();i++){
            if(i==0){
                str += genres.get(i);
            }else{
                str += "/" + genres.get(i);
            }
        }
        return str;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }
}
