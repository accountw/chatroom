package cdu.edu.cn.dto;




//封装json对象
public class Infodto {
    String name;
    String context;

    public Infodto(String name, String context) {
        this.name = name;
        this.context = context;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
