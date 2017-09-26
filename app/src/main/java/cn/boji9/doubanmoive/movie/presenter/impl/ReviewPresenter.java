package cn.boji9.doubanmoive.movie.presenter.impl;

import cn.boji9.doubanmoive.beans.Comment;
import cn.boji9.doubanmoive.movie.model.i.OnLoadReviewListener;
import cn.boji9.doubanmoive.movie.model.impl.ReviewModel;
import cn.boji9.doubanmoive.movie.view.i.IReviewActivity;
import cn.boji9.doubanmoive.movie.view.impl.ReviewActivity;

/**
 * Created by wax on 2017/9/12.
 */

public class ReviewPresenter {
    private ReviewModel reviewModel;
    private IReviewActivity iReviewActivity;

    public ReviewPresenter(IReviewActivity iReviewActivity) {
        this.iReviewActivity = iReviewActivity;
        reviewModel = new ReviewModel();
    }

    public void loadReview(String id){
        iReviewActivity.onLoading(true);
        String url = "https://movie.douban.com/review/"+id+"/";
        iReviewActivity.onLoading(true);
        reviewModel.loadReview(url, new OnLoadReviewListener() {
            @Override
            public void onSuccess(Comment comment) {
                iReviewActivity.showReview(comment);
                iReviewActivity.onLoading(false);
            }

            @Override
            public void onFailure(Exception e) {

            }
        });

    }
}
