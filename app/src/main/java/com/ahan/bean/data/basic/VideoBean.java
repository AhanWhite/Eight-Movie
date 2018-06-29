package com.ahan.bean.data.basic;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahan on 2018/6/28 23:22
 * E-mail Address: ahanwhite@163.com
 */
public class VideoBean {
    /**
     * count : 14
     * hightUrl : https://vfx.mtime.cn/Video/2018/05/23/mp4/180523181340166095.mp4
     * img : http://img5.mtime.cn/mg/2018/05/23/181529.48182656_235X132X4.jpg
     * title : 超人总动员2 中文定档预告片
     * url : https://vfx.mtime.cn/Video/2018/05/23/mp4/180523181340166095_480.mp4
     * videoId : 70664
     * videoSourceType : 1
     */

    @SerializedName("count")
    private int count;
    @SerializedName("hightUrl")
    private String hightUrl;
    @SerializedName("img")
    private String img;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;
    @SerializedName("videoId")
    private int videoId;
    @SerializedName("videoSourceType")
    private int videoSourceType;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getHightUrl() {
        return hightUrl;
    }

    public void setHightUrl(String hightUrl) {
        this.hightUrl = hightUrl;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getVideoSourceType() {
        return videoSourceType;
    }

    public void setVideoSourceType(int videoSourceType) {
        this.videoSourceType = videoSourceType;
    }
}
