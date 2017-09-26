package cn.boji9.doubanmoive.movie.view.i;

import java.util.List;

import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieBean;

/**
 * Created by wax on 2017/9/1.
 */

public interface IMoviesListFragment {
    void addMovies(List<MovieBean.SubjectsBean> movieList);
    void showProgress();
    void hideProgress();
}
