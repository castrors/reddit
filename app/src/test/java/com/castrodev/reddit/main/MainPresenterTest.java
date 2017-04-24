package com.castrodev.reddit.main;

import com.castrodev.reddit.model.Data;
import com.castrodev.reddit.model.RedditObject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertNull;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by rodrigocastro on 21/04/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    @Mock
    MainView view;

    private MainPresenterImpl presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new MainPresenterImpl(view);
    }

    @Test
    public void checkIfShowsProgressOnResume() {
        presenter.onResume();
        verify(view, times(1)).showProgress();
    }

    @Test
    public void checkIfGoToDetailActivityOnItemClick() {
        presenter.onItemClicked((RedditObject) anyObject());
        verify(view, times(1)).goToDetailActivity((RedditObject) anyObject());
    }

    @Test
    public void checkIfViewIsReleasedOnDestroy() {
        presenter.onDestroy();
        assertNull(presenter.getMainView());
    }

    @Test
    public void checkIfItemsArePassedToView() {

        RedditObject redditObject = new RedditObject();
        Data data = new Data();
        RedditObject child = new RedditObject();
        List<RedditObject> children = new ArrayList<>();
        children.add(child);
        data.setChildren(children);
        redditObject.setData(data);

        presenter.onFinished(redditObject);
        verify(view, times(1)).setItems(redditObject);
        verify(view, times(1)).hideProgress();
    }

}