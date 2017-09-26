package cn.boji9.doubanmoive.movie.presenter.i;

import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieBean;

/**
 * Created by wax on 2017/9/3.
 */

public interface IMovieDetailPresenter {
    void loadMovieDetail(MovieBean.SubjectsBean movie);
}
