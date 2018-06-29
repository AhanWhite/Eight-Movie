package com.ahan.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class LiveBean {
    /**
     * count : 0
     * img :
     * liveId : 0
     * playNumTag :
     * playTag :
     * status : 3
     * title :
     */

    @SerializedName("count")
    private int count;
    @SerializedName("img")
    private String img;
    @SerializedName("liveId")
    private int liveId;
    @SerializedName("playNumTag")
    private String playNumTag;
    @SerializedName("playTag")
    private String playTag;
    @SerializedName("status")
    private int status;
    @SerializedName("title")
    private String title;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getLiveId() {
        return liveId;
    }

    public void setLiveId(int liveId) {
        this.liveId = liveId;
    }

    public String getPlayNumTag() {
        return playNumTag;
    }

    public void setPlayNumTag(String playNumTag) {
        this.playNumTag = playNumTag;
    }

    public String getPlayTag() {
        return playTag;
    }

    public void setPlayTag(String playTag) {
        this.playTag = playTag;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}