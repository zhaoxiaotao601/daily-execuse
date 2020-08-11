package com.zxt.talk;

public class TalkTeacher {
    public static void main(String[] args) {
        new Thread(new TalkReceive(9999,"学生：")).start();//接受

        new Thread(new TalkSend(5555,"localhost",8888)).start();//发送
    }
}
