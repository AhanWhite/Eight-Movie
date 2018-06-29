package com.ahan.bean.data.basic;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahan on 2018/6/28 23:23
 * E-mail Address: ahanwhite@163.com
 */
public class ActorsBean {
    /**
     * actorId : 926636
     * img : http://img31.mtime.cn/ph/2014/02/22/200937.77698446_1280X720X2.jpg
     * name : 格雷格·T·尼尔森
     * nameEn : Craig T. Nelson
     * roleImg :
     * roleName : “大力神”巴鲍伯
     */

    @SerializedName("actorId")
    private int actorId;
    @SerializedName("img")
    private String img;
    @SerializedName("name")
    private String name;
    @SerializedName("nameEn")
    private String nameEn;
    @SerializedName("roleImg")
    private String roleImg;
    @SerializedName("roleName")
    private String roleName;

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getRoleImg() {
        return roleImg;
    }

    public void setRoleImg(String roleImg) {
        this.roleImg = roleImg;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}