package com.zhaoxiaotao.ioc.bean;

public class zhaoxiaotao {
    private Integer high;
    private Integer age;
    private String name;

    @Override
    public String toString() {
        return "zhaoxiaotao{" +
                "high=" + high +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
