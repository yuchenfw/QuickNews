package com.zz.quicknews.news;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pc on 2016/7/26.
 */
public class News {
    private String media_name;

    @SerializedName("abstract")
    private String mabstract;
    private List<ImageUrl> image_list;
    private String media_avatar_url;
    private int external_visit_count;
    private int article_type;
    private boolean more_mode;
    private String tag;
    private int is_favorite;
    private int has_m3u8_video;
    private String keywords;
    private int has_mp4_video;
    private int favorite_count;
    private String display_url;
    private String article_url;

    public String getArticle_url() {
        return article_url;
    }

    public void setArticle_url(String article_url) {
        this.article_url = article_url;
    }

    private int article_sub_type;
    private int bury_count;
    private String title;
    private String datetime;
    private boolean has_video;
    private String share_url;

    private String large_image_url;

    private String source;
    private int comment_count;

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /*private String middle_image;

        public String getMiddle_image() {
            return middle_image;
        }

        public void setMiddle_image(String middle_image) {
            this.middle_image = middle_image;
        }
    */
    public String getLarge_image_url() {
        return large_image_url;
    }

    public void setLarge_image_url(String large_image_url) {
        this.large_image_url = large_image_url;
    }

    public int getArticle_sub_type() {
        return article_sub_type;
    }

    public void setArticle_sub_type(int article_sub_type) {
        this.article_sub_type = article_sub_type;
    }

    public int getArticle_type() {
        return article_type;
    }

    public void setArticle_type(int article_type) {
        this.article_type = article_type;
    }

    public int getBury_count() {
        return bury_count;
    }

    public void setBury_count(int bury_count) {
        this.bury_count = bury_count;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public int getExternal_visit_count() {
        return external_visit_count;
    }

    public void setExternal_visit_count(int external_visit_count) {
        this.external_visit_count = external_visit_count;
    }

    public int getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
    }

    public int getHas_m3u8_video() {
        return has_m3u8_video;
    }

    public void setHas_m3u8_video(int has_m3u8_video) {
        this.has_m3u8_video = has_m3u8_video;
    }

    public int getHas_mp4_video() {
        return has_mp4_video;
    }

    public void setHas_mp4_video(int has_mp4_video) {
        this.has_mp4_video = has_mp4_video;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public List<ImageUrl> getImage_list() {
        return image_list;
    }

    public void setImage_list(List<ImageUrl> image_list) {
        this.image_list = image_list;
    }

    public int getIs_favorite() {
        return is_favorite;
    }

    public void setIs_favorite(int is_favorite) {
        this.is_favorite = is_favorite;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMabstract() {
        return mabstract;
    }

    public void setMabstract(String mabstract) {
        this.mabstract = mabstract;
    }

    public String getMedia_avatar_url() {
        return media_avatar_url;
    }

    public void setMedia_avatar_url(String media_avatar_url) {
        this.media_avatar_url = media_avatar_url;
    }

    public String getMedia_name() {
        return media_name;
    }

    public void setMedia_name(String media_name) {
        this.media_name = media_name;
    }

    public boolean isMore_mode() {
        return more_mode;
    }

    public void setMore_mode(boolean more_mode) {
        this.more_mode = more_mode;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


/*
    * "media_name":"美食美言",
            "abstract":"",
            "impression_count":7294202,
            "image_list":Array[3],
            "media_avatar_url":"http://p3.pstatp.com/large/6cb000016254c689c13",
            "external_visit_count":38677,
            "article_type":0,
            "more_mode":true,
            "tag":"news_food",
            "is_favorite":0,
            "has_m3u8_video":0,
            "keywords":"豆腐乳,苗族人,文化,牛血",
            "has_mp4_video":0,
            "favorite_count":3549,
            "display_url":"http://toutiao.com/group/6310045512230125826/",
            "article_sub_type":0,
            "bury_count":114,
            "title":"外国人到苗族村落考察 看到这盘肉几乎晕了过去",
            "datetime":"2016-07-26 16:41",
            "has_video":false,
            "share_url":"http://toutiao.com/group/6310045512230125826/?iid=23218826731&app=news_article",
            "id":6310045512230126000,
            "source":"美食美言",
            "comment_count":6130,
            "article_url":"http://toutiao.com/group/6310045512230125826/",
            "create_time":1469172746,
            "recommend":0,
            "has_gallery":true,
            "tips":0,
            "aggr_type":1,
            "item_source_url":"/item/6310042002029281793/",
            "media_url":"http://toutiao.com/m5442039985/",
            "display_time":1469172739,
            "publish_time":1469172739,
            "go_detail_count":1842647,
            "group_flags":131074,
            "middle_mode":false,
            "display_title":" ",
            "gallary_image_count":9,
            "item_seo_url":"/item/6310042002029281793/",
            "tag_id":6310045512230126000,
            "source_url":"/group/6310045512230125826/",
            "large_mode":false,
            "item_id":6310042002029282000,
            "natant_level":0,
            "is_digg":0,
            "seo_url":"/group/6310045512230125826/",
            "repin_count":3549,
            "url":"http://toutiao.com/group/6310045512230125826/",
            "level":0,
            "digg_count":44,
            "behot_time":1469522469,
            "hot":0,
            "preload_web":2,
            "comments_count":6130,
            "has_image":true,
            "is_bury":0,
            "group_id":6310045512230126000,
            "middle_image":{
                "url":"http://p3.pstatp.com/list/b0c000143b6fbf72437",
                "width":600,
                "url_list":[
                    {
                        "url":"http://p3.pstatp.com/list/b0c000143b6fbf72437"
                    },
                    {
                        "url":"http://pb2.pstatp.com/list/b0c000143b6fbf72437"
                    },
                    {
                        "url":"http://pb3.pstatp.com/list/b0c000143b6fbf72437"
                    }
                ],
                "uri":"list/b0c000143b6fbf72437",
                "height":400
            }*/
}
