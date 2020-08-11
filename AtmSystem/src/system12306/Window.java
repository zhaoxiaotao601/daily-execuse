package system12306;

public class Window extends Thread {
    private String windowName;//窗口的名字

    public Window(String windowName) {
        this.windowName = windowName;
    }

    public void run() {
        this.sellTicket();
    }

    public void sellTicket() {
        while (true) {
            System12306 sys = System12306.getInstance();
            Ticket ticket = sys.getTicket();//获取一张票 Vector
            if (ticket==null){
                System.out.println("对不起"+windowName+"当前窗口车票已售完");
                break;
            }
            System.out.println("从"+windowName+"售出"+ticket);
        }
    }
}
