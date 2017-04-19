package com.castrodev.reddit.main;

import com.castrodev.reddit.model.RedditObject;

import java.util.List;

/**
 * Created by rodrigocastro on 18/04/17.
 */

public interface MainView {

    void showProgress();
    void hideProgress();
    void setItems(List<RedditObject> items);
    void showMessage(String message);
}
