package com.castrodev.reddit.detail;

import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.model.RedditParcelableObject;

import java.util.List;

/**
 * Created by rodrigocastro on 20/04/17.
 */


class DetailPresenterImpl implements DetailPresenter, DetailInteractor.OnFinishedListener {

    private DetailView detailView;
    private DetailInteractor detailInteractor;
    private final String permalink;

    DetailPresenterImpl(DetailView detailView, DetailInteractor detailInteractor, String permalink) {
        this.detailView = detailView;
        this.detailInteractor = detailInteractor;
        this.permalink = permalink;
    }

    @Override
    public void onResume() {
        if (detailView != null) {
            detailView.showProgress();
        }
        detailInteractor.requestComments(permalink, this);
    }

    @Override
    public void onFloatingActionButtonClicked(RedditParcelableObject redditParcelableObject) {
        if(detailView !=null){
            detailView.openPostLink(redditParcelableObject.getUrl());
        }
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

    public DetailView getDetailView() {
        return detailView;
    }
}
