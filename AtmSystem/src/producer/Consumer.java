package producer;

public class Consumer extends Thread {
    //为了保证生产者和消费者使用同一个对象，添加一个属性
    private Warehouse house;

    public Consumer(Warehouse house) {
        this.house = house;
    }

    //消费者的方法，一直从仓库中获取元素
    public void run() {
        while (true) {
            house.get();
            System.out.println("消费者拿走了一件货物");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
