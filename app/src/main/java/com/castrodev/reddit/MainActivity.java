package com.castrodev.reddit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.castrodev.reddit.api.ApiClient;
import com.castrodev.reddit.api.ApiService;
import com.castrodev.reddit.model.RedditObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<RedditObject> {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv_posts)
    RecyclerView rvPosts;
    @BindView(R.id.tv_empty)
    TextView tvEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupView();

        ApiService apiService =
                ApiClient.getClient().create(ApiService.class);

        Call<RedditObject> call = apiService.fetchPosts("Android");
        call.enqueue(this);
    }

    private void setupView() {
        toolbar.setTitle("Reddit Android");
        setSupportActionBar(toolbar);

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
