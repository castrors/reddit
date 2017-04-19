package com.castrodev.reddit.main;

/**
 * Created by rodrigocastro on 18/04/17.
 */

interface MainPresenter {

    void onResume();
    void onItemClicked(int position);
    void onDestroy();
    void paginate(String after);
}
