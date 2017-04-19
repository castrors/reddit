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
    private List<RedditObject> mDataset;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    MainAdapter(List<RedditObject> myDataset) {
        mDataset = myDataset;
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
        holder.mTextView.setText(mDataset.get(position).getData().getTitle());

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
