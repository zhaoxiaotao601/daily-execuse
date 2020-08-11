package system12306;

public class TestMain {
    public static void main(String[] args) {
        Window w1 = new Window("哈尔滨西站");
        Window w2 = new Window("哈尔滨南站");
        Window w3 = new Window("哈尔滨北站");
        w1.start();
        w2.start();
        w3.start();
    }
}
