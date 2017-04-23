package com.castrodev.reddit.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rodrigocastro on 20/04/17.
 */

public class RedditParcelableObject implements Parcelable {

    private String thumbnail;
    private String permalink;
    private Long numComments;
    private String title;
    private String url;
    private String author;

    public RedditParcelableObject() {

    }

    public RedditParcelableObject(String thumbnail, String permalink, Long numComments, String title, String url, String author) {
        this.thumbnail = thumbnail;
        this.permalink = permalink;
        this.numComments = numComments;
        this.title = title;
        this.url = url;
        this.author = author;
    }

    protected RedditParcelableObject(Parcel in) {
        thumbnail = in.readString();
        permalink = in.readString();
        title = in.readString();
        url = in.readString();
        author = in.readString();
        numComments = in.readLong();
    }

    public static final Creator<RedditParcelableObject> CREATOR = new Creator<RedditParcelableObject>() {
        @Override
        public RedditParcelableObject createFromParcel(Parcel in) {
            return new RedditParcelableObject(in);
        }

        @Override
        public RedditParcelableObject[] newArray(int size) {
            return new RedditParcelableObject[size];
        }
    };

    public String getThumbnail() {
        return thumbnail;
    }

    public String getPermalink() {
        return permalink;
    }

    public Long getNumComments() {
        return numComments;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public void setNumComments(Long numComments) {
        this.numComments = numComments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(thumbnail);
        dest.writeString(permalink);
        dest.writeString(title);
        dest.writeString(url);
        dest.writeString(author);
        dest.writeLong(numComments);
    }
}
