package cn.boji9.doubanmoive.movie.presenter.impl;

import java.util.List;

import cn.boji9.doubanmoive.beans.MovieBean;
import cn.boji9.doubanmoive.movie.presenter.i.IMovesListPresenter;
import cn.boji9.doubanmoive.util.Urls;
import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.movie.model.i.IMovieModel;
import cn.boji9.doubanmoive.movie.model.impl.MovieModel;
import cn.boji9.doubanmoive.movie.model.i.OnLoadMoviesListener;
import cn.boji9.doubanmoive.movie.view.i.IMoviesListFragment;
import cn.boji9.doubanmoive.movie.view.impl.MoviesFragment;

/**
 * Created by wax on 2017/9/1.
 */

public class MoviesListPresenter implements IMovesListPresenter {
    private IMoviesListFragment moviesListFragment;
    private IMovieModel moviesListModel;

    public MoviesListPresenter(IMoviesListFragment moviesListFragment) {
        this.moviesListFragment = moviesListFragment;
        moviesListModel = new MovieModel();
    }

    public void loadMoviesList(int type, int page) {
        String url = getUrl(type,page);
        //url = "https://book.douban.com/top250?start="+page*25;
        moviesListFragment.showProgress();
        moviesListModel.loadMovieList(url, new OnLoadMoviesListener() {
            @Override
            public void onSuccess(List<MovieBean.SubjectsBean> movieList) {
                moviesListFragment.addMovies(movieList);
                moviesListFragment.hideProgress();
            }

            @Override
            public void onFailure(Exception e) {
                moviesListFragment.hideProgress();
            }
        });

    }


    private String getUrl(int type,int page){
        //https://api.douban.com/v2/movie/in_theaters?count=50
        StringBuffer sb = new StringBuffer();
        switch (type){
            case MoviesFragment.INTHEATERS:
                sb.append(Urls.MOVIES_LIST_INTHEATERS);
                break;
            case MoviesFragment.COMINGSOON:
                sb.append(Urls.MOVIES_LIST_COMINGSOON);
                break;
            case MoviesFragment.TOP250:
                sb.append(Urls.MOVIES_LIST_TOP250);
        }
        sb.append("?apikey=0b2bdeda43b5688921839c8ecb20399b&count="+
                String.valueOf(Urls.PAGE_SIZE)+"&start=").append(page*Urls.PAGE_SIZE);
        return sb.toString();
    }
}
