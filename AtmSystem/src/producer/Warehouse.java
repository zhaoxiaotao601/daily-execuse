package producer;

import java.util.ArrayList;

public class Warehouse {

    //仓库里的集合，用来存放元素
    private ArrayList<String> list = new ArrayList<>();

    //向集合内添加元素的方法
    public void add() {//生产者
        if (list.size() < 20) {
            list.add("a");
        } else {
            //return;//让方法执行到这里就结束
            try {
                this.notifyAll();
                this.wait();//不是仓库对象等待，而是访问仓库的生产者线程进入等待状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //从集合内获取元素的方法
    public void get() {//消费者
        if (list.size() > 0) {
            list.remove(0);//集合越界问题
        } else {
//            return;
            try {
                this.notifyAll();
                this.wait();//不是仓库对象等待，而是访问仓库的消费者线程进入等待状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
