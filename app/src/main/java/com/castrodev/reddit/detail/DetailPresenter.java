package com.castrodev.reddit.detail;

/**
 * Created by rodrigocastro on 20/04/17.
 */

public interface DetailPresenter {

    void onResume(String permalink);
    void onDestroy();
}
