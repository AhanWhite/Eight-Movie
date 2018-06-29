package com.ahan.bean.data;

import com.ahan.bean.data.basic.ActorsBean;
import com.ahan.bean.data.basic.AwardBean;
import com.ahan.bean.data.basic.CommunityBean;
import com.ahan.bean.data.basic.DirectorBean;
import com.ahan.bean.data.basic.QuizGameBean;
import com.ahan.bean.data.basic.StageImgBean;
import com.ahan.bean.data.basic.StyleBean;
import com.ahan.bean.data.basic.VideoBean;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class BasicBean {
    /**
     * actors : [{"actorId":926636,"img":"http://img31.mtime.cn/ph/2014/02/22/200937.77698446_1280X720X2.jpg","name":"格雷格·T·尼尔森","nameEn":"Craig T. Nelson","roleImg":"","roleName":"\u201c大力神\u201d巴鲍伯"},{"actorId":926136,"img":"http://img31.mtime.cn/ph/2014/03/19/172748.99100703_1280X720X2.jpg","name":"霍利·亨特","nameEn":"Holly Hunter","roleImg":"","roleName":"\u201c橡皮女\u201d巴荷莉"},{"actorId":926645,"img":"http://img5.mtime.cn/ph/2018/01/02/082633.21866669_1280X720X2.jpg","name":"莎拉·沃威尔","nameEn":"Sarah Vowell","roleImg":"","roleName":"\u201c金钟罩\u201d巴小倩"},{"actorId":2285924,"img":"http://img5.mtime.cn/ph/2018/05/31/094137.72465628_1280X720X2.jpg","name":"赫克·米尔纳","nameEn":"Huck Milner","roleImg":"","roleName":"\u201c飞毛腿\u201d巴小飞"},{"actorId":913101,"img":"http://img31.mtime.cn/ph/2014/03/14/152328.88324192_1280X720X2.jpg","name":"塞缪尔·杰克逊","nameEn":"Samuel L. Jackson","roleImg":"","roleName":"Lucius Best /              Frozone       (voice)"},{"actorId":899082,"img":"http://img31.mtime.cn/ph/2016/08/26/185716.58933968_1280X720X2.jpg","name":"布拉德·伯德","nameEn":"Brad Bird","roleImg":"","roleName":"衣夫人"},{"actorId":898288,"img":"http://img31.mtime.cn/ph/2016/06/24/100543.86241781_1280X720X2.jpg","name":"约翰·拉岑贝格","nameEn":"John Ratzenberger","roleImg":"","roleName":"The Underminer       (voice)"},{"actorId":912772,"img":"http://img31.mtime.cn/ph/2016/03/23/083251.98699339_1280X720X2.jpg","name":"凯瑟琳·基纳","nameEn":"Catherine Keener","roleImg":"","roleName":"Evelyn Deavor       (voice)"},{"actorId":929261,"img":"http://img31.mtime.cn/ph/2014/03/14/153524.81664958_1280X720X2.jpg","name":"鲍勃·奥登科克","nameEn":"Bob Odenkirk","roleImg":"","roleName":"Winston Deavor       (voice)"},{"actorId":947089,"img":"http://img31.mtime.cn/ph/2016/01/11/091935.88640968_1280X720X2.jpg","name":"索菲亚·布什","nameEn":"Sophia Bush","roleImg":"","roleName":"Voyd       (voice)"},{"actorId":959266,"img":"http://img31.mtime.cn/ph/2014/07/31/172945.83432643_1280X720X2.jpg","name":"乔纳森·班克斯","nameEn":"Jonathan Banks","roleImg":"","roleName":"Rick Dicker       (voice)"},{"actorId":920388,"img":"http://img31.mtime.cn/ph/2014/02/22/200243.35228561_1280X720X2.jpg","name":"伊莎贝拉·罗西里尼","nameEn":"Isabella Rossellini","roleImg":"","roleName":"Ambassador       (voice)"},{"actorId":926650,"img":"http://img31.mtime.cn/ph/650/926650/926650_1280X720X2.jpg","name":"","nameEn":"Kimberly Adair Clark","roleImg":"","roleName":"Honey       (voice)"},{"actorId":1692637,"img":"http://img31.mtime.cn/ph/637/1692637/1692637_1280X720X2.jpg","name":"","nameEn":"Toya Turner","roleImg":"","roleName":"Honey Best /              FroZone's Wife       (voice)"}]
     * award : {"awardList":[],"totalNominateAward":0,"totalWinAward":0}
     * bigImage :
     * commentSpecial : 超能家族时隔14年全员回归
     * community : {}
     * director : {"directorId":899082,"img":"http://img31.mtime.cn/ph/2016/08/26/185716.58933968_1280X720X2.jpg","name":"布拉德·伯德","nameEn":"Brad Bird"}
     * festivals : []
     * hotRanking : -1
     * img : http://img5.mtime.cn/mt/2018/05/23/125020.85709614_1280X720X2.jpg
     * is3D : true
     * isDMAX : true
     * isEggHunt : false
     * isFilter : false
     * isIMAX : false
     * isIMAX3D : true
     * isTicket : true
     * message : 该操作将清除您对该片的评分！是否确认？
     * mins : 126分钟
     * movieId : 223686
     * movieStatus : 1
     * name : 超人总动员2
     * nameEn : The Incredibles 2
     * overallRating : 8
     * personCount : 34
     * quizGame : {}
     * releaseArea : 中国
     * releaseDate : 20180622
     * sensitiveStatus : false
     * showCinemaCount : 106
     * showDay : 1529740800
     * showtimeCount : 743
     * stageImg : {"count":119,"list":[{"imgId":7421373,"imgUrl":"http://img5.mtime.cn/pi/2018/01/18/085436.31609336_1280X720X2.jpg"},{"imgId":7455683,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173744.60010977_1280X720X2.jpg"},{"imgId":7455684,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173742.76535688_1280X720X2.jpg"},{"imgId":7455685,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173743.93646889_1280X720X2.jpg"}]}
     * story : “弹力女超人”巴荷莉（霍利·亨特配音）成为故事主角，“超能先生”巴鲍伯（格雷格·T·尼尔森配音）则在家里过起了英雄的“平凡”生活。但是，新的恶势力再度出现，策划了缜密而危险的阴谋，超人家族必须共同联手，彻底摧毁恶棍的诡计！
     * style : {"isLeadPage":0,"leadImg":"https://img2.mtime.cn/mg/.jpg","leadUrl":""}
     * totalNominateAward : 0
     * totalWinAward : 0
     * type : ["动画","动作","冒险","喜剧","家庭","科幻"]
     * url : https://movie.mtime.com/223686/
     * video : {"count":14,"hightUrl":"https://vfx.mtime.cn/Video/2018/05/23/mp4/180523181340166095.mp4","img":"http://img5.mtime.cn/mg/2018/05/23/181529.48182656_235X132X4.jpg","title":"超人总动员2 中文定档预告片","url":"https://vfx.mtime.cn/Video/2018/05/23/mp4/180523181340166095_480.mp4","videoId":70664,"videoSourceType":1}
     */

    @SerializedName("award")
    private AwardBean award;
    @SerializedName("bigImage")
    private String bigImage;
    @SerializedName("commentSpecial")
    private String commentSpecial;
    @SerializedName("community")
    private CommunityBean community;
    @SerializedName("director")
    private DirectorBean director;
    @SerializedName("hotRanking")
    private int hotRanking;
    @SerializedName("img")
    private String img;
    @SerializedName("is3D")
    private boolean is3D;
    @SerializedName("isDMAX")
    private boolean isDMAX;
    @SerializedName("isEggHunt")
    private boolean isEggHunt;
    @SerializedName("isFilter")
    private boolean isFilter;
    @SerializedName("isIMAX")
    private boolean isIMAX;
    @SerializedName("isIMAX3D")
    private boolean isIMAX3D;
    @SerializedName("isTicket")
    private boolean isTicket;
    @SerializedName("message")
    private String message;
    @SerializedName("mins")
    private String mins;
    @SerializedName("movieId")
    private int movieId;
    @SerializedName("movieStatus")
    private int movieStatus;
    @SerializedName("name")
    private String name;
    @SerializedName("nameEn")
    private String nameEn;
    @SerializedName("overallRating")
    private double overallRating;
    @SerializedName("personCount")
    private int personCount;
    @SerializedName("quizGame")
    private QuizGameBean quizGame;
    @SerializedName("releaseArea")
    private String releaseArea;
    @SerializedName("releaseDate")
    private String releaseDate;
    @SerializedName("sensitiveStatus")
    private boolean sensitiveStatus;
    @SerializedName("showCinemaCount")
    private int showCinemaCount;
    @SerializedName("showDay")
    private int showDay;
    @SerializedName("showtimeCount")
    private int showtimeCount;
    @SerializedName("stageImg")
    private StageImgBean stageImg;
    @SerializedName("story")
    private String story;
    @SerializedName("style")
    private StyleBean style;
    @SerializedName("totalNominateAward")
    private int totalNominateAward;
    @SerializedName("totalWinAward")
    private int totalWinAward;
    @SerializedName("url")
    private String url;
    @SerializedName("video")
    private VideoBean video;
    @SerializedName("actors")
    private List<ActorsBean> actors;
    @SerializedName("festivals")
    private List<?> festivals;
    @SerializedName("type")
    private List<String> type;

    public AwardBean getAward() {
        return award;
    }

    public void setAward(AwardBean award) {
        this.award = award;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getCommentSpecial() {
        return commentSpecial;
    }

    public void setCommentSpecial(String commentSpecial) {
        this.commentSpecial = commentSpecial;
    }

    public CommunityBean getCommunity() {
        return community;
    }

    public void setCommunity(CommunityBean community) {
        this.community = community;
    }

    public DirectorBean getDirector() {
        return director;
    }

    public void setDirector(DirectorBean director) {
        this.director = director;
    }

    public int getHotRanking() {
        return hotRanking;
    }

    public void setHotRanking(int hotRanking) {
        this.hotRanking = hotRanking;
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

    public boolean isIsEggHunt() {
        return isEggHunt;
    }

    public void setIsEggHunt(boolean isEggHunt) {
        this.isEggHunt = isEggHunt;
    }

    public boolean isIsFilter() {
        return isFilter;
    }

    public void setIsFilter(boolean isFilter) {
        this.isFilter = isFilter;
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

    public boolean isIsTicket() {
        return isTicket;
    }

    public void setIsTicket(boolean isTicket) {
        this.isTicket = isTicket;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMins() {
        return mins;
    }

    public void setMins(String mins) {
        this.mins = mins;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(int movieStatus) {
        this.movieStatus = movieStatus;
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

    public double getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(double overallRating) {
        this.overallRating = overallRating;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public QuizGameBean getQuizGame() {
        return quizGame;
    }

    public void setQuizGame(QuizGameBean quizGame) {
        this.quizGame = quizGame;
    }

    public String getReleaseArea() {
        return releaseArea;
    }

    public void setReleaseArea(String releaseArea) {
        this.releaseArea = releaseArea;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isSensitiveStatus() {
        return sensitiveStatus;
    }

    public void setSensitiveStatus(boolean sensitiveStatus) {
        this.sensitiveStatus = sensitiveStatus;
    }

    public int getShowCinemaCount() {
        return showCinemaCount;
    }

    public void setShowCinemaCount(int showCinemaCount) {
        this.showCinemaCount = showCinemaCount;
    }

    public int getShowDay() {
        return showDay;
    }

    public void setShowDay(int showDay) {
        this.showDay = showDay;
    }

    public int getShowtimeCount() {
        return showtimeCount;
    }

    public void setShowtimeCount(int showtimeCount) {
        this.showtimeCount = showtimeCount;
    }

    public StageImgBean getStageImg() {
        return stageImg;
    }

    public void setStageImg(StageImgBean stageImg) {
        this.stageImg = stageImg;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public StyleBean getStyle() {
        return style;
    }

    public void setStyle(StyleBean style) {
        this.style = style;
    }

    public int getTotalNominateAward() {
        return totalNominateAward;
    }

    public void setTotalNominateAward(int totalNominateAward) {
        this.totalNominateAward = totalNominateAward;
    }

    public int getTotalWinAward() {
        return totalWinAward;
    }

    public void setTotalWinAward(int totalWinAward) {
        this.totalWinAward = totalWinAward;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoBean getVideo() {
        return video;
    }

    public void setVideo(VideoBean video) {
        this.video = video;
    }

    public List<ActorsBean> getActors() {
        return actors;
    }

    public void setActors(List<ActorsBean> actors) {
        this.actors = actors;
    }

    public List<?> getFestivals() {
        return festivals;
    }

    public void setFestivals(List<?> festivals) {
        this.festivals = festivals;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

}
