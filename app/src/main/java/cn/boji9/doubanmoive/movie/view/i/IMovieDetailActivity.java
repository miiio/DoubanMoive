package cn.boji9.doubanmoive.movie.view.i;

import java.util.List;

import cn.boji9.doubanmoive.beans.Comment;
import cn.boji9.doubanmoive.beans.MovieDetail;
import cn.boji9.doubanmoive.beans.MovieDetailBean;

/**
 * Created by wax on 2017/9/3.
 */

public interface IMovieDetailActivity {
    void showDetail(MovieDetailBean movieDetail);
    void addPopReview(List<MovieDetailBean.PopularReviewsBean> popularReviewsBeen);
}
