package com.zxt.request;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class Response {
    private BufferedWriter bw;
    //正文
    private StringBuilder content;
    //协议头信息(状态行与请求头 回车)
    private StringBuilder headInfo;
    private int len;//正文的字节数
    private final String BLANK = " ";
    private final String CRLE = "\r\n";

    private Response() {
        content = new StringBuilder();
        headInfo = new StringBuilder();
        len = 0;
    }

    public Response(Socket client) {
        this();
        try {
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Response(OutputStream os) {
        this();
        bw = new BufferedWriter(new OutputStreamWriter(os));
    }
    //冬态添加内容
    public Response println(String info){
        content.append(info).append(CRLE);
        len+=(info+CRLE).getBytes().length;
        return this;
    }

    //构建头信息
    private void createHeadInfo(int code) {
        //1、响应行：http/1.1 200 ok
        headInfo.append("HTTP/1.1").append(BLANK);
        headInfo.append(200).append(BLANK);
        switch (code) {
            case 200:
                headInfo.append("OK").append(CRLE);
                break;
            case 404:
                headInfo.append("NOT FOUND").append(CRLE);
                break;
            case 505:
                headInfo.append("SERVER ERROR").append(CRLE);
                break;
        }
        //2、响应行
        headInfo.append("Date:").append(new Date()).append(CRLE);
        headInfo.append("Server:").append("zxt server/0.0.1;charset=GBK").append(CRLE);
        headInfo.append("Content-type:text/html").append(CRLE);
        headInfo.append("Content-length:").append(len).append(CRLE);
        headInfo.append(CRLE);

    }

}
