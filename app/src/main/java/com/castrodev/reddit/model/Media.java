
package com.castrodev.reddit.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Media {

    @SerializedName("oembed")
    private Oembed mOembed;
    @SerializedName("type")
    private String mType;

    public Oembed getOembed() {
        return mOembed;
    }

    public void setOembed(Oembed oembed) {
        mOembed = oembed;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
