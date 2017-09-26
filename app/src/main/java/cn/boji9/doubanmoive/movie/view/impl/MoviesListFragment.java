package cn.boji9.doubanmoive.movie.view.impl;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import cn.boji9.doubanmoive.R;
import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieBean;
import cn.boji9.doubanmoive.movie.adapter.MoviesAdapter;
import cn.boji9.doubanmoive.movie.presenter.i.IMovesListPresenter;
import cn.boji9.doubanmoive.movie.presenter.impl.MoviesListPresenter;
import cn.boji9.doubanmoive.movie.view.i.IMoviesListFragment;

/**
 * Created by wax on 2017/9/1.
 */

public class MoviesListFragment extends Fragment
        implements SwipeRefreshLayout.OnRefreshListener,IMoviesListFragment {

    private int mType;
    private int pageIndex = 0;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;
    private IMovesListPresenter moviesListPresenter;
    private List<MovieBean.SubjectsBean> mData;
    private MoviesAdapter mMoviesAdapter;
    private LinearLayoutManager mLayoutManager;

    public static MoviesListFragment newInstance(int type){
        MoviesListFragment fragment = new MoviesListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type",type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mType = getArguments().getInt("type");
        moviesListPresenter = new MoviesListPresenter(this);
        mData = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movielist,null);

        mSwipeRefreshLayout = view.findViewById(R.id.swiperefresh_movielist);
        mSwipeRefreshLayout.setOnRefreshListener(this);

        mRecyclerView = view.findViewById(R.id.rcview_movielist);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mMoviesAdapter = new MoviesAdapter(getActivity().getApplicationContext());
        mMoviesAdapter.setOnItemClickListener(new MoviesAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position, MovieBean.SubjectsBean movie, View view) {
                Intent intent = new Intent(getActivity(),MovieDetailActivity.class);
                intent.putExtra("movie",movie);
                ImageView imageView = view.findViewById(R.id.iv_movieitem_image);
                startActivity(intent,
                        ActivityOptions.makeSceneTransitionAnimation(getActivity(),imageView,"img_movie").toBundle());
            }
        });
        mRecyclerView.setAdapter(mMoviesAdapter);
        mRecyclerView.addOnScrollListener(onScrollListener);
        onRefresh();
        return view;
    }

    private RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() {
        private int lastItem;
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (mData.size()>0 && newState == RecyclerView.SCROLL_STATE_IDLE
                    && lastItem + 1 == mMoviesAdapter.getItemCount()
                    && mMoviesAdapter.isShowFooter() && !mSwipeRefreshLayout.isRefreshing()) {
                //加载更多
                pageIndex++;
                moviesListPresenter.loadMoviesList(mType, pageIndex);
            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            lastItem = mLayoutManager.findLastVisibleItemPosition();
        }
    };

    @Override
    public void onRefresh() {
        pageIndex = 0;
        moviesListPresenter.loadMoviesList(mType,pageIndex);
    }

    @Override
    public void addMovies(List<MovieBean.SubjectsBean> movieList) {
        mMoviesAdapter.isShowFooter(true);
        if(pageIndex == 0){
            mData.clear();
            mData.addAll(movieList);
            mMoviesAdapter.setData(mData);
        }else{
            int position = mData.size();
            mData.addAll(movieList);
            //如果没有更多数据了,则隐藏footer布局
            if(movieList.size()==0){
                mMoviesAdapter.isShowFooter(false);
                mMoviesAdapter.notifyDataSetChanged();
                return;
            }
            mMoviesAdapter.notifyItemInserted(position);
            //mMoviesAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void showProgress() {
        mSwipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideProgress() {
        mSwipeRefreshLayout.setRefreshing(false);
    }
}
