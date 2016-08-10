package com.zz.quicknews.news.comments;

import java.util.List;

/**
 * Created by pc on 2016/8/1.
 */
public class CommentData {
    private CommentPagination comment_pagination;
    private List<Comment> comments;
    private int page;
    private int page_size;
    private int page_last;

    public CommentPagination getComment_pagination() {
        return comment_pagination;
    }

    public void setComment_pagination(CommentPagination comment_pagination) {
        this.comment_pagination = comment_pagination;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_last() {
        return page_last;
    }

    public void setPage_last(int page_last) {
        this.page_last = page_last;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    /*
    * "page":1,
        "page_size":10,
        "page_last":565*/
}
