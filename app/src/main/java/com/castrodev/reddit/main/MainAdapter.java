package com.castrodev.reddit.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.castrodev.reddit.model.RedditObject;

import java.util.List;

/**
 * Created by rodrigocastro on 18/04/17.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private final ScrollLastItemCallback callback;
    private List<RedditObject> mDataset;
    private RedditObject parent;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        ViewHolder(TextView v) {
            super(v);
            mTextView = v;

        }
    }

    MainAdapter(RedditObject parent, ScrollLastItemCallback callback) {
        this.parent = parent;
        this.callback = callback;
        mDataset = parent.getData().getChildren();

    }

    public void concatenateDataSet(RedditObject redditObject) {
        mDataset.addAll(redditObject.getData().getChildren());
        parent = redditObject;
        parent.getData().setChildren(mDataset);
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.test_list_item, parent, false);
        ViewHolder vh = new ViewHolder((TextView) v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if(isLast(position)){
            callback.onScrollLastItemCallback(parent.getData().getAfter());
        }
        holder.mTextView.setText(mDataset.get(position).getData().getTitle());

    }

    private boolean isLast(int position) {
        return mDataset.get(position).getData().getName().equals(parent.getData().getAfter());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
