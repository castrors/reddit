
package com.castrodev.reddit.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Oembed {

    @SerializedName("author_name")
    private String mAuthorName;
    @SerializedName("author_url")
    private String mAuthorUrl;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("html")
    private String mHtml;
    @SerializedName("provider_name")
    private String mProviderName;
    @SerializedName("provider_url")
    private String mProviderUrl;
    @SerializedName("thumbnail_height")
    private Long mThumbnailHeight;
    @SerializedName("thumbnail_url")
    private String mThumbnailUrl;
    @SerializedName("thumbnail_width")
    private Long mThumbnailWidth;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("type")
    private String mType;
    @SerializedName("version")
    private String mVersion;
    @SerializedName("width")
    private Long mWidth;

    public String getAuthorName() {
        return mAuthorName;
    }

    public void setAuthorName(String authorName) {
        mAuthorName = authorName;
    }

    public String getAuthorUrl() {
        return mAuthorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        mAuthorUrl = authorUrl;
    }

    public Long getHeight() {
        return mHeight;
    }

    public void setHeight(Long height) {
        mHeight = height;
    }

    public String getHtml() {
        return mHtml;
    }

    public void setHtml(String html) {
        mHtml = html;
    }

    public String getProviderName() {
        return mProviderName;
    }

    public void setProviderName(String providerName) {
        mProviderName = providerName;
    }

    public String getProviderUrl() {
        return mProviderUrl;
    }

    public void setProviderUrl(String providerUrl) {
        mProviderUrl = providerUrl;
    }

    public Long getThumbnailHeight() {
        return mThumbnailHeight;
    }

    public void setThumbnailHeight(Long thumbnailHeight) {
        mThumbnailHeight = thumbnailHeight;
    }

    public String getThumbnailUrl() {
        return mThumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        mThumbnailUrl = thumbnailUrl;
    }

    public Long getThumbnailWidth() {
        return mThumbnailWidth;
    }

    public void setThumbnailWidth(Long thumbnailWidth) {
        mThumbnailWidth = thumbnailWidth;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

    public Long getWidth() {
        return mWidth;
    }

    public void setWidth(Long width) {
        mWidth = width;
    }

}
