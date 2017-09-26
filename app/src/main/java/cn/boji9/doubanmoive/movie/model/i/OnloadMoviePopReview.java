package cn.boji9.doubanmoive.movie.model.i;

import java.util.List;

import cn.boji9.doubanmoive.beans.Comment;
import cn.boji9.doubanmoive.beans.MovieDetailBean;

/**
 * Created by wax on 2017/9/7.
 */

public interface OnloadMoviePopReview {
    void onSuccess(List<MovieDetailBean.PopularReviewsBean> popularReviewsBeen);

    void onFailure(Exception e);
}
