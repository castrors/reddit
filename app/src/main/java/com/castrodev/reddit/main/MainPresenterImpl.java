package com.castrodev.reddit.main;


import android.util.Log;

import com.castrodev.reddit.api.ApiClient;
import com.castrodev.reddit.api.ApiService;
import com.castrodev.reddit.model.RedditObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
            mainView.showMessage(String.format("Clicked: %s ", redditObject.getData().getTitle()));
        }

        ApiService apiService =
                ApiClient.getClient().create(ApiService.class);

        Call<List<RedditObject>> call = apiService.fetchComments(redditObject.getData().getPermalink());
        call.enqueue(new Callback<List<RedditObject>>() {
            @Override
            public void onResponse(Call<List<RedditObject>> call, Response<List<RedditObject>> response) {
                List<RedditObject> redditList = response.body();
            }

            @Override
            public void onFailure(Call<List<RedditObject>> call, Throwable t) {
                Log.d("log", t.getMessage());
            }
        });
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
