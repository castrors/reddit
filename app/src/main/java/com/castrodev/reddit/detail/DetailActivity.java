package com.castrodev.reddit.detail;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.castrodev.reddit.R;
import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.model.RedditParcelableObject;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.castrodev.reddit.main.MainActivity.KEY;

public class DetailActivity extends AppCompatActivity implements DetailView {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv_comments)
    RecyclerView rvComments;
    @BindView(R.id.progress)
    ProgressBar progressBar;
    @BindView(R.id.iv_detail_post)
    ImageView ivDetailPost;
    @BindView(R.id.tv_author)
    TextView tvAuthor;
    @BindView(R.id.tv_comment_count)
    TextView tvCommentCount;

    private DetailPresenter presenter;
    private RedditParcelableObject redditParcelableObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        presenter = new DetailPresenterImpl(this, new DetailInteractorImpl());
        getParcelableObject();
        setupView();
    }

    private void getParcelableObject() {
        if (getIntent().hasExtra(KEY)) {
            redditParcelableObject = getIntent().getParcelableExtra(KEY);
        }
    }

    private void setupView() {
        toolbar.setTitle(redditParcelableObject.getTitle());
        setSupportActionBar(toolbar);

        Resources res = getResources();
        tvAuthor.setText(
                String.format(res.getString(R.string.author_name)
                        , redditParcelableObject.getAuthor()));
        tvCommentCount.setText(
                String.format(res.getString(R.string.comments_count)
                        , redditParcelableObject.getNumComments()));

        Picasso.with(this)
                .load(redditParcelableObject.getThumbnail())
                .error(R.drawable.ic_error_image)
                .into(ivDetailPost);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume(redditParcelableObject.getPermalink());
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
        RedditObject objectWithComments = redditObjectList.get(1);
        rvComments.setLayoutManager(new LinearLayoutManager(this));
        rvComments.setAdapter(new DetailAdapter(objectWithComments, presenter));
    }

    @OnClick(R.id.fabNavigate)
    public void onFabClicked(View v) {
        String url = redditParcelableObject.getUrl();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
