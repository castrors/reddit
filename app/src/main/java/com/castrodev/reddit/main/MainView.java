package com.castrodev.reddit.main;

import com.castrodev.reddit.model.RedditObject;

/**
 * Created by rodrigocastro on 18/04/17.
 */

interface MainView {

    void showProgress();
    void hideProgress();
    void setItems(RedditObject redditObject);
    void goToDetailActivity(RedditObject redditObject);
    void showError(int message);
    boolean isConnected();
}
