package cn.boji9.doubanmoive.movie.presenter.impl;

import java.util.List;

import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieBean;
import cn.boji9.doubanmoive.movie.model.i.IMovieModel;
import cn.boji9.doubanmoive.movie.model.impl.MovieModel;
import cn.boji9.doubanmoive.movie.model.i.OnLoadMoviesListener;
import cn.boji9.doubanmoive.movie.view.i.ISearchMovieActivity;
import cn.boji9.doubanmoive.util.Urls;

/**
 * Created by wax on 2017/9/5.
 */

public class SearchMoviePresenter {
    private ISearchMovieActivity mIsISearchMovieActivity;
    private IMovieModel mIMovieModel;

    public SearchMoviePresenter(ISearchMovieActivity mIsISearchMovieActivity) {
        this.mIsISearchMovieActivity = mIsISearchMovieActivity;
        this.mIMovieModel = new MovieModel();
    }

    public void search(String keyword, int page){
        String url = "https://api.douban.com/v2/movie/search?q="+keyword;
        url += "&apikey=0b2bdeda43b5688921839c8ecb20399b&count="
                +String.valueOf(Urls.PAGE_SIZE)+"&start="+String.valueOf(page*Urls.PAGE_SIZE);

        mIsISearchMovieActivity.setRefresh(true);
        mIMovieModel.loadMovieList(url, new OnLoadMoviesListener() {
            @Override
            public void onSuccess(List<MovieBean.SubjectsBean> movieList) {
                mIsISearchMovieActivity.showSearchResult(movieList);
                mIsISearchMovieActivity.setRefresh(false);
            }

            @Override
            public void onFailure(Exception e) {
                mIsISearchMovieActivity.showSearchResult(null);
                mIsISearchMovieActivity.setRefresh(false);
            }
        });
    }
}
