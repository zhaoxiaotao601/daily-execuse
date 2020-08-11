public class Computer {
    private int number;
    private boolean used = false;

    public Computer() {
    }
    public Computer(int number) {
        this.number = number;
    }
    public void beOpen() {
        this.used = true;
        System.out.println("电脑被打开");
    }

    public void beusing() {
        this.used = true;
        System.out.println("电脑被使用中。。。");
    }

    public void beClose() {
        this.used = false;
        System.out.println("电脑被关闭");
    }
}
