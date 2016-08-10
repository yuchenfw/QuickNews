package com.zz.quicknews.news.comments;

/**
 * Created by pc on 2016/8/1.
 */
public class Comment {

//    private int status;
    private int user_uid;
    private String reply_to_user_name;
    private String reply_to_user_verified;
    private String text;
//    private int target_id;
//    private int forum_id;
    private int reply_count;
    private int reply_to_user_id;
//    private int is_blocked;
//    private boolean user_verified;
    private int user_followers_count;
//    private int is_blocking;
    private long user_id;
    private long id;
    private int bury_count;
//    private int type;
    private int digg_count;
//    private int rate_score;
    private long create_time;
    private String user_name;
    private String user_profile_image_url;

    public int getBury_count() {
        return bury_count;
    }

    public void setBury_count(int bury_count) {
        this.bury_count = bury_count;
    }

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }

    public int getDigg_count() {
        return digg_count;
    }

    public void setDigg_count(int digg_count) {
        this.digg_count = digg_count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getReply_count() {
        return reply_count;
    }

    public void setReply_count(int reply_count) {
        this.reply_count = reply_count;
    }

    public int getReply_to_user_id() {
        return reply_to_user_id;
    }

    public void setReply_to_user_id(int reply_to_user_id) {
        this.reply_to_user_id = reply_to_user_id;
    }

    public String getReply_to_user_name() {
        return reply_to_user_name;
    }

    public void setReply_to_user_name(String reply_to_user_name) {
        this.reply_to_user_name = reply_to_user_name;
    }

    public String getReply_to_user_verified() {
        return reply_to_user_verified;
    }

    public void setReply_to_user_verified(String reply_to_user_verified) {
        this.reply_to_user_verified = reply_to_user_verified;
    }

    public int getUser_followers_count() {
        return user_followers_count;
    }

    public void setUser_followers_count(int user_followers_count) {
        this.user_followers_count = user_followers_count;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_profile_image_url() {
        return user_profile_image_url;
    }

    public void setUser_profile_image_url(String user_profile_image_url) {
        this.user_profile_image_url = user_profile_image_url;
    }

    public int getUser_uid() {
        return user_uid;
    }

    public void setUser_uid(int user_uid) {
        this.user_uid = user_uid;
    }

    /*"status":1,
                "user_uid":null,
                "description":"这个用户很懒，神马都木有写",
                "reply_to_user_name":null,
                "reply_to_user_verified":null,
                "text":"这是精神传销，也是邪教，国家应该出手严打。否则后患无穷。",
                "target_id":null,
                "forum_id":0,
                "reply_count":2,
                "reply_to_user_id":null,
                "is_blocked":0,
                "user_verified":false,
                "user_followers_count":0,
                "is_blocking":0,
                "user_id":6917530688,
                "bury_count":0,
                "type":2,
                "digg_count":593,
                "id":50018076833,
                "platform_id":0,
                "rate_score":0,
                "create_time":1470009041,
                "user_name":"海洋之心63",
                "user_profile_image_url":"http://p1.pstatp.com/thumb/72900138dedf80c7f0f"
            },*/
}
