package com.ahan.bean.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class BoxOfficeBean {
    /**
     * movieId : 223686
     * ranking : 2
     * todayBox : 493040824
     * todayBoxDes : 493.04
     * todayBoxDesUnit : 今日实时(万)
     * totalBox : 17071044155
     * totalBoxDes : 1.71
     * totalBoxUnit : 累计票房(亿)
     */

    @SerializedName("movieId")
    private int movieId;
    @SerializedName("ranking")
    private int ranking;
    @SerializedName("todayBox")
    private int todayBox;
    @SerializedName("todayBoxDes")
    private String todayBoxDes;
    @SerializedName("todayBoxDesUnit")
    private String todayBoxDesUnit;
    @SerializedName("totalBox")
    private long totalBox;
    @SerializedName("totalBoxDes")
    private String totalBoxDes;
    @SerializedName("totalBoxUnit")
    private String totalBoxUnit;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getTodayBox() {
        return todayBox;
    }

    public void setTodayBox(int todayBox) {
        this.todayBox = todayBox;
    }

    public String getTodayBoxDes() {
        return todayBoxDes;
    }

    public void setTodayBoxDes(String todayBoxDes) {
        this.todayBoxDes = todayBoxDes;
    }

    public String getTodayBoxDesUnit() {
        return todayBoxDesUnit;
    }

    public void setTodayBoxDesUnit(String todayBoxDesUnit) {
        this.todayBoxDesUnit = todayBoxDesUnit;
    }

    public long getTotalBox() {
        return totalBox;
    }

    public void setTotalBox(long totalBox) {
        this.totalBox = totalBox;
    }

    public String getTotalBoxDes() {
        return totalBoxDes;
    }

    public void setTotalBoxDes(String totalBoxDes) {
        this.totalBoxDes = totalBoxDes;
    }

    public String getTotalBoxUnit() {
        return totalBoxUnit;
    }

    public void setTotalBoxUnit(String totalBoxUnit) {
        this.totalBoxUnit = totalBoxUnit;
    }
}