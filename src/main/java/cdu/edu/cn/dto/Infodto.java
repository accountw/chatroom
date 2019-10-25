package cdu.edu.cn.dto;




//封装json对象
public class Infodto {
    String uid;
    String context;

    public Infodto(String uid, String context) {
        this.uid = uid;
        this.context = context;
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
}
