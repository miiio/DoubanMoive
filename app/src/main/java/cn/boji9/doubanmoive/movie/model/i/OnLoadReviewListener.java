package cn.boji9.doubanmoive.movie.model.i;

import java.util.List;

import cn.boji9.doubanmoive.beans.Comment;

/**
 * Created by wax on 2017/9/12.
 */

public interface OnLoadReviewListener {
    void onSuccess(Comment comment);

    void onFailure(Exception e);
}
