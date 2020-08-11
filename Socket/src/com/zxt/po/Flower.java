package com.zxt.po;

import java.util.Objects;

public class Flower {
    private int uid;
    private String uname;
    private int upassword;
    private int umoney;

    public Flower() {
    }

    public Flower(int uid, String uname, int upassword, int umoney) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.umoney = umoney;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUpassword() {
        return upassword;
    }

    public void setUpassword(int upassword) {
        this.upassword = upassword;
    }

    public int getUmoney() {
        return umoney;
    }

    public void setUmoney(int umoney) {
        this.umoney = umoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return uid == flower.uid &&
                upassword == flower.upassword &&
                umoney == flower.umoney &&
                Objects.equals(uname, flower.uname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, uname, upassword, umoney);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword=" + upassword +
                ", umoney=" + umoney +
                '}';
    }
}
