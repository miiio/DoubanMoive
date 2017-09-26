package cn.boji9.doubanmoive.movie.view.i;

import java.util.List;

import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieBean;

/**
 * Created by wax on 2017/9/5.
 */

public interface ISearchMovieActivity {
    void showSearchResult(List<MovieBean.SubjectsBean> result);
    void setRefresh(boolean is);
}
