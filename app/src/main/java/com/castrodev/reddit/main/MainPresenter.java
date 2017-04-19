package com.castrodev.reddit.main;

import com.castrodev.reddit.model.RedditObject;

/**
 * Created by rodrigocastro on 18/04/17.
 */

interface MainPresenter {

    void onResume();
    void onItemClicked(RedditObject position);
    void onDestroy();
    void paginate(String after);
}
