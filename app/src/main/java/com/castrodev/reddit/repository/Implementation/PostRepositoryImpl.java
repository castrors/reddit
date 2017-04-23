package com.castrodev.reddit.repository.Implementation;

import com.castrodev.reddit.api.ApiClient;
import com.castrodev.reddit.api.ApiService;
import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.repository.Interface.PostRespository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rodrigocastro on 21/04/17.
 */

public class PostRepositoryImpl extends PostRespository {

    @Override
    public void getPosts(String after, String limit, final PostRespository.OnFinishedListener listener) {
        ApiService apiService =
                ApiClient.getClient().create(ApiService.class);

        Call<RedditObject> call = apiService.fetchPosts(after, limit);
        call.enqueue(new Callback<RedditObject>() {
            @Override
            public void onResponse(Call<RedditObject> call, Response<RedditObject> response) {
                listener.onFinished(response.body());
            }

            @Override
            public void onFailure(Call<RedditObject> call, Throwable t) {
                listener.onDefaultError();
            }
        });
    }
}
