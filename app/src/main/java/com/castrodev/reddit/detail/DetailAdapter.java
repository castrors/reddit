package com.castrodev.reddit.detail;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.castrodev.reddit.R;
import com.castrodev.reddit.model.RedditObject;

import org.threeten.bp.Instant;

import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by rodrigocastro on 21/04/17.
 */

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {

    private DetailPresenter presenter;
    private List<RedditObject> mDataset;
    private RedditObject parent;

    DetailAdapter(RedditObject parent, DetailPresenter presenter) {
        this.parent = parent;
        this.presenter = presenter;
        mDataset = parent.getData().getChildren();

    }

    @Override
    public DetailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View noteView = inflater.inflate(R.layout.item_comment, parent, false);

        return new ViewHolder(noteView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RedditObject redditObject = mDataset.get(position);
        holder.username.setText(redditObject.getData().getAuthor());
        holder.sentAt.setText(getTimeDifferenceInMinutes(redditObject.getData().getCreatedUtc()));
        holder.comment.setText(redditObject.getData().getBody());
    }

    private String getTimeDifferenceInMinutes(Long created) {
        Date comment = new Date(created*1000);
        Long difference =  Instant.now().toEpochMilli() - comment.getTime();
        return difference/1000/60+ " min ago";


    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_username)
        TextView username;
        @BindView(R.id.tv_sent_at)
        TextView sentAt;
        @BindView(R.id.tv_comment)
        TextView comment;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
