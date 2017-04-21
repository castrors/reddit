package com.castrodev.reddit.detail;

import com.castrodev.reddit.api.ApiClient;
import com.castrodev.reddit.api.ApiService;
import com.castrodev.reddit.model.RedditObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rodrigocastro on 20/04/17.
 */

public class DetailInteractorImpl implements DetailInteractor {
    @Override
    public void requestComments(String permalink, final OnFinishedListener listener) {
        ApiService apiService =
                ApiClient.getClient().create(ApiService.class);

        Call<List<RedditObject>> call = apiService.fetchComments(permalink);
        call.enqueue(new Callback<List<RedditObject>>() {
            @Override
            public void onResponse(Call<List<RedditObject>> call, Response<List<RedditObject>> response) {
                listener.onFinished(response.body());
            }

            @Override
            public void onFailure(Call<List<RedditObject>> call, Throwable t) {
                listener.onFinished(new ArrayList<RedditObject>());
            }
        });
    }
}
