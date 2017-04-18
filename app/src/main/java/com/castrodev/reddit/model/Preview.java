
package com.castrodev.reddit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Preview {

    @SerializedName("enabled")
    private Boolean mEnabled;
    @SerializedName("images")
    private List<Image> mImages;

    public Boolean getEnabled() {
        return mEnabled;
    }

    public void setEnabled(Boolean enabled) {
        mEnabled = enabled;
    }

    public List<Image> getImages() {
        return mImages;
    }

    public void setImages(List<Image> images) {
        mImages = images;
    }

}
