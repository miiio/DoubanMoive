package cn.boji9.doubanmoive.movie.view.impl;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.aitangba.swipeback.SwipeBackActivity;
import com.previewlibrary.GPreviewActivity;
import com.previewlibrary.enitity.ThumbViewInfo;
import com.zzhoujay.richtext.RichText;
import com.zzhoujay.richtext.callback.OnImageClickListener;

import java.util.ArrayList;
import java.util.List;

import cn.boji9.doubanmoive.R;
import cn.boji9.doubanmoive.beans.Comment;
import cn.boji9.doubanmoive.movie.presenter.impl.ReviewPresenter;
import cn.boji9.doubanmoive.movie.view.i.IReviewActivity;

/**
 * Created by wax on 2017/9/12.
 */

public class ReviewActivity extends SwipeBackActivity implements IReviewActivity, OnImageClickListener {
    private Toolbar toolbar;
    private ActionBar actionBar;
    private String mReviewId;
    private ReviewPresenter reviewPresenter;
    private ArrayList<ThumbViewInfo> thumbViewInfo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        mReviewId = getIntent().getStringExtra("review_id");
        initBar();

        reviewPresenter = new ReviewPresenter(this);
        reviewPresenter.loadReview(mReviewId);
    }

    private void initBar() {
        toolbar = (Toolbar)findViewById(R.id.toolbar_view);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onLoading(boolean b) {
        ((SwipeRefreshLayout)findViewById(R.id.swiperefresh_review)).setRefreshing(b);
    }

    @Override
    public void showReview(Comment comment) {
        toolbar.setTitle(comment.getAuthor().getName());

        RichText.fromHtml(comment.getContent()).imageClick(this).into((TextView) findViewById(R.id.tv_review_content));
    }

    private Rect imgBounds = new Rect();
    @Override
    public void imageClicked(List<String> imageUrls, int position) {
        if(thumbViewInfo == null){
            thumbViewInfo = new ArrayList<>();
            for(String url:imageUrls){
                thumbViewInfo.add(new ThumbViewInfo(url));
            }
        }
        GPreviewActivity.startActivity(ReviewActivity.this,thumbViewInfo,position);
    }


}
