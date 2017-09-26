package cn.boji9.doubanmoive.movie.presenter.impl;

import java.util.List;

import cn.boji9.doubanmoive.beans.MovieBean;
import cn.boji9.doubanmoive.beans.MovieDetailBean;
import cn.boji9.doubanmoive.movie.adapter.PopReviewsAdapter;
import cn.boji9.doubanmoive.movie.model.i.IMovieDetailModel;
import cn.boji9.doubanmoive.movie.model.i.OnloadMoviePopReview;
import cn.boji9.doubanmoive.movie.model.impl.MovieDetailModel;
import cn.boji9.doubanmoive.movie.model.i.OnLoadMovieDetailListener;
import cn.boji9.doubanmoive.movie.presenter.i.IMovieDetailPresenter;
import cn.boji9.doubanmoive.movie.view.i.IMovieDetailActivity;
import cn.boji9.doubanmoive.util.Urls;

/**
 * Created by wax on 2017/9/3.
 */

public class MovieDetailPresenter implements IMovieDetailPresenter {
    private IMovieDetailModel mMovieDetailModel;
    private IMovieDetailActivity mMovieDetailActivity;

    public MovieDetailPresenter(IMovieDetailActivity mIMovieDetailActivity) {
        this.mMovieDetailActivity = mIMovieDetailActivity;
        mMovieDetailModel = new MovieDetailModel();
    }

    @Override
    public void loadMovieDetail(final MovieBean.SubjectsBean movie) {
        final String url = "http://api.douban.com/v2/movie/subject/"
                +movie.getId()+"?apikey=0b2bdeda43b5688921839c8ecb20399b";
        OnLoadMovieDetailListener onLoadMovieDetailListener = new OnLoadMovieDetailListener() {
            @Override
            public void onSuccess(MovieDetailBean movieDetail) {
                //movieDetail.setMovie(movie);
                //mMovieDetailModel.loadMovieComments(commentsUrl,onloadMovieComments);
                mMovieDetailActivity.showDetail(movieDetail);
            }

            @Override
            public void onFailure(Exception e) {

            }
        };
        mMovieDetailModel.loadMovieDetail(url,onLoadMovieDetailListener);
    }
}
