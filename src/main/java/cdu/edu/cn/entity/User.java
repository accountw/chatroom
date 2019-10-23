package cdu.edu.cn.entity;

public class User {
    String id;
    String name;
    String password;
    int sex;
    String sign;

    public User(String id, String name, String password, int sex, String sign) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.sign = sign;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
