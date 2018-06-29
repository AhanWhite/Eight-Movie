package com.ahan.bean.data.basic;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahan on 2018/6/28 23:22
 * E-mail Address: ahanwhite@163.com
 */
public class StyleBean {
    /**
     * isLeadPage : 0
     * leadImg : https://img2.mtime.cn/mg/.jpg
     * leadUrl :
     */

    @SerializedName("isLeadPage")
    private int isLeadPage;
    @SerializedName("leadImg")
    private String leadImg;
    @SerializedName("leadUrl")
    private String leadUrl;

    public int getIsLeadPage() {
        return isLeadPage;
    }

    public void setIsLeadPage(int isLeadPage) {
        this.isLeadPage = isLeadPage;
    }

    public String getLeadImg() {
        return leadImg;
    }

    public void setLeadImg(String leadImg) {
        this.leadImg = leadImg;
    }

    public String getLeadUrl() {
        return leadUrl;
    }

    public void setLeadUrl(String leadUrl) {
        this.leadUrl = leadUrl;
    }
}
