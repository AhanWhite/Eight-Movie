package com.ahan.bean.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class RelatedBean {
    /**
     * goodsCount : 0
     * goodsList : []
     * relateId : 0
     * relatedUrl : https://mall-wv.mtime.cn/#!/commerce/list/
     * type : 0
     */

    @SerializedName("goodsCount")
    private int goodsCount;
    @SerializedName("relateId")
    private int relateId;
    @SerializedName("relatedUrl")
    private String relatedUrl;
    @SerializedName("type")
    private int type;
    @SerializedName("goodsList")
    private List<?> goodsList;

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public int getRelateId() {
        return relateId;
    }

    public void setRelateId(int relateId) {
        this.relateId = relateId;
    }

    public String getRelatedUrl() {
        return relatedUrl;
    }

    public void setRelatedUrl(String relatedUrl) {
        this.relatedUrl = relatedUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<?> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<?> goodsList) {
        this.goodsList = goodsList;
    }
}