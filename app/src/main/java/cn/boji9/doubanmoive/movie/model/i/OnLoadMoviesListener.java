package cn.boji9.doubanmoive.movie.model.i;

import java.util.List;

import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieBean;

/**
 * Created by wax on 2017/9/1.
 */

public interface OnLoadMoviesListener {

    void onSuccess(List<MovieBean.SubjectsBean> movieList);

    void onFailure(Exception e);

}
