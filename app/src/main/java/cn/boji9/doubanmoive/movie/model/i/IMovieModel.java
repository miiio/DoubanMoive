package cn.boji9.doubanmoive.movie.model.i;

/**
 * Created by wax on 2017/9/1.
 */

public interface IMovieModel {
    void loadMovieList(String url, OnLoadMoviesListener onLoadMoviesListener);
}
