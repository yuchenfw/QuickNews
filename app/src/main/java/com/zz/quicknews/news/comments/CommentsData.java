package com.zz.quicknews.news.comments;

/**
 * Created by pc on 2016/8/1.
 */
public class CommentsData {
    private String message;
    private CommentData data;

    public CommentData getData() {
        return data;
    }

    public void setData(CommentData data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
