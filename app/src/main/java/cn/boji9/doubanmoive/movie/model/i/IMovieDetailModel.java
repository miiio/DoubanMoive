package cn.boji9.doubanmoive.movie.model.i;

/**
 * Created by wax on 2017/9/3.
 */

public interface IMovieDetailModel {
    void loadMovieDetail(String url, OnLoadMovieDetailListener onLoadMovieDetailListener);
}
