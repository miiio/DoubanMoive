package cn.boji9.doubanmoive.movie.model.i;

import cn.boji9.doubanmoive.beans.MovieDetail;
import cn.boji9.doubanmoive.beans.MovieDetailBean;

/**
 * Created by wax on 2017/9/3.
 */

public interface OnLoadMovieDetailListener {
    void onSuccess(MovieDetailBean movieDetail);

    void onFailure(Exception e);
}
