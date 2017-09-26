package cn.boji9.doubanmoive.movie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cn.boji9.doubanmoive.R;
import cn.boji9.doubanmoive.beans.Comment;
import cn.boji9.doubanmoive.beans.MovieDetailBean;
import cn.boji9.starbar.StarBar;

/**
 * Created by wax on 2017/9/9.
 */

public class PopReviewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<MovieDetailBean.PopularReviewsBean> mData;
    private ItemClickListener itemClickListener;

    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setmData(List<MovieDetailBean.PopularReviewsBean> mData) {
        this.mData = mData;
        this.notifyItemInserted(0);
    }

    public List<MovieDetailBean.PopularReviewsBean> getmData() {
        return mData;
    }

    public PopReviewsAdapter(Context mContext) {
        this.mContext = mContext;
        mData = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment,parent,false);
        return new ItemHolder(v);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MovieDetailBean.PopularReviewsBean comment = mData.get(position);
        View v = ((ItemHolder)holder).view;
        if(position==0){
            v.findViewById(R.id.linelayout_comment_top).setVisibility(View.VISIBLE);
            ((TextView)v.findViewById(R.id.tv_comment_top)).setText("热评");
        }

        ((TextView)v.findViewById(R.id.tv_comment_content)).setText(comment.getSummary());
        Float ratting = Float.valueOf(comment.getRating().getValue());
        ratting = ratting * 10f / comment.getRating().getMax();
        ((TextView)v.findViewById(R.id.tv_comment_date)).setText(ratting+"");
        ((TextView)v.findViewById(R.id.tv_comment_author)).setText(comment.getAuthor().getName());
        ((StarBar)v.findViewById(R.id.starbar_comment)).setScore(ratting);
        Glide.with(mContext)
                .load(comment.getAuthor().getAvatar())
                .into(((ImageView)v.findViewById(R.id.iv_comment_avator)));

        v.findViewById(R.id.linelayout_comment_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClickListener.onItemClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder{
        public View view;
        public ItemHolder(View itemView) {
            super(itemView);
            view = itemView;
        }
    }

    public interface ItemClickListener{
        void onItemClick(int position);
    }


}
