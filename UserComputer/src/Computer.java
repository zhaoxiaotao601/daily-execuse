public class Computer {
    private int number;
    private boolean used = false;//true为开，false为关

    public Computer() {
    }

    public Computer(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public boolean isUsed() {
        return this.used;
    }

    public void beOpen() {
        this.used = true;
        System.out.println(this.number + "号电脑被打开啦");
    }

    public void beUsing() {
        this.used = true;
        System.out.println(this.number + "号电脑被使用中...");
    }

    public void beClose() {
        this.used = false;
        System.out.println(this.number + "号电脑被关闭啦");
    }
}
