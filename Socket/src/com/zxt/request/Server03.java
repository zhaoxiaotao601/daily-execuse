//package com.zxt.request;
//
//import com.mysql.fabric.Server;
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Date;
//
//public class Server03 {
//    private ServerSocket serverSocket;
//
//    public static void main(String[] args) {
//        Server03 server = new Server03();
//        server.start();
//    }
//
//    //启动服务
//    public void start() {
//        try {
//            serverSocket = new ServerSocket(8888);
//            receive();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("服务器启动失败...");
//        }
//    }
//
//    //接受连接处理
//    public void receive() {
//        try {
//            Socket client = serverSocket.accept();
//            System.out.println("一个客户端建立了连接...");
//            //获取请求协议
//            InputStream is = client.getInputStream();
//            byte[] datas = new byte[1024 * 1024];
//            int len = is.read(datas);
//            String requestInfo = new String(datas, 0, len);
//            System.out.println(requestInfo);
//
//            Response response = new Response(client);
//            response.println("<html>");
//            response.println("<head>");
//            response.println("<title>");
//            response.println("服务器响应成功");
//            response.println("</title>");
//            response.println("<meta charset=\"UTF-8\">");
//            response.println("</head>");
//            response.println("<body>");
//            response.println("zxt server 终于回来了...");
//            response.println("</body>");
//            response.println("</html>");
//            int size = content.toString().getBytes().length;//必须获取字节长度
//            StringBuilder responseInfo = new StringBuilder();
//            String black = " ";
//            String CRLE = "\r\n";
//            //返回
//            //1、响应行：http/1.1 200 ok
//            responseInfo.append("HTTP/1.1").append(black);
//            responseInfo.append(200).append(black);
//            responseInfo.append("OK").append(CRLE);
//            //2、响应头（最后一行存在空行）
//            responseInfo.append("Date:").append(new Date()).append(CRLE);
//            responseInfo.append("Server:").append("zxt server/0.0.1;charset=GBK").append(CRLE);
//            responseInfo.append("Content-type:text/html").append(CRLE);
//            responseInfo.append("Content-length:").append(size).append(CRLE);
//            responseInfo.append(CRLE);
//            //3、正文
//            responseInfo.append(content.toString());
//
//            //写出到客户端
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
//            bw.write(responseInfo.toString());
//            bw.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("客户端错误");
//        }
//
//    }
//
//    //停止服务
//    public void stop() {
//
//    }
//}
