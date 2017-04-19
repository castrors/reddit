package com.castrodev.reddit.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.castrodev.reddit.R;
import com.castrodev.reddit.model.RedditObject;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by rodrigocastro on 18/04/17.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private final RedditObjectListener callback;
    private List<RedditObject> mDataset;
    private RedditObject parent;

    MainAdapter(RedditObject parent, RedditObjectListener callback) {
        this.parent = parent;
        this.callback = callback;
        mDataset = parent.getData().getChildren();

    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View noteView = inflater.inflate(R.layout.item_posts, parent, false);

        return new ViewHolder(noteView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RedditObject redditObject = mDataset.get(position);
        if (isLast(position)) {
            callback.onScrollLastItemCallback(parent.getData().getAfter());
        }
        holder.title.setText(mDataset.get(position).getData().getTitle());
        holder.description.setText(mDataset.get(position).getData().getUrl());

        Context context = holder.thumbnail.getContext();
        Picasso.with(context)
                .load(redditObject.getData().getThumbnail())
                .error(R.drawable.ic_error_image)
                .into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    private boolean isLast(int position) {
        return mDataset.get(position).getData().getName().equals(parent.getData().getAfter());
    }

    void concatenateDataSet(RedditObject redditObject) {
        mDataset.addAll(redditObject.getData().getChildren());
        parent = redditObject;
        parent.getData().setChildren(mDataset);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.tv_post_title)
        TextView title;
        @BindView(R.id.tv_post_subtitle)
        TextView description;
        @BindView(R.id.iv_post_thumb)
        ImageView thumbnail;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            RedditObject redditObject = mDataset.get(position);
            callback.onRedditObjectClick(redditObject);
        }
    }
}
