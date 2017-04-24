package com.castrodev.reddit.detail;

import com.castrodev.reddit.model.RedditObject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertNull;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by rodrigocastro on 21/04/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class DetailPresenterTest {

    @Mock
    DetailView view;

    private DetailPresenterImpl presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new DetailPresenterImpl(view, "permalink");
    }

    @Test
    public void checkIfShowsProgressOnResume() {
        presenter.onResume();
        verify(view, times(1)).showProgress();
    }

    @Test
    public void checkIfOpenPostLinkOnFABClick() {
        presenter.showUrl(anyString());
        verify(view, times(1)).openPostLink(anyString());
    }

    @Test
    public void checkIfViewIsReleasedOnDestroy() {
        presenter.onDestroy();
        assertNull(presenter.getDetailView());
    }


    @Test
    public void checkIfItemsArePassedToView() {
        presenter.onFinished(anyListOf(RedditObject.class));
        verify(view, times(1)).setItems(anyListOf(RedditObject.class));
        verify(view, times(1)).hideProgress();
    }

}