package com.castrodev.reddit.main;

import com.castrodev.reddit.model.RedditObject;

/**
 * Created by rodrigocastro on 18/04/17.
 */

public class MainPresenterImpl implements MainPresenter, MainInteractor.OnFinishedListener {

    private MainView mainView;
    private MainInteractor mainInteractor;

    public MainPresenterImpl(MainView mainView, MainInteractor mainInteractor) {
        this.mainView = mainView;
        this.mainInteractor = mainInteractor;
    }

    @Override
    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }

        mainInteractor.requestPosts(this);
    }

    @Override
    public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished(RedditObject redditObject) {
        if (mainView != null) {
            mainView.setItems(redditObject.getData().getChildren());
            mainView.hideProgress();
        }
    }

    public MainView getMainView() {
        return mainView;
    }
}
