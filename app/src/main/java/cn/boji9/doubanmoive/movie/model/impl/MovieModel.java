package cn.boji9.doubanmoive.movie.model.impl;

import android.util.Log;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.boji9.doubanmoive.beans.MovieBean;
import cn.boji9.doubanmoive.movie.model.i.IMovieModel;
import cn.boji9.doubanmoive.movie.model.i.OnLoadMoviesListener;
import cn.boji9.doubanmoive.util.JsonUtil;
import cn.boji9.doubanmoive.beans.Movie;
import okhttp3.Call;

/**
 * Created by wax on 2017/9/1.
 */

public class MovieModel implements IMovieModel {
    @Override
    public void loadMovieList(String url, final OnLoadMoviesListener onLoadMoviesListener) {
        List<Movie> movies;
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                onLoadMoviesListener.onFailure(e);
            }

            @Override
            public void onResponse(String response, int id) {
                //onLoadMoviesListener.onSuccess(getBooks(response));
                Gson gson = new Gson();
                MovieBean movieBean = gson.fromJson(response,MovieBean.class);
                onLoadMoviesListener.onSuccess(movieBean.getSubjects());
            }
        });
    }

    private List<Movie> getBooks(String html){
        List<Movie> movies = new ArrayList<>();

        Pattern pattern = Pattern.compile("spic/(.*).jpg");
        Matcher matcher = pattern.matcher(html);
        while(matcher.find()){
            Movie movie = new Movie();
            movie.setLargeImage("https://img3.doubanio.com/lpic/"+matcher.group(1)+".jpg");
            movies.add(movie);
        }
        pattern = Pattern.compile("; title=\"(.*)\"");
        matcher = pattern.matcher(html);
        int cnt =  0;
        while(matcher.find()){
            if(cnt>=movies.size()){
                break;
            }
            movies.get(cnt).setTitle(matcher.group(1));
            cnt++;
        }

        cnt=0;
        pattern = Pattern.compile("<p class=\"pl\">(.*)</p>");
        matcher = pattern.matcher(html);
        while(matcher.find()){
            if(cnt>=movies.size()){
                break;
            }
            String tmp = matcher.group(1);
            String[] info = tmp.split("/");

            List<String> date = new ArrayList<>();
            date.add(info[info.length-2]);
            movies.get(cnt).setGenres(date);
            String author = "";
            for(int i = 0; i<info.length-3;i++){
                author += i==0? info[i]:(" / "+info[i]);
            }
            movies.get(cnt).setDirector(author);
            List<String> publishing = new ArrayList<>();
            publishing.add(info[info.length-3]);
            publishing.add(info[info.length-1]);
            movies.get(cnt).setCasts(publishing);
            cnt++;
        }

        cnt=0;
        pattern = Pattern.compile("q\">(.*)</span>");
        matcher = pattern.matcher(html);
        while(matcher.find()){
            if(cnt>=movies.size()){
                break;
            }
            movies.get(cnt).setDate(matcher.group(1));
            cnt++;
        }

        cnt=0;
        pattern = Pattern.compile("s\">(.*)</span>");
        matcher = pattern.matcher(html);
        while(matcher.find()){
            if(cnt>=movies.size()){
                break;
            }
            movies.get(cnt).setAverage(matcher.group(1));
            cnt++;
        }

        return movies;
    }
}

