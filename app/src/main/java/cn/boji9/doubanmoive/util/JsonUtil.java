package cn.boji9.doubanmoive.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cn.boji9.doubanmoive.beans.Avator;
import cn.boji9.doubanmoive.beans.Cast;
import cn.boji9.doubanmoive.beans.Comment;
import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieDetail;
import cn.boji9.doubanmoive.beans.PhotoVideo;
import cn.boji9.doubanmoive.beans.User;

/**
 * Created by wax on 2017/9/1.
 */

public class JsonUtil {
    public static MovieDetail readJsonMovieDetailBean(String json){
        MovieDetail movieDetail = null;
        List<Cast> casts = new ArrayList<>();
        try {
            //"writers": [{"avatars": null, "name_en": "", "name": "\u5ddd\u539f\u792b", "alt": null, "id": null}]
            JSONObject jsonObject = new JSONObject(json);
            movieDetail = new MovieDetail();
            movieDetail.setRatings_count(jsonObject.getString("ratings_count"));
            movieDetail.setSummary(jsonObject.getString("summary"));
            movieDetail.setComments_count(jsonObject.getInt("comments_count"));
            movieDetail.setPopular_reviews(readJsonPopularReviews(jsonObject.getJSONArray("popular_reviews")));
            JSONArray writer = jsonObject.getJSONArray("writers");
            for(int i = 0; i<writer.length(); i++){
                JSONObject cast = writer.getJSONObject(i);
                if(!cast.isNull("avatars")) {
                    JSONObject avatars = cast.getJSONObject("avatars");
                    casts.add(new Cast(cast.getString("name"), cast.getString("name_en"),
                            true, new Avator(avatars.getString("small"), avatars.getString("medium"), avatars.getString("large"))
                            , cast.getString("id")));
                }
            }
            JSONArray castsArray = jsonObject.getJSONArray("casts");
            for(int i = 0; i<castsArray.length(); i++){
                JSONObject cast = castsArray.getJSONObject(i);
                JSONObject avatars = cast.getJSONObject("avatars");
                casts.add(new Cast(cast.getString("name"),cast.getString("name_en"),
                        false,new Avator(avatars.getString("small"),avatars.getString("medium"),avatars.getString("large"))
                        ,cast.getString("id")));
            }
            movieDetail.setCasts(casts);

            List<PhotoVideo> photoVideos = new ArrayList<>();
            JSONArray trailersArray = jsonObject.getJSONArray("trailers");
            for(int i = 0; i<trailersArray.length(); i++){
                JSONObject trailerObj = trailersArray.getJSONObject(i);
                PhotoVideo photoVideo = new PhotoVideo();
                photoVideo.setId(trailerObj.getString("id"));
                photoVideo.setResourceUrl(trailerObj.getString("resource_url"));
                photoVideo.setTitle(trailerObj.getString("title"));
                photoVideo.setVideo(true);
                photoVideo.setAvator(new Avator(trailerObj.getString("small"),
                        trailerObj.getString("medium"),trailerObj.getString("medium")));
                photoVideos.add(photoVideo);
            }

            JSONArray photoArr = jsonObject.getJSONArray("photos");
            for(int i = 0; i<photoArr.length(); i++){
                JSONObject photoObj = photoArr.getJSONObject(i);
                PhotoVideo photoVideo = new PhotoVideo(new Avator(photoObj.getString("cover"),
                        photoObj.getString("thumb"),photoObj.getString("image")),photoObj.getString("id"));
                photoVideos.add(photoVideo);
            }

            movieDetail.setPhotoVideos(photoVideos);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return movieDetail;
    }

    public static List<Comment> readJsonPopularReviews(JSONArray popular_reviews) {
        List<Comment> comments = new ArrayList<>();
        JSONArray jsonArray = popular_reviews;
        for(int i = 0; i<jsonArray.length(); i++){
            JSONObject jsonObject1 = null;
            try {
                jsonObject1 = jsonArray.getJSONObject(i);
                Comment comment = new Comment();
                comment.setId(jsonObject1.getString("id"));
                comment.setContent(jsonObject1.getString("summary"));
                comment.setRating(jsonObject1.getJSONObject("rating").getString("value"));
                comment.setSubject_id(jsonObject1.getString("subject_id"));
                comment.setUseful_count("0");
                comment.setDate("");
                User user = new User();
                JSONObject authorJsonObj = jsonObject1.getJSONObject("author");
                user.setId(authorJsonObj.getString("id"));
                user.setUid(authorJsonObj.getString("uid"));
                user.setAvatar(authorJsonObj.getString("avatar"));
                user.setName(authorJsonObj.getString("name"));
                user.setSignature(authorJsonObj.getString("signature"));
                comment.setAuthor(user);
                comments.add(comment);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }


        return comments;
    }

    public static List<Movie> readJsonMovieBeans(String json){
        List<Movie> movies = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = jsonObject.getJSONArray("subjects");
            for(int i = 0; i<jsonArray.length(); i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                List<String> casts = new ArrayList<>();
                JSONArray actarr = obj.getJSONArray("casts");
                for(int j = 0; j<actarr.length(); j++){
                    JSONObject tmp = actarr.getJSONObject(j);
                    casts.add(tmp.getString("name"));
                }
                JSONArray datearr = obj.getJSONArray("pubdates");
                String date = " --- ";
                if(datearr.length()>0) {
                    date = datearr.getString(datearr.length() - 1);
                }
                String durations = " --- ";
                if(obj.getJSONArray("durations").length()>0){
                    durations = obj.getJSONArray("durations").getString(0);
                }
                List<String> genres = new ArrayList<>();
                JSONArray genresArr = obj.getJSONArray("genres");
                for(int j = 0;j<genresArr.length();j++){
                    genres.add(genresArr.getString(j));
                }
                String director = obj.getJSONArray("directors").getJSONObject(0).getString("name");
                movies.add(new Movie(obj.getString("title"),
                        obj.getJSONObject("images").getString("large"),
                        obj.getJSONObject("images").getString("small"),
                        obj.getJSONObject("images").getString("medium"),
                        obj.getJSONObject("rating").getString("average"),
                        date,
                        casts,
                        genres,
                        director,
                        obj.getString("id"),
                        obj.getString("year"),
                        durations));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return movies;
    }

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

    public static List<Comment> readJsonComments(String json){
        List<Comment> comments = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = jsonObject.getJSONArray("comments");
            for(int i = 0; i<jsonArray.length(); i++){
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                Comment comment = new Comment();
                comment.setId(jsonObject1.getString("id"));
                comment.setContent(jsonObject1.getString("content"));
                comment.setRating(jsonObject1.getJSONObject("rating").getString("value"));
                comment.setSubject_id(jsonObject1.getString("subject_id"));
                comment.setUseful_count(jsonObject1.getString("useful_count"));
                comment.setDate(jsonObject1.getString("created_at"));
                User user = new User();
                JSONObject authorJsonObj = jsonObject1.getJSONObject("author");
                user.setId(authorJsonObj.getString("id"));
                user.setUid(authorJsonObj.getString("uid"));
                user.setAvatar(authorJsonObj.getString("avatar"));
                user.setName(authorJsonObj.getString("name"));
                user.setSignature(authorJsonObj.getString("signature"));
                comment.setAuthor(user);
                comments.add(comment);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return comments;
    }
}
