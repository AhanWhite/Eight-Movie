package com.ahan.eight;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class Movies  implements Serializable {

    /**
     * count : 15
     * movies : [{"actorName1":"克里斯·帕拉特","actorName2":"布莱丝·达拉斯·霍华德","btnText":"","commonSpecial":"恐龙纪元震撼回归 特效全面升级","directorName":"胡安·安东尼奥·巴亚纳","img":"http://img5.mtime.cn/mt/2018/05/25/100000.65855294_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":128,"movieId":225759,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":121,"nearestShowDay":1529740800,"nearestShowtimeCount":1198},"preferentialFlag":false,"rDay":15,"rMonth":6,"rYear":2018,"ratingFinal":7.3,"titleCn":"侏罗纪世界2","titleEn":"Jurassic World: Fallen Kingdom","type":"动作 / 冒险 / 科幻","wantedCount":8864},{"actorName1":"格雷格·T·尼尔森","actorName2":"霍利·亨特","btnText":"","commonSpecial":"超能家族时隔14年全员回归","directorName":"布拉德·伯德","img":"http://img5.mtime.cn/mt/2018/05/23/125020.85709614_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":126,"movieId":223686,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":109,"nearestShowDay":1529740800,"nearestShowtimeCount":1044},"preferentialFlag":false,"rDay":22,"rMonth":6,"rYear":2018,"ratingFinal":8,"titleCn":"超人总动员2","titleEn":"The Incredibles 2","type":"动画 / 动作 / 冒险","wantedCount":2440},{"actorName1":"张国荣","actorName2":"张曼玉","btnText":"","commonSpecial":"这世界上有一种鸟是没有脚的","directorName":"王家卫","img":"http://img5.mtime.cn/mt/2018/06/21/113853.36979689_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":94,"movieId":10053,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":1,"nearestShowDay":1529827200,"nearestShowtimeCount":1},"preferentialFlag":false,"rDay":25,"rMonth":6,"rYear":2018,"ratingFinal":8.3,"titleCn":"阿飞正传","titleEn":"Days of Being Wild","type":"剧情","wantedCount":1300},{"actorName1":"王千源","actorName2":"袁姗姗","btnText":"","commonSpecial":"王千源袁姗姗刑警小队乌龙不断","directorName":"李昕芸","img":"http://img5.mtime.cn/mt/2018/06/11/114337.56675383_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":93,"movieId":244257,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":99,"nearestShowDay":1529740800,"nearestShowtimeCount":556},"preferentialFlag":false,"rDay":22,"rMonth":6,"rYear":2018,"ratingFinal":5.6,"titleCn":"龙虾刑警","titleEn":"Lobster Cop","type":"喜剧 / 犯罪 / 动作","wantedCount":513},{"actorName1":"李易峰","actorName2":"迈克尔·道格拉斯","btnText":"","commonSpecial":"生死游戏中直面人性的自私与残酷","directorName":"韩延","img":"http://img5.mtime.cn/mt/2018/06/24/173836.91706768_1280X720X2.jpg","is3D":true,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":132,"movieId":240989,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":69,"nearestShowDay":1529740800,"nearestShowtimeCount":268},"preferentialFlag":false,"rDay":29,"rMonth":6,"rYear":2018,"ratingFinal":-1,"titleCn":"动物世界","titleEn":"Animal World","type":"动作 / 剧情 / 悬疑","wantedCount":2414},{"actorName1":"小沈阳","actorName2":"潘斌龙","btnText":"","commonSpecial":"小沈阳和潘斌龙勇闯台湾五湖帮","directorName":"小沈阳","img":"http://img5.mtime.cn/mt/2018/06/05/091818.46413077_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":100,"movieId":234987,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":62,"nearestShowDay":1529740800,"nearestShowtimeCount":174},"preferentialFlag":false,"rDay":15,"rMonth":6,"rYear":2018,"ratingFinal":4.5,"titleCn":"猛虫过江","titleEn":"A strong insect crossing the river","type":"喜剧 / 动作","wantedCount":451},{"actorName1":"小日向文世","actorName2":"深津绘里","btnText":"","commonSpecial":"全球大断电 为活下去拼了","directorName":"矢口史靖","img":"http://img5.mtime.cn/mt/2018/06/12/102343.67282689_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":117,"movieId":237536,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":57,"nearestShowDay":1529740800,"nearestShowtimeCount":151},"preferentialFlag":false,"rDay":22,"rMonth":6,"rYear":2018,"ratingFinal":8.2,"titleCn":"生存家族","titleEn":"サバイバルファミリー","type":"喜剧","wantedCount":229},{"actorName1":"西尔维斯特·史泰龙","actorName2":"黄晓明","btnText":"","commonSpecial":"","directorName":"史蒂芬·C·米勒","img":"http://img5.mtime.cn/mt/2018/06/06/122847.71875760_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":93,"movieId":237446,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":54,"nearestShowDay":1530259200,"nearestShowtimeCount":340},"preferentialFlag":false,"rDay":29,"rMonth":6,"rYear":2018,"ratingFinal":3.8,"titleCn":"金蝉脱壳2","titleEn":"Escape Plan 2: Hades","type":"动作 / 惊悚","wantedCount":1148},{"actorName1":"徐峥","actorName2":"周一围","btnText":"","commonSpecial":"小人物因\"药\"变英雄实现自我救赎","directorName":"文牧野","img":"http://img5.mtime.cn/mt/2018/06/21/102400.44145684_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":true,"isIMAX3D":false,"isNew":false,"length":116,"movieId":242167,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":39,"nearestShowDay":1530345600,"nearestShowtimeCount":62},"preferentialFlag":false,"rDay":6,"rMonth":7,"rYear":2018,"ratingFinal":-1,"titleCn":"我不是药神","titleEn":"Dying To Survive","type":"剧情 / 喜剧","wantedCount":1275},{"actorName1":"小罗伯特·唐尼","actorName2":"克里斯·埃文斯","btnText":"","commonSpecial":"复联全员与灭霸巅峰一役引人注目","directorName":"安东尼·罗素","img":"http://img5.mtime.cn/mt/2018/03/30/101316.99752366_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":150,"movieId":217497,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":22,"nearestShowDay":1529740800,"nearestShowtimeCount":40},"preferentialFlag":false,"rDay":11,"rMonth":5,"rYear":2018,"ratingFinal":8.1,"titleCn":"复仇者联盟3：无限战争","titleEn":"Avengers: Infinity War","type":"动作 / 冒险 / 奇幻","wantedCount":14566},{"actorName1":"雷佳音","actorName2":"佟丽娅","btnText":"","commonSpecial":"雷佳音佟丽娅时空交错同居一室","directorName":"苏伦","img":"http://img5.mtime.cn/mt/2018/05/05/175421.64702950_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":101,"movieId":250729,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":19,"nearestShowDay":1529740800,"nearestShowtimeCount":36},"preferentialFlag":false,"rDay":18,"rMonth":5,"rYear":2018,"ratingFinal":6.8,"titleCn":"超时空同居","titleEn":"How Long Will I Love U","type":"奇幻 / 喜剧","wantedCount":918},{"actorName1":"梁静","actorName2":"赵立新","btnText":"","commonSpecial":"梁静赵立新北极之旅杀机四伏","directorName":"李伟","img":"http://img5.mtime.cn/mt/2018/06/01/115505.67403758_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":88,"movieId":225726,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":34,"nearestShowDay":1529740800,"nearestShowtimeCount":56},"preferentialFlag":false,"rDay":22,"rMonth":6,"rYear":2018,"ratingFinal":6.3,"titleCn":"伊阿索密码","titleEn":"The Secret Of Immortal Code","type":"惊悚 / 悬疑","wantedCount":47},{"actorName1":"Joshua Graham","actorName2":"Matt Gilbert","btnText":"","commonSpecial":"","directorName":"波瑞斯·阿金诺威可","img":"http://img5.mtime.cn/mt/2018/05/30/103453.69566094_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":88,"movieId":219707,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":23,"nearestShowDay":1529740800,"nearestShowtimeCount":38},"preferentialFlag":false,"rDay":16,"rMonth":6,"rYear":2018,"ratingFinal":-1,"titleCn":"第七个小矮人","titleEn":"The Seventh Dwarf","type":"动画 / 冒险 / 喜剧","wantedCount":88},{"actorName1":"切尔西·洛佩兹","actorName2":"安娜·德拉·克鲁兹","btnText":"","commonSpecial":"原来地球真来过UFO?","directorName":"贾斯廷·巴伯","img":"http://img5.mtime.cn/mt/2018/06/19/151056.29996172_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":true,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":80,"movieId":242396,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":26,"nearestShowDay":1529740800,"nearestShowtimeCount":34},"preferentialFlag":false,"rDay":22,"rMonth":6,"rYear":2018,"ratingFinal":5.1,"titleCn":"凤凰城遗忘录","titleEn":"Phoenix Forgotten","type":"科幻 / 恐怖 / 悬疑","wantedCount":219},{"actorName1":"吴镇宇","actorName2":"张智霖","btnText":"","commonSpecial":"张智霖吴镇宇对抗病毒危机","directorName":"邱礼涛","img":"http://img5.mtime.cn/mt/2018/06/12/144615.15753425_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":102,"movieId":250595,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":19,"nearestShowDay":1529740800,"nearestShowtimeCount":27},"preferentialFlag":false,"rDay":15,"rMonth":6,"rYear":2018,"ratingFinal":5.7,"titleCn":"泄密者","titleEn":"The Leaker","type":"犯罪 / 动作 / 悬疑","wantedCount":346}]
     * totalCinemaCount : 210
     * totalComingMovie : 50
     * totalHotMovie : 44
     */

    @SerializedName("count")
    private int count;
    @SerializedName("totalCinemaCount")
    private int totalCinemaCount;
    @SerializedName("totalComingMovie")
    private int totalComingMovie;
    @SerializedName("totalHotMovie")
    private int totalHotMovie;
    @SerializedName("movies")
    private List<MoviesBean> movies;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalCinemaCount() {
        return totalCinemaCount;
    }

    public void setTotalCinemaCount(int totalCinemaCount) {
        this.totalCinemaCount = totalCinemaCount;
    }

    public int getTotalComingMovie() {
        return totalComingMovie;
    }

    public void setTotalComingMovie(int totalComingMovie) {
        this.totalComingMovie = totalComingMovie;
    }

    public int getTotalHotMovie() {
        return totalHotMovie;
    }

    public void setTotalHotMovie(int totalHotMovie) {
        this.totalHotMovie = totalHotMovie;
    }

    public List<MoviesBean> getMovies() {
        return movies;
    }

    public void setMovies(List<MoviesBean> movies) {
        this.movies = movies;
    }

    public static class MoviesBean  implements Serializable {
        /**
         * actorName1 : 克里斯·帕拉特
         * actorName2 : 布莱丝·达拉斯·霍华德
         * btnText :
         * commonSpecial : 恐龙纪元震撼回归 特效全面升级
         * directorName : 胡安·安东尼奥·巴亚纳
         * img : http://img5.mtime.cn/mt/2018/05/25/100000.65855294_1280X720X2.jpg
         * is3D : true
         * isDMAX : true
         * isFilter : false
         * isHot : true
         * isIMAX : false
         * isIMAX3D : true
         * isNew : false
         * length : 128
         * movieId : 225759
         * nearestShowtime : {"isTicket":true,"nearestCinemaCount":121,"nearestShowDay":1529740800,"nearestShowtimeCount":1198}
         * preferentialFlag : false
         * rDay : 15
         * rMonth : 6
         * rYear : 2018
         * ratingFinal : 7.3
         * titleCn : 侏罗纪世界2
         * titleEn : Jurassic World: Fallen Kingdom
         * type : 动作 / 冒险 / 科幻
         * wantedCount : 8864
         */

        @SerializedName("actorName1")
        private String actorName1;
        @SerializedName("actorName2")
        private String actorName2;
        @SerializedName("btnText")
        private String btnText;
        @SerializedName("commonSpecial")
        private String commonSpecial;
        @SerializedName("directorName")
        private String directorName;
        @SerializedName("img")
        private String img;
        @SerializedName("is3D")
        private boolean is3D;
        @SerializedName("isDMAX")
        private boolean isDMAX;
        @SerializedName("isFilter")
        private boolean isFilter;
        @SerializedName("isHot")
        private boolean isHot;
        @SerializedName("isIMAX")
        private boolean isIMAX;
        @SerializedName("isIMAX3D")
        private boolean isIMAX3D;
        @SerializedName("isNew")
        private boolean isNew;
        @SerializedName("length")
        private int length;
        @SerializedName("movieId")
        private int movieId;
        @SerializedName("nearestShowtime")
        private NearestShowtimeBean nearestShowtime;
        @SerializedName("preferentialFlag")
        private boolean preferentialFlag;
        @SerializedName("rDay")
        private int rDay;
        @SerializedName("rMonth")
        private int rMonth;
        @SerializedName("rYear")
        private int rYear;
        @SerializedName("ratingFinal")
        private double ratingFinal;
        @SerializedName("titleCn")
        private String titleCn;
        @SerializedName("titleEn")
        private String titleEn;
        @SerializedName("type")
        private String type;
        @SerializedName("wantedCount")
        private int wantedCount;

        public String getActorName1() {
            return actorName1;
        }

        public void setActorName1(String actorName1) {
            this.actorName1 = actorName1;
        }

        public String getActorName2() {
            return actorName2;
        }

        public void setActorName2(String actorName2) {
            this.actorName2 = actorName2;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        public String getCommonSpecial() {
            return commonSpecial;
        }

        public void setCommonSpecial(String commonSpecial) {
            this.commonSpecial = commonSpecial;
        }

        public String getDirectorName() {
            return directorName;
        }

        public void setDirectorName(String directorName) {
            this.directorName = directorName;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public boolean isIs3D() {
            return is3D;
        }

        public void setIs3D(boolean is3D) {
            this.is3D = is3D;
        }

        public boolean isIsDMAX() {
            return isDMAX;
        }

        public void setIsDMAX(boolean isDMAX) {
            this.isDMAX = isDMAX;
        }

        public boolean isIsFilter() {
            return isFilter;
        }

        public void setIsFilter(boolean isFilter) {
            this.isFilter = isFilter;
        }

        public boolean isIsHot() {
            return isHot;
        }

        public void setIsHot(boolean isHot) {
            this.isHot = isHot;
        }

        public boolean isIsIMAX() {
            return isIMAX;
        }

        public void setIsIMAX(boolean isIMAX) {
            this.isIMAX = isIMAX;
        }

        public boolean isIsIMAX3D() {
            return isIMAX3D;
        }

        public void setIsIMAX3D(boolean isIMAX3D) {
            this.isIMAX3D = isIMAX3D;
        }

        public boolean isIsNew() {
            return isNew;
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public NearestShowtimeBean getNearestShowtime() {
            return nearestShowtime;
        }

        public void setNearestShowtime(NearestShowtimeBean nearestShowtime) {
            this.nearestShowtime = nearestShowtime;
        }

        public boolean isPreferentialFlag() {
            return preferentialFlag;
        }

        public void setPreferentialFlag(boolean preferentialFlag) {
            this.preferentialFlag = preferentialFlag;
        }

        public int getRDay() {
            return rDay;
        }

        public void setRDay(int rDay) {
            this.rDay = rDay;
        }

        public int getRMonth() {
            return rMonth;
        }

        public void setRMonth(int rMonth) {
            this.rMonth = rMonth;
        }

        public int getRYear() {
            return rYear;
        }

        public void setRYear(int rYear) {
            this.rYear = rYear;
        }

        public double getRatingFinal() {
            return ratingFinal;
        }

        public void setRatingFinal(double ratingFinal) {
            this.ratingFinal = ratingFinal;
        }

        public String getTitleCn() {
            return titleCn;
        }

        public void setTitleCn(String titleCn) {
            this.titleCn = titleCn;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getWantedCount() {
            return wantedCount;
        }

        public void setWantedCount(int wantedCount) {
            this.wantedCount = wantedCount;
        }

        public static class NearestShowtimeBean  implements Serializable {
            /**
             * isTicket : true
             * nearestCinemaCount : 121
             * nearestShowDay : 1529740800
             * nearestShowtimeCount : 1198
             */

            @SerializedName("isTicket")
            private boolean isTicket;
            @SerializedName("nearestCinemaCount")
            private int nearestCinemaCount;
            @SerializedName("nearestShowDay")
            private int nearestShowDay;
            @SerializedName("nearestShowtimeCount")
            private int nearestShowtimeCount;

            public boolean isIsTicket() {
                return isTicket;
            }

            public void setIsTicket(boolean isTicket) {
                this.isTicket = isTicket;
            }

            public int getNearestCinemaCount() {
                return nearestCinemaCount;
            }

            public void setNearestCinemaCount(int nearestCinemaCount) {
                this.nearestCinemaCount = nearestCinemaCount;
            }

            public int getNearestShowDay() {
                return nearestShowDay;
            }

            public void setNearestShowDay(int nearestShowDay) {
                this.nearestShowDay = nearestShowDay;
            }

            public int getNearestShowtimeCount() {
                return nearestShowtimeCount;
            }

            public void setNearestShowtimeCount(int nearestShowtimeCount) {
                this.nearestShowtimeCount = nearestShowtimeCount;
            }
        }
    }
}
