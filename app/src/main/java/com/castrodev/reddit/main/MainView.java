package com.castrodev.reddit.main;

import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.model.RedditParcelableObject;

/**
 * Created by rodrigocastro on 18/04/17.
 */

interface MainView {

    void showProgress();
    void hideProgress();
    void setItems(RedditObject redditObject);
    void goToDetailActivity(RedditParcelableObject redditParcelableObject);
}
