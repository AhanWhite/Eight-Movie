package com.ahan.bean;

import com.ahan.bean.data.AdvertisementBean;
import com.ahan.bean.data.BasicBean;
import com.ahan.bean.data.BoxOfficeBean;
import com.ahan.bean.data.LiveBean;
import com.ahan.bean.data.RelatedBean;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class DataBean {
        /**
         * advertisement : {"advList":[{"advTag":"","endDate":1548172799,"isHorizontalScreen":false,"isOpenH5":false,"startDate":1514736000,"tag":"商城夏日特惠","type":"203","typeName":"影片详情页banner2","url":"https://static4da.mtime.cn/feature/mobile/banner/2018/0619/xrth7502101.html"}],"count":1,"error":"","success":true}
         * basic : {"actors":[{"actorId":926636,"img":"http://img31.mtime.cn/ph/2014/02/22/200937.77698446_1280X720X2.jpg","name":"格雷格·T·尼尔森","nameEn":"Craig T. Nelson","roleImg":"","roleName":"\u201c大力神\u201d巴鲍伯"},{"actorId":926136,"img":"http://img31.mtime.cn/ph/2014/03/19/172748.99100703_1280X720X2.jpg","name":"霍利·亨特","nameEn":"Holly Hunter","roleImg":"","roleName":"\u201c橡皮女\u201d巴荷莉"},{"actorId":926645,"img":"http://img5.mtime.cn/ph/2018/01/02/082633.21866669_1280X720X2.jpg","name":"莎拉·沃威尔","nameEn":"Sarah Vowell","roleImg":"","roleName":"\u201c金钟罩\u201d巴小倩"},{"actorId":2285924,"img":"http://img5.mtime.cn/ph/2018/05/31/094137.72465628_1280X720X2.jpg","name":"赫克·米尔纳","nameEn":"Huck Milner","roleImg":"","roleName":"\u201c飞毛腿\u201d巴小飞"},{"actorId":913101,"img":"http://img31.mtime.cn/ph/2014/03/14/152328.88324192_1280X720X2.jpg","name":"塞缪尔·杰克逊","nameEn":"Samuel L. Jackson","roleImg":"","roleName":"Lucius Best /              Frozone       (voice)"},{"actorId":899082,"img":"http://img31.mtime.cn/ph/2016/08/26/185716.58933968_1280X720X2.jpg","name":"布拉德·伯德","nameEn":"Brad Bird","roleImg":"","roleName":"衣夫人"},{"actorId":898288,"img":"http://img31.mtime.cn/ph/2016/06/24/100543.86241781_1280X720X2.jpg","name":"约翰·拉岑贝格","nameEn":"John Ratzenberger","roleImg":"","roleName":"The Underminer       (voice)"},{"actorId":912772,"img":"http://img31.mtime.cn/ph/2016/03/23/083251.98699339_1280X720X2.jpg","name":"凯瑟琳·基纳","nameEn":"Catherine Keener","roleImg":"","roleName":"Evelyn Deavor       (voice)"},{"actorId":929261,"img":"http://img31.mtime.cn/ph/2014/03/14/153524.81664958_1280X720X2.jpg","name":"鲍勃·奥登科克","nameEn":"Bob Odenkirk","roleImg":"","roleName":"Winston Deavor       (voice)"},{"actorId":947089,"img":"http://img31.mtime.cn/ph/2016/01/11/091935.88640968_1280X720X2.jpg","name":"索菲亚·布什","nameEn":"Sophia Bush","roleImg":"","roleName":"Voyd       (voice)"},{"actorId":959266,"img":"http://img31.mtime.cn/ph/2014/07/31/172945.83432643_1280X720X2.jpg","name":"乔纳森·班克斯","nameEn":"Jonathan Banks","roleImg":"","roleName":"Rick Dicker       (voice)"},{"actorId":920388,"img":"http://img31.mtime.cn/ph/2014/02/22/200243.35228561_1280X720X2.jpg","name":"伊莎贝拉·罗西里尼","nameEn":"Isabella Rossellini","roleImg":"","roleName":"Ambassador       (voice)"},{"actorId":926650,"img":"http://img31.mtime.cn/ph/650/926650/926650_1280X720X2.jpg","name":"","nameEn":"Kimberly Adair Clark","roleImg":"","roleName":"Honey       (voice)"},{"actorId":1692637,"img":"http://img31.mtime.cn/ph/637/1692637/1692637_1280X720X2.jpg","name":"","nameEn":"Toya Turner","roleImg":"","roleName":"Honey Best /              FroZone's Wife       (voice)"}],"award":{"awardList":[],"totalNominateAward":0,"totalWinAward":0},"bigImage":"","commentSpecial":"超能家族时隔14年全员回归","community":{},"director":{"directorId":899082,"img":"http://img31.mtime.cn/ph/2016/08/26/185716.58933968_1280X720X2.jpg","name":"布拉德·伯德","nameEn":"Brad Bird"},"festivals":[],"hotRanking":-1,"img":"http://img5.mtime.cn/mt/2018/05/23/125020.85709614_1280X720X2.jpg","is3D":true,"isDMAX":true,"isEggHunt":false,"isFilter":false,"isIMAX":false,"isIMAX3D":true,"isTicket":true,"message":"该操作将清除您对该片的评分！是否确认？","mins":"126分钟","movieId":223686,"movieStatus":1,"name":"超人总动员2","nameEn":"The Incredibles 2","overallRating":8,"personCount":34,"quizGame":{},"releaseArea":"中国","releaseDate":"20180622","sensitiveStatus":false,"showCinemaCount":106,"showDay":1529740800,"showtimeCount":743,"stageImg":{"count":119,"list":[{"imgId":7421373,"imgUrl":"http://img5.mtime.cn/pi/2018/01/18/085436.31609336_1280X720X2.jpg"},{"imgId":7455683,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173744.60010977_1280X720X2.jpg"},{"imgId":7455684,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173742.76535688_1280X720X2.jpg"},{"imgId":7455685,"imgUrl":"http://img5.mtime.cn/pi/2018/05/01/173743.93646889_1280X720X2.jpg"}]},"story":"\u201c弹力女超人\u201d巴荷莉（霍利·亨特配音）成为故事主角，\u201c超能先生\u201d巴鲍伯（格雷格·T·尼尔森配音）则在家里过起了英雄的\u201c平凡\u201d生活。但是，新的恶势力再度出现，策划了缜密而危险的阴谋，超人家族必须共同联手，彻底摧毁恶棍的诡计！","style":{"isLeadPage":0,"leadImg":"https://img2.mtime.cn/mg/.jpg","leadUrl":""},"totalNominateAward":0,"totalWinAward":0,"type":["动画","动作","冒险","喜剧","家庭","科幻"],"url":"https://movie.mtime.com/223686/","video":{"count":14,"hightUrl":"https://vfx.mtime.cn/Video/2018/05/23/mp4/180523181340166095.mp4","img":"http://img5.mtime.cn/mg/2018/05/23/181529.48182656_235X132X4.jpg","title":"超人总动员2 中文定档预告片","url":"https://vfx.mtime.cn/Video/2018/05/23/mp4/180523181340166095_480.mp4","videoId":70664,"videoSourceType":1}}
         * boxOffice : {"movieId":223686,"ranking":2,"todayBox":493040824,"todayBoxDes":"493.04","todayBoxDesUnit":"今日实时(万)","totalBox":17071044155,"totalBoxDes":"1.71","totalBoxUnit":"累计票房(亿)"}
         * live : {"count":0,"img":"","liveId":0,"playNumTag":"","playTag":"","status":3,"title":""}
         * related : {"goodsCount":0,"goodsList":[],"relateId":0,"relatedUrl":"https://mall-wv.mtime.cn/#!/commerce/list/","type":0}
         */

        @SerializedName("advertisement")
        private AdvertisementBean advertisement;
        @SerializedName("basic")
        private BasicBean basic;
        @SerializedName("boxOffice")
        private BoxOfficeBean boxOffice;
        @SerializedName("live")
        private LiveBean live;
        @SerializedName("related")
        private RelatedBean related;

        public AdvertisementBean getAdvertisement() {
            return advertisement;
        }

        public void setAdvertisement(AdvertisementBean advertisement) {
            this.advertisement = advertisement;
        }

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public BoxOfficeBean getBoxOffice() {
            return boxOffice;
        }

        public void setBoxOffice(BoxOfficeBean boxOffice) {
            this.boxOffice = boxOffice;
        }

        public LiveBean getLive() {
            return live;
        }

        public void setLive(LiveBean live) {
            this.live = live;
        }

        public RelatedBean getRelated() {
            return related;
        }

        public void setRelated(RelatedBean related) {
            this.related = related;
        }

    }

