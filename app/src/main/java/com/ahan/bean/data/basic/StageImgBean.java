package com.ahan.bean.data.basic;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ahan on 2018/6/28 23:21
 * E-mail Address: ahanwhite@163.com
 */
public class StageImgBean {
    /**
     * count : 119
     * list : [{"imgId":7421373,"imgUrl":"http://img5.mtime.cn/pi/2018/01/18/085436.31609336_1280X720X2.jpg"},{"imgId":7455683,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173744.60010977_1280X720X2.jpg"},{"imgId":7455684,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173742.76535688_1280X720X2.jpg"},{"imgId":7455685,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173743.93646889_1280X720X2.jpg"}]
     */

    @SerializedName("count")
    private int count;
    @SerializedName("list")
    private List<ListBean> list;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * imgId : 7421373
         * imgUrl : http://img5.mtime.cn/pi/2018/01/18/085436.31609336_1280X720X2.jpg
         */

        @SerializedName("imgId")
        private int imgId;
        @SerializedName("imgUrl")
        private String imgUrl;

        public int getImgId() {
            return imgId;
        }

        public void setImgId(int imgId) {
            this.imgId = imgId;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }
    }
}
