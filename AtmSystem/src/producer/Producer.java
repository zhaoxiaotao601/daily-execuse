package producer;

public class Producer extends Thread {

    //为了保证生产者和消费者使用同一个对象，添加一个属性
    private Warehouse house;

    public Producer(Warehouse house) {
        this.house = house;
    }

    //生产者的run方法，一直向仓库内添加元素
    public void run() {
        //方法重写 继承关系 名字参数列表必须一致
        while (true) {
            house.add();
            System.out.println("生产者存入了一件货物");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
