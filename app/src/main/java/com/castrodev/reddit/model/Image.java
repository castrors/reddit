
package com.castrodev.reddit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Image {

    @SerializedName("id")
    private String mId;
    @SerializedName("resolutions")
    private List<Resolution> mResolutions;
    @SerializedName("source")
    private Source mSource;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public List<Resolution> getResolutions() {
        return mResolutions;
    }

    public void setResolutions(List<Resolution> resolutions) {
        mResolutions = resolutions;
    }

    public Source getSource() {
        return mSource;
    }

    public void setSource(Source source) {
        mSource = source;
    }

}
