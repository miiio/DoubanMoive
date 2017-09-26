package cn.boji9.doubanmoive.movie.model.impl;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import cn.boji9.doubanmoive.beans.MovieDetailBean;
import cn.boji9.doubanmoive.movie.model.i.IMovieDetailModel;
import cn.boji9.doubanmoive.movie.model.i.OnLoadMovieDetailListener;
import cn.boji9.doubanmoive.movie.model.i.OnloadMoviePopReview;
import cn.boji9.doubanmoive.util.JsonUtil;
import okhttp3.Call;

/**
 * Created by wax on 2017/9/3.
 */

public class MovieDetailModel implements IMovieDetailModel {

    @Override
    public void loadMovieDetail(String url, final OnLoadMovieDetailListener onLoadMovieDetailListener) {

        OkHttpUtils.get().url(url)
                .build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                onLoadMovieDetailListener.onFailure(e);
            }

            @Override
            public void onResponse(String response, int id) {
                Gson gson = new Gson();
                MovieDetailBean movieDetailBean = gson.fromJson(response,MovieDetailBean.class);
                onLoadMovieDetailListener.onSuccess(movieDetailBean);
            }
        });
    }
}
