package cn.boji9.doubanmoive.movie.view.i;

import cn.boji9.doubanmoive.beans.Comment;

/**
 * Created by wax on 2017/9/12.
 */

public interface IReviewActivity {
    void onLoading(boolean b);
    void showReview(Comment comment);
}
