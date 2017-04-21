package com.castrodev.reddit.detail;

import com.castrodev.reddit.model.RedditObject;

import java.util.List;

/**
 * Created by rodrigocastro on 20/04/17.
 */

public interface DetailInteractor {

    interface OnFinishedListener {
        void onFinished(List<RedditObject> items);
    }

    void requestComments(String permalink, OnFinishedListener listener);
}
