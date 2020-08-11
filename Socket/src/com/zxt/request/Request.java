package com.zxt.request;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Request {
    //协议信息
    private String requestInfo;
    //请求方式
    private String method;
    //请求uri
    private String uri;
    //请求参数
    private String queryStr;

    public Request(Socket client) throws IOException {
        this(client.getInputStream());
    }

    public Request(InputStream is) {
        byte[] dates = new byte[1024 * 1024];
        int len;
        try {
            len = is.read(dates);
            this.requestInfo = new String(dates, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        //分解字符串
        parseRequestInfo();
    }

    private void parseRequestInfo() {
        System.out.println("-----分解-----");
        System.out.println("-----1、获取请求方式：开头到第一个/-----");
        this.method = this.requestInfo.substring(0, this.requestInfo.indexOf("/")).toLowerCase();
        System.out.println(method);


    }
}
