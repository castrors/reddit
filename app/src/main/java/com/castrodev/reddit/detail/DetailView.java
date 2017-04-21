package com.castrodev.reddit.detail;

import com.castrodev.reddit.model.RedditObject;

import java.util.List;

/**
 * Created by rodrigocastro on 20/04/17.
 */

public interface DetailView {

    void showProgress();
    void hideProgress();
    void setItems(List<RedditObject> redditObjectList);
}
