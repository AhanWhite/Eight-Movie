package com.ahan.bean.data.ad;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahan on 2018/6/28 23:17
 * E-mail Address: ahanwhite@163.com
 */
public class AdvListBean {
    /**
     * advTag :
     * endDate : 1548172799
     * isHorizontalScreen : false
     * isOpenH5 : false
     * startDate : 1514736000
     * tag : 商城夏日特惠
     * type : 203
     * typeName : 影片详情页banner2
     * url : https://static4da.mtime.cn/feature/mobile/banner/2018/0619/xrth7502101.html
     */

    @SerializedName("advTag")
    private String advTag;
    @SerializedName("endDate")
    private int endDate;
    @SerializedName("isHorizontalScreen")
    private boolean isHorizontalScreen;
    @SerializedName("isOpenH5")
    private boolean isOpenH5;
    @SerializedName("startDate")
    private int startDate;
    @SerializedName("tag")
    private String tag;
    @SerializedName("type")
    private String type;
    @SerializedName("typeName")
    private String typeName;
    @SerializedName("url")
    private String url;

    public String getAdvTag() {
        return advTag;
    }

    public void setAdvTag(String advTag) {
        this.advTag = advTag;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public boolean isIsHorizontalScreen() {
        return isHorizontalScreen;
    }

    public void setIsHorizontalScreen(boolean isHorizontalScreen) {
        this.isHorizontalScreen = isHorizontalScreen;
    }

    public boolean isIsOpenH5() {
        return isOpenH5;
    }

    public void setIsOpenH5(boolean isOpenH5) {
        this.isOpenH5 = isOpenH5;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}