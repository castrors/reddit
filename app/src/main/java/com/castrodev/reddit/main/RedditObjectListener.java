package com.castrodev.reddit.main;

import com.castrodev.reddit.model.RedditObject;

/**
 * Created by rodrigocastro on 18/04/17.
 */

interface RedditObjectListener {

    void onRedditObjectClick(RedditObject redditObject);

    void onScrollLastItemCallback(String after);
}
