package com.zz.quicknews.news.joke;

/**
 * Created by pc on 2016/7/28.
 */
public class JokeContent {
    private String text;
    private String content;
    private int favorite_count;
    private int comment_count;
    private String share_url;
    private int bury_count;
    private int share_count;
    private int digg_count;
    private User user;

    public int getBury_count() {
        return bury_count;
    }

    public void setBury_count(int bury_count) {
        this.bury_count = bury_count;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
    }

    public int getDigg_count() {
        return digg_count;
    }

    public void setDigg_count(int digg_count) {
        this.digg_count = digg_count;
    }

    public int getShare_count() {
        return share_count;
    }

    public void setShare_count(int share_count) {
        this.share_count = share_count;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
/*"text":"一日，终于鼓起勇气向女神表白，女神却说，你也不撒泡尿照照镜子，你啥样，我啥样了。 于是我就再她面前撒了一泡尿。 她瞬间答应了我。 做了我女朋友。 懂的左下。",
                "create_time":1402893971,
                "id":3332096499,
                "favorite_count":1518,
                "go_detail_count":20942,
                "user_favorite":0,
                "share_type":1,
                "is_can_share":1,
                "comment_count":1306,
                "share_url":"http://m.neihanshequ.com/share/group/3332096499/?iid=0&app=joke_essay",
                "label":1,
                "content":"一日，终于鼓起勇气向女神表白，女神却说，你也不撒泡尿照照镜子，你啥样，我啥样了。 于是我就再她面前撒了一泡尿。 她瞬间答应了我。 做了我女朋友。 懂的左下。",
                "category_type":1,
                "id_str":"3332096499",
                "media_type":0,
                "share_count":1002,
                "type":3,
                "status":112,
                "has_comments":0,
                "user_bury":0,
                "status_desc":"热门投稿",
                "user":{
                    "is_following":false,
                    "avatar_url":"http://p2.pstatp.com/thumb/660/6887913785",
                    "user_id":3186004181,
                    "name":"祤鈊獨襡吾",
                    "user_verified":false
                },
                "user_digg":0,
                "online_time":1402893971,
                "category_name":"内涵段子",
                "category_visible":false,
                "bury_count":9304,
                "is_anonymous":false,
                "repin_count":1518,
                "digg_count":99797,
                "has_hot_comments":1,
                "user_repin":0,
                "activity":{

                },
                "group_id":3332096499,
                "category_id":1*/
}
