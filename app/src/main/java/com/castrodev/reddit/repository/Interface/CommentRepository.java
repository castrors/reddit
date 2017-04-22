package com.castrodev.reddit.repository.Interface;

import com.castrodev.reddit.model.RedditObject;

import java.util.List;

/**
 * Created by rodrigocastro on 21/04/17.
 */

public abstract class CommentRepository {

    public interface OnFinishedListener {
        void onFinished(List<RedditObject> items);
    }

    public abstract void getComments(String permalink, final OnFinishedListener listener);
}
