package com.castrodev.reddit.detail;

import com.castrodev.reddit.model.RedditParcelableObject;

/**
 * Created by rodrigocastro on 20/04/17.
 */

public interface DetailPresenter {

    void onResume();
    void onFloatingActionButtonClicked(RedditParcelableObject redditParcelableObject);
    void onDestroy();
}
