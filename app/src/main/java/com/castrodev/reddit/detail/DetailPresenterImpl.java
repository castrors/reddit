package com.castrodev.reddit.detail;

import com.castrodev.reddit.model.RedditObject;

import java.util.List;

/**
 * Created by rodrigocastro on 20/04/17.
 */


class DetailPresenterImpl implements DetailPresenter, DetailInteractor.OnFinishedListener {

    private DetailView detailView;
    private DetailInteractor detailInteractor;

    DetailPresenterImpl(DetailView detailView, DetailInteractor detailInteractor) {
        this.detailView = detailView;
        this.detailInteractor = detailInteractor;
    }

    @Override
    public void onResume(String permalink) {
        if (detailView != null) {
            detailView.showProgress();
        }
        detailInteractor.requestComments(permalink, this);
    }

    @Override
    public void onDestroy() {
        detailView = null;
    }

    @Override
    public void onFinished(List<RedditObject> items) {
        if (detailView != null) {
            detailView.setItems(items);
            detailView.hideProgress();
        }
    }
}
