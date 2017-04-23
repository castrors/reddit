package com.castrodev.reddit.detail;

import com.castrodev.reddit.R;
import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.model.RedditParcelableObject;
import com.castrodev.reddit.repository.Interface.CommentRepository;
import com.castrodev.reddit.repository.Repository;

import java.util.List;

/**
 * Created by rodrigocastro on 20/04/17.
 */


class DetailPresenterImpl implements DetailPresenter, CommentRepository.OnFinishedListener {

    private DetailView detailView;
    private final String permalink;
    private CommentRepository repository = Repository.providesCommentRepository();

    DetailPresenterImpl(DetailView detailView, String permalink) {
        this.detailView = detailView;
        this.permalink = permalink;
    }

    @Override
    public void onResume() {
        if (detailView != null) {

            if (!detailView.isConnected()) {
                handleErrorCallback(R.string.internet_error);
                return;
            }

            detailView.showProgress();
        }

        repository.getComments(permalink, this);
    }

    @Override
    public void onFloatingActionButtonClicked(RedditParcelableObject redditParcelableObject) {
        if (detailView != null) {
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

    @Override
    public void onDefaultError() {
        handleErrorCallback(R.string.unexpected_error);
    }

    private void handleErrorCallback(int error) {
        if (detailView != null) {
            detailView.showError(error);
            detailView.hideProgress();
        }
    }

    public DetailView getDetailView() {
        return detailView;
    }
}
