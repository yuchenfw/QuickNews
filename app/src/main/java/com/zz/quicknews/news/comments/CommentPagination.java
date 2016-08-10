package com.zz.quicknews.news.comments;

/**
 * Created by pc on 2016/8/1.
 */
public class CommentPagination {
    private int count;
    private int total_count;
    private String url_fmt;
    private int offset;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public String getUrl_fmt() {
        return url_fmt;
    }

    public void setUrl_fmt(String url_fmt) {
        this.url_fmt = url_fmt;
    }

    /*
    *  "count":10,
            "total_count":5642,
            "url_fmt":"?offset=%s&count=%s",
            "offset":0*/
}
