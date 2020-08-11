package com.zxt.talk;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Server-------------");
        ServerSocket server = new ServerSocket(8888);
        Socket client = server.accept();
        System.out.println("一个人连接了我");
    }
}
