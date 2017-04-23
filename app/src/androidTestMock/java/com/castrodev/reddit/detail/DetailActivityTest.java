package com.castrodev.reddit.detail;

/**
 * Created by rodrigocastro on 23/04/17.
 */

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.test.espresso.Espresso;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.castrodev.reddit.R;
import com.castrodev.reddit.main.MainActivity;
import com.castrodev.reddit.model.RedditParcelableObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DetailActivityTest {



    private static String OBJECT_THUMB = "https://b.thumbs.redditmedia.com/RMsb7u_fBrTFstZVXvnK6zhzMFpT8eaAtFortQqXS5E.jpg";

    private static String OBJECT_PERMALINK = "/r/Android/comments/671wut/things_to_do_after_buying_an_android/";

    private static Long OBJECT_NUM_COMMENTS = 1L;

    private static String OBJECT_TITLE = "Things to Do After Buying an Android";

    private static String OBJECT_URL = "https://www.youtube.com/watch?v=_jjQwwWexKQ&amp;list=PLvgKbDCLxf7OR3K-j3jmsHzEgsk2AGz78";

    private static String OBJECT_AUTHOR = "DipanjanSaha003";

    private static RedditParcelableObject PARCELABLE_OBJECT = new RedditParcelableObject(OBJECT_THUMB, OBJECT_PERMALINK, OBJECT_NUM_COMMENTS, OBJECT_TITLE, OBJECT_URL, OBJECT_AUTHOR);

    @Rule
    public ActivityTestRule<DetailActivity> mPostDetailActivityTestRule =
            new ActivityTestRule<>(DetailActivity.class, true,
                    false);


    @Before
    public void intentWithStubbedRedditParcelableObject() {

        Intent startIntent = new Intent();
        startIntent.putExtra(MainActivity.KEY, PARCELABLE_OBJECT);
        mPostDetailActivityTestRule.launchActivity(startIntent);

        registerIdlingResource();
    }

    @Test
    public void PostDetails_DisplayedInUi() throws Exception {
        Context context = mPostDetailActivityTestRule.getActivity();
        Resources res = context.getResources();

        String authorName = String.format(res.getString(R.string.author_name)
                , OBJECT_AUTHOR);
        String numComments = String.format(res.getString(R.string.comments_count)
                , OBJECT_NUM_COMMENTS);

        onView(withId(R.id.tv_author)).check(matches(withText(authorName)));
        onView(withId(R.id.tv_comment_count)).check(matches(withText(numComments)));
    }

    @After
    public void unregisterIdlingResource() {
        Espresso.unregisterIdlingResources(
                mPostDetailActivityTestRule.getActivity().getCountingIdlingResource());
    }

    private void registerIdlingResource() {
        Espresso.registerIdlingResources(
                mPostDetailActivityTestRule.getActivity().getCountingIdlingResource());
    }
}