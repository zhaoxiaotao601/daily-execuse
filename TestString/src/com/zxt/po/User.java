package com.zxt.po;

import java.util.Objects;

public class User {
    private int uid;
    private String uname;
    private int upassword;
    private int umoney;

    public User() {
    }

    public User(int uid, String uname, int upassword, int umoney) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.umoney = umoney;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public int getUpassword() {
        return upassword;
    }

    public int getUmoney() {
        return umoney;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpassword(int upassword) {
        this.upassword = upassword;
    }

    public void setUmoney(int umoney) {
        this.umoney = umoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uid == user.uid &&
                upassword == user.upassword &&
                umoney == user.umoney &&
                Objects.equals(uname, user.uname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, uname, upassword, umoney);
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword=" + upassword +
                ", umoney=" + umoney +
                '}';
    }
}
