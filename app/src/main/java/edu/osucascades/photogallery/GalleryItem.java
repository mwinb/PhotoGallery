package edu.osucascades.photogallery;


import com.google.gson.annotations.SerializedName;

public class GalleryItem {
    @SerializedName("title")
    private String mCaption;

    @SerializedName("id")
    private String mId;

    @SerializedName("url_s")
    private String mUrl;

    @Override
    public String toString() {
        return mCaption;
    }

    public void setId(String id) {
        mId = id;
    }

    public void setCaption(String title) {
        mCaption = title;
    }

    public void setUrl(String url_s) {
        mUrl = url_s;
    }

    public String getUrl() {
        return mUrl;
    }
}
