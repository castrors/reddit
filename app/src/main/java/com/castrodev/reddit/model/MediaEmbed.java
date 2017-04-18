
package com.castrodev.reddit.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class MediaEmbed {

    @SerializedName("content")
    private String mContent;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("scrolling")
    private Boolean mScrolling;
    @SerializedName("width")
    private Long mWidth;

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public Long getHeight() {
        return mHeight;
    }

    public void setHeight(Long height) {
        mHeight = height;
    }

    public Boolean getScrolling() {
        return mScrolling;
    }

    public void setScrolling(Boolean scrolling) {
        mScrolling = scrolling;
    }

    public Long getWidth() {
        return mWidth;
    }

    public void setWidth(Long width) {
        mWidth = width;
    }

}
