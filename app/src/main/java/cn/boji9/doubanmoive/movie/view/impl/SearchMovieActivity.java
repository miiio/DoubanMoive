package cn.boji9.doubanmoive.movie.view.impl;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.aitangba.swipeback.SwipeBackActivity;

import java.util.ArrayList;
import java.util.List;

import cn.boji9.doubanmoive.R;
import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieBean;
import cn.boji9.doubanmoive.movie.adapter.MoviesAdapter;
import cn.boji9.doubanmoive.movie.presenter.impl.SearchMoviePresenter;
import cn.boji9.doubanmoive.movie.view.i.ISearchMovieActivity;

/**
 * Created by wax on 2017/9/5.
 */

public class SearchMovieActivity extends SwipeBackActivity implements ISearchMovieActivity {

    private SearchMoviePresenter mSearchMoviePresenter;
    private String mKeyWord;
    private ActionBar mActionBar;
    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager manager;
    private List<MovieBean.SubjectsBean> mData = new ArrayList<>();
    private MoviesAdapter mAdapter;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private int pageIndex = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchmovie);
        mKeyWord = getIntent().getStringExtra("keyword");

        mSearchMoviePresenter = new SearchMoviePresenter(this);
        mToolbar = (Toolbar)findViewById(R.id.toolbar_view);
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        mActionBar.setTitle("搜索\""+mKeyWord+"\"");

        mRecyclerView = (RecyclerView)findViewById(R.id.rcview_searchresult);
        manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);
        mAdapter = new MoviesAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setOnScrollListener(onScrollListener);
        mSwipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swiperefresh_searchmovie);

        mAdapter.setOnItemClickListener(new MoviesAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position, MovieBean.SubjectsBean movie, View view) {
                Intent intent = new Intent(SearchMovieActivity.this,MovieDetailActivity.class);
                intent.putExtra("movie",movie);
                ImageView imageView = view.findViewById(R.id.iv_movieitem_image);
                startActivity(intent,
                        ActivityOptions.makeSceneTransitionAnimation(SearchMovieActivity.this,imageView,"img_movie").toBundle());

            }
        });
        mSearchMoviePresenter.search(mKeyWord,pageIndex);

    }

    private RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() {
        private int lastItem;
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (mData.size()>0 && newState == RecyclerView.SCROLL_STATE_IDLE
                    && lastItem + 1 == mAdapter.getItemCount()
                    && mAdapter.isShowFooter()) {
                //加载更多
                pageIndex++;
                mSearchMoviePresenter.search(mKeyWord,pageIndex);
            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            lastItem = manager.findLastVisibleItemPosition();
        }
    };


    @Override
    public void showSearchResult(List<MovieBean.SubjectsBean> result) {
        mAdapter.isShowFooter(true);
        if(pageIndex == 0){
            mData.clear();
            mData.addAll(result);
            mAdapter.setData(mData);
        }else{
            int position = mData.size();
            mData.addAll(result);
            //如果没有更多数据了,则隐藏footer布局
            if(result.size()==0){
                mAdapter.isShowFooter(false);
                mAdapter.notifyDataSetChanged();
                return;
            }
            mAdapter.notifyItemInserted(position);
            //mMoviesAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void setRefresh(boolean is) {
        mSwipeRefreshLayout.setRefreshing(is);
    }
}
