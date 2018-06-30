package release.admin.com.companysampleproject.newslist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import release.admin.com.companysampleproject.R;

public class NewsListRecyclerAdapter extends
        RecyclerView.Adapter<NewsListRecyclerAdapter.ViewHolder> {
    private List<NewsModel> mNewsModelList;
    private Context mContext;
    private OnAdpterItemClickListner mOnAdpterItemClickListner;

    public NewsListRecyclerAdapter(List<NewsModel> newsModelList, Context context,
            NewsListFragment newsListFragment) {
        this.mNewsModelList = newsModelList;
        this.mContext = context;
        this.mOnAdpterItemClickListner = newsListFragment;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
            int viewType) {
        View newsItemView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.test_list_row, parent, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        newsItemView.setLayoutParams(lp);
        return new ViewHolder(newsItemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NewsModel newsModel = mNewsModelList.get(position);
        holder.arrowImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnAdpterItemClickListner != null) {
                    mOnAdpterItemClickListner.onEmojiClick(view);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mNewsModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView, snippetTextView;
        ImageView arrowImageView, iconImageView;

        ViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.titleText);
            snippetTextView = (TextView) itemView.findViewById(R.id.snippetText);
            arrowImageView = (ImageView) itemView.findViewById(R.id.arrowImageView);
            iconImageView = (ImageView) itemView.findViewById(R.id.iconImageView);
        }
    }

    /**
     * interface for adapter item click event
     */
    public interface OnAdpterItemClickListner{
        /**
         * emoji click event
         * @param anchorView
         */
        void onEmojiClick(View anchorView);
    }
}
