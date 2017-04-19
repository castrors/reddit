package com.castrodev.reddit.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.castrodev.reddit.R;
import com.castrodev.reddit.model.RedditObject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView, RedditObjectListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv_posts)
    RecyclerView rvPosts;
    @BindView(R.id.tv_empty)
    TextView tvEmpty;
    @BindView(R.id.progress)
    ProgressBar progressBar;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenterImpl(this, new MainInteractorImpl());
        setupView();

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    private void setupView() {
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        rvPosts.setVisibility(View.INVISIBLE);

    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        rvPosts.setVisibility(View.VISIBLE);
    }

    @Override
    public void setItems(RedditObject redditObject) {
        MainAdapter adapter = (MainAdapter) rvPosts.getAdapter();
        if (adapter == null) {
            StaggeredGridLayoutManager sglm =
                    new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
            rvPosts.setLayoutManager(sglm);
            rvPosts.setAdapter(new MainAdapter(redditObject, this));
        } else {
            adapter.concatenateDataSet(redditObject);
        }
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRedditObjectClick(RedditObject redditObject) {
        Toast.makeText(this, redditObject.getData().getTitle(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onScrollLastItemCallback(String after) {
        presenter.paginate(after);
    }
}
