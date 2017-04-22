package com.castrodev.reddit.repository.Implementation;

import com.castrodev.reddit.api.ApiClient;
import com.castrodev.reddit.api.ApiService;
import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.repository.Interface.CommentRepository;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rodrigocastro on 21/04/17.
 */

public class CommentRepositoryImpl extends CommentRepository {

    @Override
    public void getComments(String permalink, final CommentRepository.OnFinishedListener listener) {
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
