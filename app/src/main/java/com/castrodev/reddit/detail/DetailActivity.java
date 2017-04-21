package com.castrodev.reddit.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import com.castrodev.reddit.R;
import com.castrodev.reddit.model.RedditObject;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity implements DetailView {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv_comments)
    RecyclerView rvComments;
    @BindView(R.id.progress)
    ProgressBar progressBar;

    private DetailPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        presenter = new DetailPresenterImpl(this, new DetailInteractorImpl());
        setupView();
    }

    private void setupView() {
        toolbar.setTitle(R.string.title_activity_detail);
        setSupportActionBar(toolbar);

    }
    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume("permalink");
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        rvComments.setVisibility(View.INVISIBLE);

    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        rvComments.setVisibility(View.VISIBLE);
    }

    @Override
    public void setItems(List<RedditObject> redditObjectList) {

    }
}
