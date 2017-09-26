package cn.boji9.doubanmoive.movie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import cn.boji9.doubanmoive.R;
import cn.boji9.doubanmoive.beans.Movie;
import cn.boji9.doubanmoive.beans.MovieBean;
import cn.boji9.starbar.StarBar;

/**
 * Created by wax on 2017/9/1.
 */

public class MoviesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 675;
    private static final int TYPE_FOOTER = 161;

    private List<MovieBean.SubjectsBean> mData;
    private boolean isShowFooter = false;
    private Context mContext;
    private OnItemClickListener onItemClickListener;

    public MoviesAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<MovieBean.SubjectsBean> data){
        this.mData = data;
        this.notifyItemInserted(0);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == TYPE_ITEM){
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_movie,parent,false);
            return new ItemHolder(v);
        }else{
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_movie_footer,parent,false);
            return new FooterItemHolder(v);
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if(holder instanceof ItemHolder){
            final MovieBean.SubjectsBean mv = mData.get(position);
            if(mv == null){
                return;
            }
            ((ItemHolder)holder).mTitle.setText(mv.getTitle());
            if(mv.getPubdates().size()>0) {
                ((ItemHolder) holder).mDate.setText(mv.getPubdates().get(0));
            }else{
                ((ItemHolder) holder).mDate.setText("未知");
            }
            ((ItemHolder)holder).mCasts.setText("主演:"+mv.getCastsStr());
            if(mv.getDirectors().size()>0) {
                ((ItemHolder) holder).mDirector.setText("导演:" + mv.getDirectorStr());
            }else{
                ((ItemHolder) holder).mDirector.setText("导演:未知");
            }
            //((ItemHolder)holder).mDirector.setText(mv.getDirector());
            ((ItemHolder)holder).mGenres.setText(mv.getGenresStr());
            ((ItemHolder)holder).mScore.setText(mv.getRating().getAverage()+"");
            ((ItemHolder)holder).mStarScore.setScore((float) mv.getRating().getAverage());
            Glide.with(mContext)
                    .load(mv.getImages().getLarge())
                    .into(((ItemHolder)holder).mImage);
            ((ItemHolder)holder).mLinearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onClick(position,mv,((ItemHolder)holder).mItemView);
                }
            });

        }
    }



    @Override
    public int getItemCount() {

        if(mData == null){
            return isShowFooter?1:0;
        }
        return mData.size() + (isShowFooter?1:0);
    }

    @Override
    public int getItemViewType(int position) {
        if(!isShowFooter){
            return TYPE_ITEM;
        }
        if(position == getItemCount()-1){
            return TYPE_FOOTER;
        }else{
            return TYPE_ITEM;
        }
    }

    public void isShowFooter(boolean showFooter){
        this.isShowFooter = showFooter;
    }

    public boolean isShowFooter(){
        return this.isShowFooter;
    }

    public class FooterItemHolder extends RecyclerView.ViewHolder{

        public FooterItemHolder(View itemView) {
            super(itemView);
        }
    }

    public class ItemHolder extends RecyclerView.ViewHolder{

        public TextView mTitle;
        public TextView mDate;
        public TextView mCasts;
        public TextView mGenres;
        public TextView mDirector;
        public TextView mScore;
        public ImageView mImage;
        public StarBar mStarScore;
        public LinearLayout mLinearLayout;
        public View mItemView;

        public ItemHolder(View itemView) {
            super(itemView);
            mTitle = (TextView)itemView.findViewById(R.id.tv_movieitem_title);
            mDate = (TextView)itemView.findViewById(R.id.tv_movieitem_date);
            mGenres = (TextView)itemView.findViewById(R.id.tv_movieitem_genres);
            mDirector = (TextView)itemView.findViewById(R.id.tv_movieitem_directors);
            mCasts = (TextView)itemView.findViewById(R.id.tv_movieitem_casts);
            mScore = (TextView)itemView.findViewById(R.id.tv_movieitem_score);
            mImage = (ImageView)itemView.findViewById(R.id.iv_movieitem_image);
            mStarScore = (StarBar)itemView.findViewById(R.id.starbar_score);
            mLinearLayout = (LinearLayout)itemView.findViewById(R.id.Linearlayout_movie_item);
            this.mItemView = itemView;
        }
    }

    public interface OnItemClickListener{
        public void onClick(int position, MovieBean.SubjectsBean movie, View view);
    }
}
