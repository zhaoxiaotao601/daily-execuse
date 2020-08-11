package com.zxt.talk;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Client-------------");
        Socket client = new Socket("localhost",8888);

    }
}
