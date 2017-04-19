package com.castrodev.reddit.main;

import com.castrodev.reddit.api.ApiClient;
import com.castrodev.reddit.api.ApiService;
import com.castrodev.reddit.model.RedditObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rodrigocastro on 18/04/17.
 */

public class MainInteractorImpl implements MainInteractor {
    @Override
    public void requestPosts(final OnFinishedListener listener) {
        ApiService apiService =
                ApiClient.getClient().create(ApiService.class);

        Call<RedditObject> call = apiService.fetchPosts("Android");
        call.enqueue(new Callback<RedditObject>() {
            @Override
            public void onResponse(Call<RedditObject> call, Response<RedditObject> response) {
                listener.onFinished(response.body());
            }

            @Override
            public void onFailure(Call<RedditObject> call, Throwable t) {
                listener.onFinished(new RedditObject());
            }
        });
    }

}
