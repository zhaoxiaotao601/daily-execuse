package com.example.demo;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Map;

/**
 * @Classname DemoString01
 * @Description TODO
 * @Date 2020/8/3 9:29
 * @Created by Administrator
 */
public class DemoString01 {

    @Test
    public void test01() throws UnsupportedEncodingException {


        //System.out.println((Calendar.getInstance().getTimeInMillis()) / 1000 / 60 / 60 / 24 / 365);


//        long totalMemory = Runtime.getRuntime().totalMemory();//总内存
//        long freeMemory = Runtime.getRuntime().freeMemory();//剩余内存
//        long maxMemory = Runtime.getRuntime().maxMemory();//最大内存
//        int availableProcessors = Runtime.getRuntime().availableProcessors();//cpu数量
//        System.out.println(totalMemory / 1024 / 1024 + "MB");
//        System.out.println(freeMemory / 1024 / 1024 + "MB");
//        System.out.println(maxMemory / 1024 / 1024 + "MB");
//        System.out.println(availableProcessors);
//        try {
//            Thread.sleep(Integer.MAX_VALUE);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        String s1 = "你好";
//        String s2 = new String(s1.getBytes("GB2312"), "UTF-8");
//
//        System.out.println(s2);

//        String reverse = reverse("赵小涛");
//        System.out.println(reverse);

    }

//    public static String reverse(String originStr) {
//
//        if (originStr == null || originStr.length() <= 1)
//            return originStr;
//        return reverse(originStr.substring(1)) + originStr.charAt(0);
//    }

//    public static void main(String[] args) {
//        String reverse = reverse("赵小涛");
//        System.out.println(reverse);


//        String s1 = "Programming";
//        String s2 = new String("Programming");
//        String s3 = "Program";
//        String s4 = "ming";
//        String s5 = "Program" + "ming";
//        String s6 = s3 + s4;
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s5);
//        System.out.println(s1 == s6);
//        System.out.println(s1 == s6.intern());
//        System.out.println(s2 == s2.intern());
}

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

class Human {
    public static void main(String[] args) throws Exception {
        try {
            try {
                throw new Sneeze();
            } catch (Annoyance a) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
            return;
        } finally {
            System.out.println("Hello World!");
        }
    }
}

