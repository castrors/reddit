
package com.castrodev.reddit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("after")
    private String mAfter;
    @SerializedName("approved_by")
    private Object mApprovedBy;
    @SerializedName("archived")
    private Boolean mArchived;
    @SerializedName("author")
    private String mAuthor;
    @SerializedName("author_flair_css_class")
    private String mAuthorFlairCssClass;
    @SerializedName("author_flair_text")
    private String mAuthorFlairText;
    @SerializedName("banned_by")
    private Object mBannedBy;
    @SerializedName("before")
    private Object mBefore;
    @SerializedName("brand_safe")
    private Boolean mBrandSafe;
    @SerializedName("children")
    private List<RedditObject> mChildren;
    @SerializedName("clicked")
    private Boolean mClicked;
    @SerializedName("contest_mode")
    private Boolean mContestMode;
    @SerializedName("created")
    private Double mCreated;
    @SerializedName("created_utc")
    private Double mCreatedUtc;
    @SerializedName("distinguished")
    private Object mDistinguished;
    @SerializedName("domain")
    private String mDomain;
    @SerializedName("downs")
    private Long mDowns;
    @SerializedName("gilded")
    private Long mGilded;
    @SerializedName("hidden")
    private Boolean mHidden;
    @SerializedName("hide_score")
    private Boolean mHideScore;
    @SerializedName("id")
    private String mId;
    @SerializedName("is_self")
    private Boolean mIsSelf;
    @SerializedName("likes")
    private Object mLikes;
    @SerializedName("link_flair_css_class")
    private Object mLinkFlairCssClass;
    @SerializedName("link_flair_text")
    private Object mLinkFlairText;
    @SerializedName("locked")
    private Boolean mLocked;
    @SerializedName("media")
    private Media mMedia;
    @SerializedName("media_embed")
    private MediaEmbed mMediaEmbed;
    @SerializedName("mod_reports")
    private List<Object> mModReports;
    @SerializedName("modhash")
    private String mModhash;
    @SerializedName("name")
    private String mName;
    @SerializedName("num_comments")
    private Long mNumComments;
    @SerializedName("num_reports")
    private Object mNumReports;
    @SerializedName("over_18")
    private Boolean mOver18;
    @SerializedName("permalink")
    private String mPermalink;
    @SerializedName("post_hint")
    private String mPostHint;
    @SerializedName("preview")
    private Preview mPreview;
    @SerializedName("quarantine")
    private Boolean mQuarantine;
    @SerializedName("removal_reason")
    private Object mRemovalReason;
    @SerializedName("report_reasons")
    private Object mReportReasons;
    @SerializedName("saved")
    private Boolean mSaved;
    @SerializedName("score")
    private Long mScore;
    @SerializedName("secure_media")
    private Media mSecureMedia;
    @SerializedName("secure_media_embed")
    private SecureMediaEmbed mSecureMediaEmbed;
    @SerializedName("selftext")
    private String mSelftext;
    @SerializedName("selftext_html")
    private String mSelftextHtml;
    @SerializedName("spoiler")
    private Boolean mSpoiler;
    @SerializedName("stickied")
    private Boolean mStickied;
    @SerializedName("subreddit")
    private String mSubreddit;
    @SerializedName("subreddit_id")
    private String mSubredditId;
    @SerializedName("subreddit_name_prefixed")
    private String mSubredditNamePrefixed;
    @SerializedName("subreddit_type")
    private String mSubredditType;
    @SerializedName("suggested_sort")
    private Object mSuggestedSort;
    @SerializedName("thumbnail")
    private String mThumbnail;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("ups")
    private Long mUps;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("user_reports")
    private List<Object> mUserReports;
    @SerializedName("visited")
    private Boolean mVisited;

    public String getAfter() {
        return mAfter;
    }

    public void setAfter(String after) {
        mAfter = after;
    }

    public Object getApprovedBy() {
        return mApprovedBy;
    }

    public void setApprovedBy(Object approvedBy) {
        mApprovedBy = approvedBy;
    }

    public Boolean getArchived() {
        return mArchived;
    }

    public void setArchived(Boolean archived) {
        mArchived = archived;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public String getAuthorFlairCssClass() {
        return mAuthorFlairCssClass;
    }

    public void setAuthorFlairCssClass(String authorFlairCssClass) {
        mAuthorFlairCssClass = authorFlairCssClass;
    }

    public String getAuthorFlairText() {
        return mAuthorFlairText;
    }

    public void setAuthorFlairText(String authorFlairText) {
        mAuthorFlairText = authorFlairText;
    }

    public Object getBannedBy() {
        return mBannedBy;
    }

    public void setBannedBy(Object bannedBy) {
        mBannedBy = bannedBy;
    }

    public Object getBefore() {
        return mBefore;
    }

    public void setBefore(Object before) {
        mBefore = before;
    }

    public Boolean getBrandSafe() {
        return mBrandSafe;
    }

    public void setBrandSafe(Boolean brandSafe) {
        mBrandSafe = brandSafe;
    }

    public List<RedditObject> getChildren() {
        return mChildren;
    }

    public void setChildren(List<RedditObject> children) {
        mChildren = children;
    }

    public Boolean getClicked() {
        return mClicked;
    }

    public void setClicked(Boolean clicked) {
        mClicked = clicked;
    }

    public Boolean getContestMode() {
        return mContestMode;
    }

    public void setContestMode(Boolean contestMode) {
        mContestMode = contestMode;
    }

    public Double getCreated() {
        return mCreated;
    }

    public void setCreated(Double created) {
        mCreated = created;
    }

    public Double getCreatedUtc() {
        return mCreatedUtc;
    }

    public void setCreatedUtc(Double createdUtc) {
        mCreatedUtc = createdUtc;
    }

    public Object getDistinguished() {
        return mDistinguished;
    }

    public void setDistinguished(Object distinguished) {
        mDistinguished = distinguished;
    }

    public String getDomain() {
        return mDomain;
    }

    public void setDomain(String domain) {
        mDomain = domain;
    }

    public Long getDowns() {
        return mDowns;
    }

    public void setDowns(Long downs) {
        mDowns = downs;
    }

    public Long getGilded() {
        return mGilded;
    }

    public void setGilded(Long gilded) {
        mGilded = gilded;
    }

    public Boolean getHidden() {
        return mHidden;
    }

    public void setHidden(Boolean hidden) {
        mHidden = hidden;
    }

    public Boolean getHideScore() {
        return mHideScore;
    }

    public void setHideScore(Boolean hideScore) {
        mHideScore = hideScore;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Boolean getIsSelf() {
        return mIsSelf;
    }

    public void setIsSelf(Boolean isSelf) {
        mIsSelf = isSelf;
    }

    public Object getLikes() {
        return mLikes;
    }

    public void setLikes(Object likes) {
        mLikes = likes;
    }

    public Object getLinkFlairCssClass() {
        return mLinkFlairCssClass;
    }

    public void setLinkFlairCssClass(Object linkFlairCssClass) {
        mLinkFlairCssClass = linkFlairCssClass;
    }

    public Object getLinkFlairText() {
        return mLinkFlairText;
    }

    public void setLinkFlairText(Object linkFlairText) {
        mLinkFlairText = linkFlairText;
    }

    public Boolean getLocked() {
        return mLocked;
    }

    public void setLocked(Boolean locked) {
        mLocked = locked;
    }

    public Media getMedia() {
        return mMedia;
    }

    public void setMedia(Media media) {
        mMedia = media;
    }

    public MediaEmbed getMediaEmbed() {
        return mMediaEmbed;
    }

    public void setMediaEmbed(MediaEmbed mediaEmbed) {
        mMediaEmbed = mediaEmbed;
    }

    public List<Object> getModReports() {
        return mModReports;
    }

    public void setModReports(List<Object> modReports) {
        mModReports = modReports;
    }

    public String getModhash() {
        return mModhash;
    }

    public void setModhash(String modhash) {
        mModhash = modhash;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getNumComments() {
        return mNumComments;
    }

    public void setNumComments(Long numComments) {
        mNumComments = numComments;
    }

    public Object getNumReports() {
        return mNumReports;
    }

    public void setNumReports(Object numReports) {
        mNumReports = numReports;
    }

    public Boolean getOver18() {
        return mOver18;
    }

    public void setOver18(Boolean over18) {
        mOver18 = over18;
    }

    public String getPermalink() {
        return mPermalink;
    }

    public void setPermalink(String permalink) {
        mPermalink = permalink;
    }

    public String getPostHint() {
        return mPostHint;
    }

    public void setPostHint(String postHint) {
        mPostHint = postHint;
    }

    public Preview getPreview() {
        return mPreview;
    }

    public void setPreview(Preview preview) {
        mPreview = preview;
    }

    public Boolean getQuarantine() {
        return mQuarantine;
    }

    public void setQuarantine(Boolean quarantine) {
        mQuarantine = quarantine;
    }

    public Object getRemovalReason() {
        return mRemovalReason;
    }

    public void setRemovalReason(Object removalReason) {
        mRemovalReason = removalReason;
    }

    public Object getReportReasons() {
        return mReportReasons;
    }

    public void setReportReasons(Object reportReasons) {
        mReportReasons = reportReasons;
    }

    public Boolean getSaved() {
        return mSaved;
    }

    public void setSaved(Boolean saved) {
        mSaved = saved;
    }

    public Long getScore() {
        return mScore;
    }

    public void setScore(Long score) {
        mScore = score;
    }

    public Media getSecureMedia() {
        return mSecureMedia;
    }

    public void setSecureMedia(Media secureMedia) {
        mSecureMedia = secureMedia;
    }

    public SecureMediaEmbed getSecureMediaEmbed() {
        return mSecureMediaEmbed;
    }

    public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
        mSecureMediaEmbed = secureMediaEmbed;
    }

    public String getSelftext() {
        return mSelftext;
    }

    public void setSelftext(String selftext) {
        mSelftext = selftext;
    }

    public String getSelftextHtml() {
        return mSelftextHtml;
    }

    public void setSelftextHtml(String selftextHtml) {
        mSelftextHtml = selftextHtml;
    }

    public Boolean getSpoiler() {
        return mSpoiler;
    }

    public void setSpoiler(Boolean spoiler) {
        mSpoiler = spoiler;
    }

    public Boolean getStickied() {
        return mStickied;
    }

    public void setStickied(Boolean stickied) {
        mStickied = stickied;
    }

    public String getSubreddit() {
        return mSubreddit;
    }

    public void setSubreddit(String subreddit) {
        mSubreddit = subreddit;
    }

    public String getSubredditId() {
        return mSubredditId;
    }

    public void setSubredditId(String subredditId) {
        mSubredditId = subredditId;
    }

    public String getSubredditNamePrefixed() {
        return mSubredditNamePrefixed;
    }

    public void setSubredditNamePrefixed(String subredditNamePrefixed) {
        mSubredditNamePrefixed = subredditNamePrefixed;
    }

    public String getSubredditType() {
        return mSubredditType;
    }

    public void setSubredditType(String subredditType) {
        mSubredditType = subredditType;
    }

    public Object getSuggestedSort() {
        return mSuggestedSort;
    }

    public void setSuggestedSort(Object suggestedSort) {
        mSuggestedSort = suggestedSort;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Long getUps() {
        return mUps;
    }

    public void setUps(Long ups) {
        mUps = ups;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public List<Object> getUserReports() {
        return mUserReports;
    }

    public void setUserReports(List<Object> userReports) {
        mUserReports = userReports;
    }

    public Boolean getVisited() {
        return mVisited;
    }

    public void setVisited(Boolean visited) {
        mVisited = visited;
    }

}
