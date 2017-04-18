package com.castrodev.reddit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.castrodev.reddit.api.ApiClient;
import com.castrodev.reddit.api.ApiService;
import com.castrodev.reddit.model.RedditObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<RedditObject> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiService apiService =
                ApiClient.getClient().create(ApiService.class);

        Call<RedditObject> call = apiService.fetchAndroidPosts();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<RedditObject> call, Response<RedditObject> response) {
        Log.d("tag", call.toString());
        Log.d("tag", response.toString());
    }

    @Override
    public void onFailure(Call<RedditObject> call, Throwable t) {

    }
}
