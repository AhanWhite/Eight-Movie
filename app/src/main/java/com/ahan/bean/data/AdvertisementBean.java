package com.ahan.bean.data;

import com.ahan.bean.data.ad.AdvListBean;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */

public class AdvertisementBean {
    /**
     * advList : [{"advTag":"","endDate":1548172799,"isHorizontalScreen":false,"isOpenH5":false,"startDate":1514736000,"tag":"商城夏日特惠","type":"203","typeName":"影片详情页banner2","url":"https://static4da.mtime.cn/feature/mobile/banner/2018/0619/xrth7502101.html"}]
     * count : 1
     * error :
     * success : true
     */

    @SerializedName("count")
    private int count;
    @SerializedName("error")
    private String error;
    @SerializedName("success")
    private boolean success;
    @SerializedName("advList")
    private List<AdvListBean> advList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<AdvListBean> getAdvList() {
        return advList;
    }

    public void setAdvList(List<AdvListBean> advList) {
        this.advList = advList;
    }

}