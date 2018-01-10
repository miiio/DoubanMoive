package cn.boji9.doubanmoive.movie.view.impl;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aitangba.swipeback.SwipeBackActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.jaeger.library.StatusBarUtil;
import com.previewlibrary.GPreviewActivity;
import com.previewlibrary.ZoomMediaLoader;
import com.previewlibrary.enitity.ThumbViewInfo;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import cn.boji9.doubanmoive.R;
import cn.boji9.doubanmoive.beans.MovieBean;
import cn.boji9.doubanmoive.beans.MovieDetailBean;
import cn.boji9.doubanmoive.movie.adapter.PopReviewsAdapter;
import cn.boji9.doubanmoive.movie.presenter.i.IMovieDetailPresenter;
import cn.boji9.doubanmoive.movie.presenter.impl.MovieDetailPresenter;
import cn.boji9.doubanmoive.movie.view.i.IMovieDetailActivity;
import cn.boji9.doubanmoive.util.MyImageLoader;
import cn.boji9.doubanmoive.util.Util;
import cn.boji9.mynestedscrollview.MyNestedScrollView;
import cn.boji9.starbar.StarBar;
import cn.jzvd.JZVideoPlayer;
import cn.jzvd.JZVideoPlayerStandard;
import jp.wasabeef.glide.transformations.BlurTransformation;

/**
 * Created by wax on 2017/9/3.
 */

public class MovieDetailActivity extends SwipeBackActivity implements IMovieDetailActivity {
    private MovieBean.SubjectsBean mMovie;
    private ImageView mImageView;
    private ImageView mImageTopBg;
    private ImageView mImageBarBg;
    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private MyNestedScrollView mMyNestedScrollView;
    private LinearLayout mTopLinearLayout;
    private TextView mTitletv;
    private TextView mYearTypetv;
    private TextView mPubDatetv;
    private TextView mDurationstv;
    private TextView mAveragetv;
    private StarBar mStarBar;
    private TextView mRatingsCounttv;
    private TextView mSummarytv;

    private MovieDetailBean mMovieDetail = null;
    private int comment_page = 0;
    private int slidingDistance;
    private int imageBgHeight;
    private RecyclerView mRecyclerView_Comment;
    private LinearLayoutManager manager;
    private IMovieDetailPresenter mMovieDetailPresenter;
    private PopReviewsAdapter popReviewsAdapter;
    private RecyclerView castsRecyclerView;
    private LinearLayoutManager linearLayoutManagerCast;
    private ArrayList<ThumbViewInfo> mThumbViewInfoListCasts = new ArrayList<>();
    private ArrayList<ThumbViewInfo> mThumbViewInfoListPhoto = new ArrayList<>();

    private RecyclerView photoRecyclerView;
    private LinearLayoutManager linearLayoutManagerPhoto;

    private JZVideoPlayerStandard jzVideoPlayerStandard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moviedetail);
        ZoomMediaLoader.getInstance().init(new MyImageLoader());
        mMovie = (MovieBean.SubjectsBean) getIntent().getSerializableExtra("movie");
        mMovieDetailPresenter = new MovieDetailPresenter(this);
        jzVideoPlayerStandard = (JZVideoPlayerStandard)findViewById(R.id.jzVideoPlayerStandard);
        JZVideoPlayer.FULLSCREEN_ORIENTATION = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
        JZVideoPlayer.NORMAL_ORIENTATION = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        initView();
        initTitleBar();
        setImgHeaderBg();
        initPopReview();

        mMovieDetailPresenter.loadMovieDetail(mMovie);
    }

    private void showCasts() {
        mThumbViewInfoListCasts.clear();
        //导演
        for (MovieDetailBean.WritersBean writersBean:mMovieDetail.getWriters()) {
            mThumbViewInfoListCasts.add(new ThumbViewInfo(writersBean.getAvatars().getLarge()));
        }

        //演员
        for (MovieDetailBean.CastsBean casts:mMovieDetail.getCasts()) {
            mThumbViewInfoListCasts.add(new ThumbViewInfo(casts.getAvatars().getLarge()));
        }

        castsRecyclerView = (RecyclerView) findViewById(R.id.recycler_moviedetail_casts);
        linearLayoutManagerCast = new LinearLayoutManager(this);
        linearLayoutManagerCast.setOrientation(LinearLayoutManager.HORIZONTAL);
        castsRecyclerView.setLayoutManager(linearLayoutManagerCast);
        CommonAdapter<ThumbViewInfo> castCommonAdapter = new CommonAdapter<ThumbViewInfo>(this,R.layout.item_cast,mThumbViewInfoListCasts) {
            @Override
            protected void convert(ViewHolder holder, ThumbViewInfo thumbViewInfo, int position) {
                ImageView iv = (ImageView)holder.getView(R.id.iv_cast_avatar);
                if(position>=mMovieDetail.getWriters().size()) {
                    position -= mMovieDetail.getWriters().size();
                    Glide.with(MovieDetailActivity.this).load(mMovieDetail.getCasts().get(position).getAvatars().getMedium())
                            .into(iv);
                    holder.setText(R.id.tv_cast_name, mMovieDetail.getCasts().get(position).getName());
                }else{
                    Glide.with(MovieDetailActivity.this).load(mMovieDetail.getWriters().get(position).getAvatars().getMedium())
                            .into(iv);
                    holder.setText(R.id.tv_cast_name,mMovieDetail.getWriters().get(position).getName());
                }

            }
        };

        castCommonAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                computeBoundsBackward(linearLayoutManagerCast.findFirstVisibleItemPosition(),linearLayoutManagerCast);
                GPreviewActivity.startActivity(MovieDetailActivity.this, mThumbViewInfoListCasts,position);
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });

        castsRecyclerView.setAdapter(castCommonAdapter);

    }


    private void showPhotoAndVideo() {
        photoRecyclerView = (RecyclerView)findViewById(R.id.recycler_photoandvideo);
        linearLayoutManagerPhoto = new LinearLayoutManager(this);
        linearLayoutManagerPhoto.setOrientation(LinearLayoutManager.HORIZONTAL);
        photoRecyclerView.setLayoutManager(linearLayoutManagerPhoto);
        final int videoNum = mMovieDetail.getTrailers().size();

        //预告片
        for(MovieDetailBean.TrailersBean trailersBean:mMovieDetail.getTrailers()){
            mThumbViewInfoListPhoto.add(new ThumbViewInfo(trailersBean.getMedium()));
        }

        //剧照
        for(MovieDetailBean.PhotosBean photosBean:mMovieDetail.getPhotos()){
            mThumbViewInfoListPhoto.add(new ThumbViewInfo(photosBean.getImage()));
        }

        ((TextView)findViewById(R.id.tv_photoandvideo_top_number)).setText(" ( 预告片"+videoNum+" | 图片"+mMovieDetail.getPhotos().size()+" )");
        ((TextView)findViewById(R.id.tv_photoandvideo_top)).setText(mMovieDetail.getTitle()+"的视频和图片");
        CommonAdapter<ThumbViewInfo> photoVideoCommonAdapter =
                new CommonAdapter<ThumbViewInfo>(this,R.layout.item_photoandvideo,mThumbViewInfoListPhoto) {
            @Override
            protected void convert(ViewHolder holder, ThumbViewInfo thumbViewInfo, int position) {
                if(position<videoNum){
                    holder.setVisible(R.id.iv_playbtn,true);
                }else{
                    holder.setVisible(R.id.iv_playbtn,false);
                }
                ImageView iv = (ImageView)holder.getView(R.id.iv_photoandvideo);
                if(position<videoNum){
                    if(position<mMovieDetail.getTrailers().size()) {
                        Glide.with(MovieDetailActivity.this).load(mMovieDetail.getTrailers().get(position).getSmall())
                                .into(iv);
                    }else{
                        Glide.with(MovieDetailActivity.this).load("").into(iv);
                    }
                }else{
                    if(position<mMovieDetail.getPhotos().size()) {
                        Glide.with(MovieDetailActivity.this).load(mMovieDetail.getPhotos().get(position).getCover())
                                .into(iv);
                    }else{
                        Glide.with(MovieDetailActivity.this).load("").into(iv);
                    }
                }
            }
        };
        final int finalVideoNum = videoNum;
        photoVideoCommonAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                if(position >= finalVideoNum) {
                    computeBoundsBackwardPhoto(linearLayoutManagerCast.findFirstVisibleItemPosition());
                    GPreviewActivity.startActivity(MovieDetailActivity.this, mThumbViewInfoListPhoto, position);
                }else{
                    jzVideoPlayerStandard.setVisibility(View.VISIBLE);
                    jzVideoPlayerStandard.setUp(mMovieDetail.getTrailers().get(position).getResource_url(),
                            JZVideoPlayer.SCREEN_LAYOUT_NORMAL,mMovieDetail.getTrailers().get(position).getTitle());
                    jzVideoPlayerStandard.startWindowTiny();
                }
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });
        photoRecyclerView.setAdapter(photoVideoCommonAdapter);
    }
    /**
     ** 查找信息
     * 从第一个完整可见item逆序遍历，如果初始位置为0，则不执行方法内循环
     */
    private void computeBoundsBackward(int firstCompletelyVisiblePos,LinearLayoutManager linearLayoutManager) {
        for (int i = firstCompletelyVisiblePos; i < mThumbViewInfoListCasts.size(); i++) {
            View itemView = linearLayoutManager.findViewByPosition(i);
            Rect bounds = new Rect();
            if (itemView != null) {
                ImageView thumbView = (ImageView) itemView.findViewById(R.id.iv_cast_avatar);
                thumbView.getGlobalVisibleRect(bounds);
            }
            mThumbViewInfoListCasts.get(i).setBounds(bounds);
        }
    }

    private void computeBoundsBackwardPhoto(int firstCompletelyVisiblePos) {
        for (int i = firstCompletelyVisiblePos; i < mThumbViewInfoListCasts.size(); i++) {
            View itemView = linearLayoutManagerPhoto.findViewByPosition(i);
            Rect bounds = new Rect();
            if (itemView != null) {
                ImageView thumbView = (ImageView) itemView.findViewById(R.id.iv_photoandvideo);
                thumbView.getGlobalVisibleRect(bounds);
            }
            mThumbViewInfoListPhoto.get(i).setBounds(bounds);
        }
    }

    @Override
    public void onBackPressed() {
        if (JZVideoPlayer.backPress()) {
            return;
        }
        if(jzVideoPlayerStandard.getVisibility()!=View.GONE){
            JZVideoPlayer.releaseAllVideos();
            jzVideoPlayerStandard.setVisibility(View.GONE);
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        JZVideoPlayer.releaseAllVideos();
    }

    private void initPopReview() {
        mRecyclerView_Comment = (RecyclerView)findViewById(R.id.recycler_moviedetail_popular_reviews);
        manager = new LinearLayoutManager(this);
        mRecyclerView_Comment.setLayoutManager(manager);

        popReviewsAdapter = new PopReviewsAdapter(this);
        popReviewsAdapter.setItemClickListener(new PopReviewsAdapter.ItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MovieDetailActivity.this,ReviewActivity.class);
                intent.putExtra("review_id",mMovieDetail.getPopular_reviews().get(position).getId());
                startActivity(intent);
            }
        });

        mRecyclerView_Comment.setAdapter(popReviewsAdapter);
    }

    private void setImgHeaderBg() {
        Glide.with(this)
                .load(mMovie.getImages().getLarge())
                .bitmapTransform(new BlurTransformation(this,30,3))
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        return false;
                    }
                }).into(mImageTopBg);

        Glide.with(this)
                .load(mMovie.getImages().getLarge())
                .bitmapTransform(new BlurTransformation(this,30,3))
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        mImageBarBg.setImageAlpha(0);
                        return false;
                    }
                }).into(mImageBarBg);

        int toolbarHeight = mToolbar.getLayoutParams().height;
        int headerBgHeight = toolbarHeight + Util.getStatusBarHeight(this);
        mTopLinearLayout.setPadding(0,headerBgHeight+10,0,0);
        // 使背景图向上移动到图片的最底端，保留toolbar+状态栏的高度
        ViewGroup.LayoutParams params = mImageBarBg.getLayoutParams();
        ViewGroup.MarginLayoutParams ivTitleHeadBgParams = (ViewGroup.MarginLayoutParams) mImageBarBg.getLayoutParams();
        int marginTop = params.height - headerBgHeight;
        ivTitleHeadBgParams.setMargins(0, -marginTop, 0, 0);
        mImageBarBg.setVisibility(View.VISIBLE);

        // 设置状态栏透明
        mToolbar.setBackgroundColor(Color.TRANSPARENT);
        StatusBarUtil.setTranslucentForImageView(this,0,mToolbar);

        ViewGroup.LayoutParams imgItemBgparams = mImageTopBg.getLayoutParams();
        // 获得高斯图背景的高度
        imageBgHeight = imgItemBgparams.height;

        // 监听改变透明度
        initScrollViewListener();
    }

    private void initScrollViewListener() {
        final int titleBarAndStatusHeight =  mToolbar.getLayoutParams().height + Util.getStatusBarHeight(this);
        slidingDistance = imageBgHeight - titleBarAndStatusHeight;
        mMyNestedScrollView.setMyNestedScrollViewScrollChangeListen(new MyNestedScrollView.MyNestedScrollViewScrollChangeListen() {
            @Override
            public void onScrollChange(int scrollX, int scrollY, int oldscrollX, int oldscrollY) {
                //根据页面滑动距离改变Header透明度
                if(scrollY<0){
                    scrollY = 0;
                }
                float alpha = scrollY * 1.0f / (slidingDistance);
                Drawable drawable = mImageBarBg.getDrawable();
                //Log.v("v",scrollY+" "+slidingDistance);
                if(drawable!=null){
                    if(scrollY <= slidingDistance){
                        //渐变
                        drawable.mutate().setAlpha((int)(alpha*255));
                        mImageBarBg.setImageDrawable(drawable);
                        mToolbar.setTitle("");
                    }else{
                        drawable.mutate().setAlpha(255);
                        mImageBarBg.setImageDrawable(drawable);
                        if(scrollY>slidingDistance+120){
                            mToolbar.setTitle(mMovie.getTitle());
                        }else{
                            mToolbar.setTitle("");
                        }
                    }
                }
            }
        });

    }

    private void initView(){
        mImageView = (ImageView) findViewById(R.id.img_moviedetail_image);
        mToolbar = (Toolbar) findViewById(R.id.toolbar_moviedetail);
        mImageTopBg = (ImageView)findViewById(R.id.img_topBg);
        mImageBarBg = (ImageView)findViewById(R.id.img_barBg);
        mMyNestedScrollView = (MyNestedScrollView)findViewById(R.id.nsvScrollview_moviedetail);
        mTopLinearLayout = (LinearLayout)findViewById(R.id.Linearlayout_moviedetail_top);
        mTitletv = (TextView)findViewById(R.id.tv_moviedetail_title);
        mYearTypetv = (TextView)findViewById(R.id.tv_moviedetail_yearandtype);
        mPubDatetv = (TextView)findViewById(R.id.tv_moviedetail_pubdate);
        mDurationstv = (TextView)findViewById(R.id.tv_moviedetail_durations);
        mAveragetv = (TextView)findViewById(R.id.tv_moviedetail_average);
        mRatingsCounttv = (TextView)findViewById(R.id.tv_moviedetail_ratings_count);
        mStarBar = (StarBar)findViewById(R.id.starbar_moviedetail_score);
        mSummarytv = (TextView)findViewById(R.id.tv_moviedetail_summary);

        Glide.with(this).load(mMovie.getImages().getLarge()).into(mImageView);
    }


    private void initTitleBar(){
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        if (mActionBar != null) {
            //去除默认Title显示
            mActionBar.setDisplayShowTitleEnabled(false);
            mActionBar.setDisplayHomeAsUpEnabled(true);
            mActionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
        }
        //设置返回事件
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public void showDetail(MovieDetailBean movieDetail) {
        //Movie movie = movieDetail.getMovie();
        mMovieDetail = movieDetail;
        //mToolbar.setTitle(movie.getTitle());
        mTitletv.setText(movieDetail.getTitle());
        mYearTypetv.setText(movieDetail.getYear()+"/"+movieDetail.getGenresStr());
        mPubDatetv.setText("上映时间:"+movieDetail.getMainland_pubdate());
        mDurationstv.setText("片长:"+movieDetail.getDurations());
        mAveragetv.setText(movieDetail.getRating().getAverage()+"");
        mRatingsCounttv.setText(movieDetail.getRatings_count()+"人");
        mStarBar.setScore((float) movieDetail.getRating().getAverage());
        mSummarytv.setText(movieDetail.getSummary());
        findViewById(R.id.linelayout_moviedetail1).setVisibility(View.VISIBLE);
        showCasts();
        showPhotoAndVideo();
        addPopReview(movieDetail.getPopular_reviews());

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linelayout_moviedetail_allinfo);
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0,1);
        alphaAnimation.setDuration(600);
        ScaleAnimation scale = new ScaleAnimation(0.1f,1.0f,0.1f,1.0f,0.5f,0.5f);
        scale.setDuration(600);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scale);
        linearLayout.setVisibility(View.VISIBLE);
        linearLayout.startAnimation(animationSet);
    }


    @Override
    public void addPopReview(List<MovieDetailBean.PopularReviewsBean> popularReviewsBeen) {
        List<MovieDetailBean.PopularReviewsBean> commentList = mMovieDetail.getPopular_reviews();
        if(comment_page == 0){
            popReviewsAdapter.setmData(commentList);
        }else{
            commentList.addAll(popularReviewsBeen);
        }
        popReviewsAdapter.notifyDataSetChanged();
    }

}
