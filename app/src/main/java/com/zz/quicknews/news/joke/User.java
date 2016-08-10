package com.zz.quicknews.news.joke;

/**
 * Created by pc on 2016/7/28.
 */
public class User {
    /*"is_following":false,
                    "avatar_url":"http://p2.pstatp.com/thumb/660/6887913785",
                    "user_id":3186004181,
                    "name":"祤鈊獨襡吾",
                    "user_verified":false*/
    private boolean is_following;
    private boolean user_verified;
    private String avatar_url;
    private String name;
    private long user_id;

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public boolean is_following() {
        return is_following;
    }

    public void setIs_following(boolean is_following) {
        this.is_following = is_following;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUser_verified() {
        return user_verified;
    }

    public void setUser_verified(boolean user_verified) {
        this.user_verified = user_verified;
    }
}
