package com.castrodev.reddit.repository.Implementation;

import com.castrodev.reddit.model.RedditObject;
import com.castrodev.reddit.repository.Interface.PostRespository;
import com.google.gson.Gson;

/**
 * Created by rodrigocastro on 21/04/17.
 */

public class FakePostRepositoryImpl extends PostRespository {

    private String postsMockData = "{\"kind\": \"Listing\", \"data\": {\"modhash\": \"\", \"children\": [{\"kind\": \"t3\", \"data\": {\"contest_mode\": false, \"banned_by\": null, \"media_embed\": {\"content\": \"&lt;iframe width=\\\"600\\\" height=\\\"338\\\" src=\\\"https://www.youtube.com/embed/videoseries?list=PLvgKbDCLxf7OR3K-j3jmsHzEgsk2AGz78\\\" frameborder=\\\"0\\\" allowfullscreen&gt;&lt;/iframe&gt;\", \"width\": 600, \"scrolling\": false, \"height\": 338}, \"subreddit\": \"Android\", \"selftext_html\": null, \"selftext\": \"\", \"likes\": null, \"suggested_sort\": null, \"user_reports\": [], \"secure_media\": {\"type\": \"youtube.com\", \"oembed\": {\"provider_url\": \"https://www.youtube.com/\", \"title\": \"Things to Do After Buying an Android\", \"html\": \"&lt;iframe width=\\\"600\\\" height=\\\"338\\\" src=\\\"https://www.youtube.com/embed/videoseries?list=PLvgKbDCLxf7OR3K-j3jmsHzEgsk2AGz78\\\" frameborder=\\\"0\\\" allowfullscreen&gt;&lt;/iframe&gt;\", \"thumbnail_width\": 480, \"height\": 338, \"width\": 600, \"version\": \"1.0\", \"author_name\": \"Tech Nerd\", \"thumbnail_height\": 360, \"thumbnail_url\": \"https://i.ytimg.com/vi/_jjQwwWexKQ/hqdefault.jpg\", \"type\": \"video\", \"provider_name\": \"YouTube\", \"author_url\": \"https://www.youtube.com/channel/UCofnFDnm5U-Mt17qq2GsTtw\"}}, \"link_flair_text\": null, \"id\": \"671wut\", \"gilded\": 0, \"secure_media_embed\": {\"content\": \"&lt;iframe width=\\\"600\\\" height=\\\"338\\\" src=\\\"https://www.youtube.com/embed/videoseries?list=PLvgKbDCLxf7OR3K-j3jmsHzEgsk2AGz78\\\" frameborder=\\\"0\\\" allowfullscreen&gt;&lt;/iframe&gt;\", \"width\": 600, \"scrolling\": false, \"height\": 338}, \"clicked\": false, \"score\": 1, \"report_reasons\": null, \"author\": \"DipanjanSaha003\", \"saved\": false, \"mod_reports\": [], \"name\": \"t3_671wut\", \"subreddit_name_prefixed\": \"r/Android\", \"approved_by\": null, \"over_18\": false, \"domain\": \"youtube.com\", \"hidden\": false, \"preview\": {\"images\": [{\"source\": {\"url\": \"https://i.redditmedia.com/B8fW7t8ASYuDEb6Md-QyUoTH1bBQj3xjE5E01e-rePw.jpg?s=6e212f3ccf50717b6498dc4804b747fa\", \"width\": 480, \"height\": 360}, \"resolutions\": [{\"url\": \"https://i.redditmedia.com/B8fW7t8ASYuDEb6Md-QyUoTH1bBQj3xjE5E01e-rePw.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=108&amp;s=f898cf25733234b9bb82a7af0e832db1\", \"width\": 108, \"height\": 81}, {\"url\": \"https://i.redditmedia.com/B8fW7t8ASYuDEb6Md-QyUoTH1bBQj3xjE5E01e-rePw.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=216&amp;s=5419d0c9ed25ba5a044a78fd0b49e840\", \"width\": 216, \"height\": 162}, {\"url\": \"https://i.redditmedia.com/B8fW7t8ASYuDEb6Md-QyUoTH1bBQj3xjE5E01e-rePw.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=320&amp;s=f464ab081b0a86f57978bd43d6343bdc\", \"width\": 320, \"height\": 240}], \"variants\": {}, \"id\": \"-BIPQaEbsDwjLcdNGvDqCRiJtJXNjXIIC6KL4dNR7Ig\"}], \"enabled\": false}, \"thumbnail\": \"https://b.thumbs.redditmedia.com/RMsb7u_fBrTFstZVXvnK6zhzMFpT8eaAtFortQqXS5E.jpg\", \"subreddit_id\": \"t5_2qlqh\", \"edited\": false, \"link_flair_css_class\": null, \"author_flair_css_class\": null, \"downs\": 0, \"brand_safe\": true, \"archived\": false, \"removal_reason\": null, \"post_hint\": \"rich:video\", \"is_self\": false, \"hide_score\": true, \"spoiler\": false, \"permalink\": \"/r/Android/comments/671wut/things_to_do_after_buying_an_android/\", \"num_reports\": null, \"locked\": false, \"stickied\": false, \"created\": 1492978215.0, \"url\": \"https://www.youtube.com/watch?v=_jjQwwWexKQ&amp;list=PLvgKbDCLxf7OR3K-j3jmsHzEgsk2AGz78\", \"author_flair_text\": null, \"quarantine\": false, \"title\": \"Things to Do After Buying an Android\", \"created_utc\": 1492949415.0, \"distinguished\": null, \"media\": {\"type\": \"youtube.com\", \"oembed\": {\"provider_url\": \"https://www.youtube.com/\", \"title\": \"Things to Do After Buying an Android\", \"html\": \"&lt;iframe width=\\\"600\\\" height=\\\"338\\\" src=\\\"https://www.youtube.com/embed/videoseries?list=PLvgKbDCLxf7OR3K-j3jmsHzEgsk2AGz78\\\" frameborder=\\\"0\\\" allowfullscreen&gt;&lt;/iframe&gt;\", \"thumbnail_width\": 480, \"height\": 338, \"width\": 600, \"version\": \"1.0\", \"author_name\": \"Tech Nerd\", \"thumbnail_height\": 360, \"thumbnail_url\": \"https://i.ytimg.com/vi/_jjQwwWexKQ/hqdefault.jpg\", \"type\": \"video\", \"provider_name\": \"YouTube\", \"author_url\": \"https://www.youtube.com/channel/UCofnFDnm5U-Mt17qq2GsTtw\"}}, \"num_comments\": 0, \"visited\": false, \"subreddit_type\": \"public\", \"ups\": 1}}, {\"kind\": \"t3\", \"data\": {\"contest_mode\": false, \"banned_by\": null, \"media_embed\": {}, \"subreddit\": \"Android\", \"selftext_html\": \"&lt;!-- SC_OFF --&gt;&lt;div class=\\\"md\\\"&gt;&lt;p&gt;Note 1. Join our Discord, IRC, and Telegram chat-rooms! &lt;a href=\\\"https://www.reddit.com/r/Android/wiki/index#wiki_.2Fr.2Fandroid_chat_rooms\\\"&gt;Please see our wiki for instructions.&lt;/a&gt;&lt;/p&gt;\\n\\n&lt;p&gt;This weekly Sunday thread is for you to let off some steam and speak out about whatever complaint you might have about:  &lt;/p&gt;\\n\\n&lt;ul&gt;\\n&lt;li&gt;&lt;p&gt;Your device.  &lt;/p&gt;&lt;/li&gt;\\n&lt;li&gt;&lt;p&gt;Your carrier.  &lt;/p&gt;&lt;/li&gt;\\n&lt;li&gt;&lt;p&gt;Your device&amp;#39;s manufacturer.  &lt;/p&gt;&lt;/li&gt;\\n&lt;li&gt;&lt;p&gt;An app  &lt;/p&gt;&lt;/li&gt;\\n&lt;li&gt;&lt;p&gt;Any other company&lt;/p&gt;&lt;/li&gt;\\n&lt;/ul&gt;\\n\\n&lt;hr/&gt;\\n\\n&lt;p&gt;&lt;strong&gt;Rules&lt;/strong&gt;  &lt;/p&gt;\\n\\n&lt;p&gt;1) Please do not target any individuals or try to name/shame any individual. If you hate Google/Samsung/HTC etc. for one thing that is fine, but do not be rude to an individual app developer.&lt;/p&gt;\\n\\n&lt;p&gt;2) If you have a suggestion to solve another user&amp;#39;s issue, please leave a comment but be sure it&amp;#39;s constructive! We do not want any flame-wars.  &lt;/p&gt;\\n\\n&lt;p&gt;3) Be respectful of other&amp;#39;s opinions. Even if you feel that somebody is &amp;quot;wrong&amp;quot; you don&amp;#39;t have to go out of your way to prove them wrong. Disagree politely, and move on.&lt;/p&gt;\\n&lt;/div&gt;&lt;!-- SC_ON --&gt;\", \"selftext\": \"Note 1. Join our Discord, IRC, and Telegram chat-rooms! [Please see our wiki for instructions.](https://www.reddit.com/r/Android/wiki/index#wiki_.2Fr.2Fandroid_chat_rooms)\\n\\nThis weekly Sunday thread is for you to let off some steam and speak out about whatever complaint you might have about:  \\n\\n* Your device.  \\n\\n* Your carrier.  \\n\\n* Your device's manufacturer.  \\n\\n* An app  \\n\\n* Any other company\\n\\n***  \\n\\n**Rules**  \\n\\n1) Please do not target any individuals or try to name/shame any individual. If you hate Google/Samsung/HTC etc. for one thing that is fine, but do not be rude to an individual app developer.\\n\\n2) If you have a suggestion to solve another user's issue, please leave a comment but be sure it's constructive! We do not want any flame-wars.  \\n\\n3) Be respectful of other's opinions. Even if you feel that somebody is \\\"wrong\\\" you don't have to go out of your way to prove them wrong. Disagree politely, and move on.\\n\", \"likes\": null, \"suggested_sort\": null, \"user_reports\": [], \"secure_media\": null, \"link_flair_text\": null, \"id\": \"671ph0\", \"gilded\": 0, \"secure_media_embed\": {}, \"clicked\": false, \"score\": 3, \"report_reasons\": null, \"author\": \"AutoModerator\", \"saved\": false, \"mod_reports\": [], \"name\": \"t3_671ph0\", \"subreddit_name_prefixed\": \"r/Android\", \"approved_by\": null, \"over_18\": false, \"domain\": \"self.Android\", \"hidden\": false, \"thumbnail\": \"self\", \"subreddit_id\": \"t5_2qlqh\", \"edited\": false, \"link_flair_css_class\": null, \"author_flair_css_class\": \"robot\", \"downs\": 0, \"brand_safe\": true, \"archived\": false, \"removal_reason\": null, \"is_self\": true, \"hide_score\": true, \"spoiler\": false, \"permalink\": \"/r/Android/comments/671ph0/sunday_rantrage_apr_23_2017_your_weekly_complaint/\", \"num_reports\": null, \"locked\": false, \"stickied\": true, \"created\": 1492974461.0, \"url\": \"https://www.reddit.com/r/Android/comments/671ph0/sunday_rantrage_apr_23_2017_your_weekly_complaint/\", \"author_flair_text\": \"*beep boop*\", \"quarantine\": false, \"title\": \"Sunday Rant/Rage (Apr 23 2017) - Your weekly complaint thread!\", \"created_utc\": 1492945661.0, \"distinguished\": \"moderator\", \"media\": null, \"num_comments\": 5, \"visited\": false, \"subreddit_type\": \"public\", \"ups\": 3}}, {\"kind\": \"t3\", \"data\": {\"contest_mode\": false, \"banned_by\": null, \"media_embed\": {}, \"subreddit\": \"Android\", \"selftext_html\": null, \"selftext\": \"\", \"likes\": null, \"suggested_sort\": null, \"user_reports\": [], \"secure_media\": null, \"link_flair_text\": null, \"id\": \"671ofq\", \"gilded\": 0, \"secure_media_embed\": {}, \"clicked\": false, \"score\": 0, \"report_reasons\": null, \"author\": \"av81007\", \"saved\": false, \"mod_reports\": [], \"name\": \"t3_671ofq\", \"subreddit_name_prefixed\": \"r/Android\", \"approved_by\": null, \"over_18\": false, \"domain\": \"youtube.com\", \"hidden\": false, \"preview\": {\"images\": [{\"source\": {\"url\": \"https://i.redditmedia.com/1utnAVxzdp5ifaSP-N7q-29K1b-7BtZpITYjaTrH4rA.jpg?s=ab43ad8515d43b36f5203044b572fcba\", \"width\": 1280, \"height\": 720}, \"resolutions\": [{\"url\": \"https://i.redditmedia.com/1utnAVxzdp5ifaSP-N7q-29K1b-7BtZpITYjaTrH4rA.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=108&amp;s=d968ae3c7abd6d19f12291d15de2c11a\", \"width\": 108, \"height\": 60}, {\"url\": \"https://i.redditmedia.com/1utnAVxzdp5ifaSP-N7q-29K1b-7BtZpITYjaTrH4rA.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=216&amp;s=6831d90d2b3d2e5d52566eea718a6fe9\", \"width\": 216, \"height\": 121}, {\"url\": \"https://i.redditmedia.com/1utnAVxzdp5ifaSP-N7q-29K1b-7BtZpITYjaTrH4rA.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=320&amp;s=0020c0d2cbc23c2e6161e4ef77bfc58a\", \"width\": 320, \"height\": 180}, {\"url\": \"https://i.redditmedia.com/1utnAVxzdp5ifaSP-N7q-29K1b-7BtZpITYjaTrH4rA.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=640&amp;s=99f68933040734d9bc5bab043f17838b\", \"width\": 640, \"height\": 360}, {\"url\": \"https://i.redditmedia.com/1utnAVxzdp5ifaSP-N7q-29K1b-7BtZpITYjaTrH4rA.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=960&amp;s=15013284d18587c4a5cf3d20df0f3961\", \"width\": 960, \"height\": 540}, {\"url\": \"https://i.redditmedia.com/1utnAVxzdp5ifaSP-N7q-29K1b-7BtZpITYjaTrH4rA.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=1080&amp;s=e18e794de39c4b2b84237d96df4a3800\", \"width\": 1080, \"height\": 607}], \"variants\": {}, \"id\": \"nprl_Zh-JSlIKkNGa6CvCr5g-gGhM2bdPYfi3s56DJo\"}], \"enabled\": false}, \"thumbnail\": \"https://b.thumbs.redditmedia.com/hwrhA1dStD3u0ju9WeDDgaBx5Bq_Klj3y4LdD62Co4Y.jpg\", \"subreddit_id\": \"t5_2qlqh\", \"edited\": false, \"link_flair_css_class\": null, \"author_flair_css_class\": null, \"downs\": 0, \"brand_safe\": true, \"archived\": false, \"removal_reason\": null, \"post_hint\": \"link\", \"is_self\": false, \"hide_score\": true, \"spoiler\": false, \"permalink\": \"/r/Android/comments/671ofq/android_studio_using_onclicklistener_method_for/\", \"num_reports\": null, \"locked\": false, \"stickied\": false, \"created\": 1492973965.0, \"url\": \"https://www.youtube.com/attribution_link?a=5ibtaKLCPZk&amp;u=%2Fwatch%3Fv%3Do_QjKgVIYp8%26feature%3Dshare\", \"author_flair_text\": null, \"quarantine\": false, \"title\": \"Android Studio - Using onClicklistener() Method for Button Click Explain...\", \"created_utc\": 1492945165.0, \"distinguished\": null, \"media\": null, \"num_comments\": 0, \"visited\": false, \"subreddit_type\": \"public\", \"ups\": 0}}], \"after\": null, \"before\": null}}";

    @Override
    public void getPosts(String after, String limit, final OnFinishedListener listener) {

            Gson gson = new Gson();
            listener.onFinished(gson.fromJson(postsMockData, RedditObject.class));
//        listener.onError();


    }

}
