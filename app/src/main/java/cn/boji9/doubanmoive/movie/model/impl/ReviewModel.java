package cn.boji9.doubanmoive.movie.model.impl;


import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import cn.boji9.doubanmoive.movie.model.i.OnLoadReviewListener;
import cn.boji9.doubanmoive.util.Util;
import okhttp3.Call;

public class ReviewModel {
    public ReviewModel() {
    }

    public void loadReview(String url, final OnLoadReviewListener onLoadReviewListener){
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                onLoadReviewListener.onFailure(e);
            }

            @Override
            public void onResponse(String response, int id) {
                onLoadReviewListener.onSuccess(Util.readCommentFromHtml(response));
            }
        });
    }
}
