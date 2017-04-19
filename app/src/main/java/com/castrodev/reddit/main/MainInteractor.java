package com.castrodev.reddit.main;

import com.castrodev.reddit.model.RedditObject;

/**
 * Created by rodrigocastro on 18/04/17.
 */

public interface MainInteractor {

    interface OnFinishedListener {
        void onFinished(RedditObject items);
    }

    void requestPosts(String after, String limit, OnFinishedListener listener);
}
