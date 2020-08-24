package com.vinsuan.demo820.model;

import java.io.Serializable;
import java.util.List;

/**
 * create by gaolei
 * on 2020/8/24
 */
public class ArticleModel implements Serializable {

    /**
     * curPage : 2
     * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":503,"chapterName":"robust","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14862,"link":"https://www.jianshu.com/p/35cd8c7188b5","niceDate":"2020-08-20 00:52","niceShareDate":"2020-08-20 00:51","origin":"","prefix":"","projectLink":"","publishTime":1597855964000,"realSuperChapterId":460,"selfVisible":0,"shareDate":1597855866000,"shareUser":"鸿洋","superChapterId":461,"superChapterName":"常见开源库源码解析","tags":[],"title":"从Tinker加载dex补丁看动态加载插件过程","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14863,"link":"https://www.jianshu.com/p/9bf982da6e96","niceDate":"2020-08-20 00:52","niceShareDate":"2020-08-20 00:51","origin":"","prefix":"","projectLink":"","publishTime":1597855953000,"realSuperChapterId":37,"selfVisible":0,"shareDate":1597855893000,"shareUser":"鸿洋","superChapterId":93,"superChapterName":"自定义控件","tags":[],"title":"【Android】仿斗鱼滑动拼图验证码控件","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":508,"chapterName":"retrofit","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14864,"link":"https://www.jianshu.com/p/07fe489a53f2","niceDate":"2020-08-20 00:52","niceShareDate":"2020-08-20 00:51","origin":"","prefix":"","projectLink":"","publishTime":1597855943000,"realSuperChapterId":460,"selfVisible":0,"shareDate":1597855916000,"shareUser":"鸿洋","superChapterId":461,"superChapterName":"常见开源库源码解析","tags":[],"title":"Retrofit结合Lifecycle, 将Http生命周期管理到极致","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14882,"link":"https://mp.weixin.qq.com/s/aImpg0FRIx6E3_Rp2wRP0Q","niceDate":"2020-08-20 00:00","niceShareDate":"2020-08-20 22:37","origin":"","prefix":"","projectLink":"","publishTime":1597852800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597934248000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"2019 下半年 Flutter 实现的性能优化 | 英雄榜","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14883,"link":"https://mp.weixin.qq.com/s/Qj1Bh-WdGz65Lzcf5yQsRw","niceDate":"2020-08-20 00:00","niceShareDate":"2020-08-20 22:37","origin":"","prefix":"","projectLink":"","publishTime":1597852800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597934275000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"实际生产中的 Android SDK开发总结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14884,"link":"https://mp.weixin.qq.com/s/AW80E3jIqddf5wKzVbDrBg","niceDate":"2020-08-20 00:00","niceShareDate":"2020-08-20 22:38","origin":"","prefix":"","projectLink":"","publishTime":1597852800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597934292000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"即学即用Kotlin - 协程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14885,"link":"https://mp.weixin.qq.com/s/Qt8ZHH_-1r8Kqg2wFz0U5g","niceDate":"2020-08-20 00:00","niceShareDate":"2020-08-20 22:38","origin":"","prefix":"","projectLink":"","publishTime":1597852800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597934310000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"LiveData还不熟悉？看完原理立马释怀！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14855,"link":"https://blog.csdn.net/xlh1191860939/article/details/108111945","niceDate":"2020-08-19 22:54","niceShareDate":"2020-08-19 22:54","origin":"","prefix":"","projectLink":"","publishTime":1597848892000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1597848880000,"shareUser":"D1191860939","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Retrofit源码全方面解析","type":0,"userId":31200,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14849,"link":"https://juejin.im/post/6859156343228792840","niceDate":"2020-08-19 11:25","niceShareDate":"2020-08-19 11:25","origin":"","prefix":"","projectLink":"","publishTime":1597807556000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1597807556000,"shareUser":"不怕天黑","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Looper.loop()引发的惨案","type":0,"userId":35902,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14848,"link":"https://juejin.im/post/6844903591308689422","niceDate":"2020-08-19 09:34","niceShareDate":"2020-08-19 09:34","origin":"","prefix":"","projectLink":"","publishTime":1597800895000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1597800895000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"设计模式之观察者设计模式","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14846,"link":"https://juejin.im/post/6862368973888061453/","niceDate":"2020-08-19 08:09","niceShareDate":"2020-08-19 08:09","origin":"","prefix":"","projectLink":"","publishTime":1597795779000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1597795779000,"shareUser":"哈利迪","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android |《看完不忘系列》之Retrofit","type":0,"userId":6999,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14836,"link":"https://www.jianshu.com/p/e8b17f855c3b","niceDate":"2020-08-19 00:37","niceShareDate":"2020-08-18 18:10","origin":"","prefix":"","projectLink":"","publishTime":1597768621000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1597745429000,"shareUser":"刘胖胖","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"深入卡顿优化","type":0,"userId":73657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14856,"link":"https://mp.weixin.qq.com/s/Vj5koeQGpuKS9V3GCEOCJQ","niceDate":"2020-08-19 00:00","niceShareDate":"2020-08-19 23:11","origin":"","prefix":"","projectLink":"","publishTime":1597766400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597849875000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"直面底层：Android 渲染机制， Choreographer 必须得了解","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14857,"link":"https://mp.weixin.qq.com/s/s4OcylT1KPCUKWK1jcTB7A","niceDate":"2020-08-19 00:00","niceShareDate":"2020-08-19 23:11","origin":"","prefix":"","projectLink":"","publishTime":1597766400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597849898000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"项目创建了几百个线程，你要怎么优化？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"scsfwgy","canEdit":false,"chapterId":339,"chapterName":"K线图","collect":false,"courseId":13,"desc":"高度封装MPAndroidChart,提供开箱即用的MPAndroidChart。两大原则：1.不修改MPAndroidChart源码，只继承封装原有功能实现扩展。2. 开箱即用。目标：可商用","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/e0855cee-4ce9-4445-9524-dd1feb69e9c9.png","fresh":false,"id":14821,"link":"https://www.wanandroid.com/blog/show/2780","niceDate":"2020-08-18 00:14","niceShareDate":"2020-08-18 00:13","origin":"","prefix":"","projectLink":"https://github.com/scsfwgy/MPAndroidChartWrapper","publishTime":1597680861000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1597680815000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=339"}],"title":"MPAndroidChart包装库MPAndroidChartWrapper，快速构建你的商用k线图","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":142,"chapterName":"ConstraintLayout","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14803,"link":"https://www.jianshu.com/p/9da1e35b315d","niceDate":"2020-08-18 00:11","niceShareDate":"2020-08-17 20:36","origin":"","prefix":"","projectLink":"","publishTime":1597680683000,"realSuperChapterId":39,"selfVisible":0,"shareDate":1597667771000,"shareUser":"深红骑士","superChapterId":100,"superChapterName":"5.+高新技术","tags":[],"title":"带你领略MotionLayout的魅力（中）","type":0,"userId":29303,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":424,"chapterName":"协程","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14810,"link":"https://juejin.im/post/6860647298926379021","niceDate":"2020-08-18 00:11","niceShareDate":"2020-08-17 23:57","origin":"","prefix":"","projectLink":"","publishTime":1597680673000,"realSuperChapterId":231,"selfVisible":0,"shareDate":1597679827000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin Jetpack 实战 | 08. 协程\u201c不为人知\u201d的调试技巧","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":67,"chapterName":"网络基础","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14812,"link":"https://juejin.im/post/6861856444032466952","niceDate":"2020-08-18 00:11","niceShareDate":"2020-08-17 23:58","origin":"","prefix":"","projectLink":"","publishTime":1597680661000,"realSuperChapterId":34,"selfVisible":0,"shareDate":1597679884000,"shareUser":"鸿洋","superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"探索 Android 网络优化方法","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":200,"chapterName":"https","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14813,"link":"https://juejin.im/post/6860818685763223565","niceDate":"2020-08-18 00:10","niceShareDate":"2020-08-18 00:00","origin":"","prefix":"","projectLink":"","publishTime":1597680647000,"realSuperChapterId":34,"selfVisible":0,"shareDate":1597680038000,"shareUser":"鸿洋","superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"还在为大厂app抓不到包而犯愁吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14814,"link":"https://juejin.im/post/6861780235638194190","niceDate":"2020-08-18 00:10","niceShareDate":"2020-08-18 00:00","origin":"","prefix":"","projectLink":"","publishTime":1597680635000,"realSuperChapterId":231,"selfVisible":0,"shareDate":1597680048000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin修炼指南（三）\u2014\u2014奇技淫巧","type":0,"userId":2,"visible":1,"zan":0}]
     * offset : 20
     * over : false
     * pageCount : 454
     * size : 20
     * total : 9078
     */

    private int curPage;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;
    private List<DatasBean> datas;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean implements Serializable {
        /**
         * apkLink :
         * audit : 1
         * author :
         * canEdit : false
         * chapterId : 503
         * chapterName : robust
         * collect : false
         * courseId : 13
         * desc :
         * descMd :
         * envelopePic :
         * fresh : false
         * id : 14862
         * link : https://www.jianshu.com/p/35cd8c7188b5
         * niceDate : 2020-08-20 00:52
         * niceShareDate : 2020-08-20 00:51
         * origin :
         * prefix :
         * projectLink :
         * publishTime : 1597855964000
         * realSuperChapterId : 460
         * selfVisible : 0
         * shareDate : 1597855866000
         * shareUser : 鸿洋
         * superChapterId : 461
         * superChapterName : 常见开源库源码解析
         * tags : []
         * title : 从Tinker加载dex补丁看动态加载插件过程
         * type : 0
         * userId : 2
         * visible : 1
         * zan : 0
         */

        private String apkLink;
        private int audit;
        private String author;
        private boolean canEdit;
        private int chapterId;
        private String chapterName;
        private boolean collect;
        private int courseId;
        private String desc;
        private String descMd;
        private String envelopePic;
        private boolean fresh;
        private int id;
        private String link;
        private String niceDate;
        private String niceShareDate;
        private String origin;
        private String prefix;
        private String projectLink;
        private long publishTime;
        private int realSuperChapterId;
        private int selfVisible;
        private long shareDate;
        private String shareUser;
        private int superChapterId;
        private String superChapterName;
        private String title;
        private int type;
        private int userId;
        private int visible;
        private int zan;
        private List<?> tags;

        public String getApkLink() {
            return apkLink;
        }

        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }

        public int getAudit() {
            return audit;
        }

        public void setAudit(int audit) {
            this.audit = audit;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public boolean isCanEdit() {
            return canEdit;
        }

        public void setCanEdit(boolean canEdit) {
            this.canEdit = canEdit;
        }

        public int getChapterId() {
            return chapterId;
        }

        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }

        public String getChapterName() {
            return chapterName;
        }

        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }

        public boolean isCollect() {
            return collect;
        }

        public void setCollect(boolean collect) {
            this.collect = collect;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDescMd() {
            return descMd;
        }

        public void setDescMd(String descMd) {
            this.descMd = descMd;
        }

        public String getEnvelopePic() {
            return envelopePic;
        }

        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }

        public boolean isFresh() {
            return fresh;
        }

        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNiceDate() {
            return niceDate;
        }

        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }

        public String getNiceShareDate() {
            return niceShareDate;
        }

        public void setNiceShareDate(String niceShareDate) {
            this.niceShareDate = niceShareDate;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getProjectLink() {
            return projectLink;
        }

        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public int getRealSuperChapterId() {
            return realSuperChapterId;
        }

        public void setRealSuperChapterId(int realSuperChapterId) {
            this.realSuperChapterId = realSuperChapterId;
        }

        public int getSelfVisible() {
            return selfVisible;
        }

        public void setSelfVisible(int selfVisible) {
            this.selfVisible = selfVisible;
        }

        public long getShareDate() {
            return shareDate;
        }

        public void setShareDate(long shareDate) {
            this.shareDate = shareDate;
        }

        public String getShareUser() {
            return shareUser;
        }

        public void setShareUser(String shareUser) {
            this.shareUser = shareUser;
        }

        public int getSuperChapterId() {
            return superChapterId;
        }

        public void setSuperChapterId(int superChapterId) {
            this.superChapterId = superChapterId;
        }

        public String getSuperChapterName() {
            return superChapterName;
        }

        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public int getZan() {
            return zan;
        }

        public void setZan(int zan) {
            this.zan = zan;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }
    }
}
