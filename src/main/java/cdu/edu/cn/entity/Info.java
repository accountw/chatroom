package cdu.edu.cn.entity;

import java.util.Date;

public class Info {
    String id;
    String uid;
    String context;
    Date rtime;

    public Info(String id, String uid, String context, Date rtime) {
        this.id = id;
        this.uid = uid;
        this.context = context;
        this.rtime = rtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }
}
