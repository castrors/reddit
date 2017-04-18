package com.castrodev.reddit.api;

import com.castrodev.reddit.model.RedditObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rodrigocastro on 18/04/17.
 */

public interface ApiService {

    @GET("/r/Android/new/.json")
    Call<RedditObject> fetchAndroidPosts();

}
