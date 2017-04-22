package com.castrodev.reddit.repository.Interface;

import com.castrodev.reddit.model.RedditObject;

/**
 * Created by rodrigocastro on 21/04/17.
 */

public abstract class PostRespository {

    public interface OnFinishedListener {
        void onFinished(RedditObject items);
    }

    public abstract void getPosts(String after, String limit, OnFinishedListener listener);
}
