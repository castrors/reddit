package com.castrodev.reddit.main;


import android.support.annotation.NonNull;

import com.castrodev.reddit.model.Data;
import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.model.RedditParcelableObject;

/**
 * Created by rodrigocastro on 18/04/17.
 */

class MainPresenterImpl implements MainPresenter, MainInteractor.OnFinishedListener {

    private MainView mainView;
    private MainInteractor mainInteractor;

    MainPresenterImpl(MainView mainView, MainInteractor mainInteractor) {
        this.mainView = mainView;
        this.mainInteractor = mainInteractor;
    }

    @Override
    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }

        mainInteractor.requestPosts("", "10", this);
    }

    @Override
    public void onItemClicked(final RedditObject redditObject) {
        if (mainView != null) {
            RedditParcelableObject parcelableObject = getRedditParcelableObject(redditObject);
            mainView.goToDetailActivity(parcelableObject);
        }
    }

    @NonNull
    private RedditParcelableObject getRedditParcelableObject(RedditObject redditObject) {

        RedditParcelableObject parcelableObject = new RedditParcelableObject();
        Data data = redditObject.getData();
        parcelableObject.setThumbnail(data.getThumbnail());
        parcelableObject.setPermalink(data.getPermalink());
        parcelableObject.setNumComments(data.getNumComments());
        parcelableObject.setTitle(data.getTitle());
        parcelableObject.setUrl(data.getUrl());
        parcelableObject.setAuthor(data.getAuthor());
        return parcelableObject;
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void paginate(String after) {
        mainInteractor.requestPosts(after, "10", this);
    }

    @Override
    public void onFinished(RedditObject redditObject) {
        if (mainView != null) {
            mainView.setItems(redditObject);
            mainView.hideProgress();
        }
    }
}
