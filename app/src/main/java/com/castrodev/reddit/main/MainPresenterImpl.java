package com.castrodev.reddit.main;


import com.castrodev.reddit.model.RedditObject;

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
    public void onItemClicked(RedditObject redditObject) {
        if (mainView != null) {
            mainView.showMessage(String.format("Clicked: %s ", redditObject.getData().getTitle()));
        }
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
