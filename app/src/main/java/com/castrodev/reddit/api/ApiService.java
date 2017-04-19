package com.castrodev.reddit.api;

import com.castrodev.reddit.model.RedditObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rodrigocastro on 18/04/17.
 */

public interface ApiService {

    @GET("/r/Android/new/.json")
    Call<RedditObject> fetchPosts(@Query("after") String after,
                                  @Query("limit") String limit);

}
