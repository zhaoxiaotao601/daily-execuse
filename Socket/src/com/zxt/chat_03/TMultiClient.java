package com.zxt.chat_03;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 在线聊天室：客户端
 * 目标：使用多线程实现多个客户可以正常收发多条信息
 * 问题：其他客户必须等待之前的客户退出才能继续 排队
 *
 * */
public class TMultiClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("-----Client-----");
        //1.建立连接：使用Socket创建客户端+服务的地址和端口
        Socket client = new Socket("localhost", 8888);
        //2.客户端发送消息
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        DataInputStream dis = new DataInputStream(client.getInputStream());
        boolean isRunning = true;
        while (isRunning) {
            String msg = console.readLine();
            dos.writeUTF(msg);
            dos.flush();
            //3.获取消息
            msg = dis.readUTF();
            System.out.println(msg);
        }
        //4.释放资源
        dos.close();
        dis.close();
        client.close();
    }
}
