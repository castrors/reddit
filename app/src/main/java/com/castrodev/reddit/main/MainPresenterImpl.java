package com.castrodev.reddit.main;


import android.support.annotation.NonNull;

import com.castrodev.reddit.R;
import com.castrodev.reddit.model.Data;
import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.model.RedditParcelableObject;
import com.castrodev.reddit.repository.Interface.PostRespository;
import com.castrodev.reddit.repository.Repository;

/**
 * Created by rodrigocastro on 18/04/17.
 */

class MainPresenterImpl implements MainPresenter, PostRespository.OnFinishedListener {

    private MainView mainView;
    private PostRespository respository = Repository.providesPostRepository();

    MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void onResume() {
        if (mainView != null) {

            if (!mainView.isConnected()) {
                handleErrorCallback(R.string.internet_error);
                return;
            }
            mainView.showProgress();
        }
        respository.getPosts("", "10", this);
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
        if (redditObject != null && redditObject.getData() != null) {
            Data data = redditObject.getData();
            parcelableObject.setThumbnail(data.getThumbnail());
            parcelableObject.setPermalink(data.getPermalink());
            parcelableObject.setNumComments(data.getNumComments());
            parcelableObject.setTitle(data.getTitle());
            parcelableObject.setUrl(data.getUrl());
            parcelableObject.setAuthor(data.getAuthor());
        }
        return parcelableObject;
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void paginate(String after) {
        respository.getPosts(after, "10", this);
    }

    @Override
    public void onFinished(RedditObject redditObject) {
        if (mainView != null) {
            mainView.setItems(redditObject);
            mainView.hideProgress();
        }
    }

    @Override
    public void onDefaultError() {
        handleErrorCallback(R.string.unexpected_error);
    }

    private void handleErrorCallback(int error) {
        if (mainView != null) {
            mainView.showError(error);
            mainView.hideProgress();
        }
    }

    public MainView getMainView() {
        return mainView;
    }
}
