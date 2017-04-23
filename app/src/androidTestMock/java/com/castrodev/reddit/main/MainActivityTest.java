package com.castrodev.reddit.main;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.castrodev.reddit.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by rodrigocastro on 23/04/17.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mPostMainActivityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, true);

    @Test
    public void checkIfDatasetSizeIs3() {
        onView(withId(R.id.rv_posts)).check(new RecyclerViewItemCountAssertion(3));

    }

}
