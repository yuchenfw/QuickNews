package com.zz.quicknews.news;

import java.util.List;

/**
 * Created by pc on 2016/7/26.
 */
public class Data {

//    private boolean has_more;
    private String message;
    private List<News> data;
    private Next next;

    public Next getNext() {
        return next;
    }

    public void setNext(Next next) {
        this.next = next;
    }

    public List<News> getData() {
        return data;
    }

    public void setData(List<News> data) {
        this.data = data;
    }

    /*public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }*/

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    /*
    *  "has_more":true,
    "message":"success",
    "data":Array[16],
    "next":{
        "max_behot_time":1469514669
    }*/
}
