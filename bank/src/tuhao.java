public class tuhao extends Person {

    public tuhao() {

    }

    public tuhao(String name) {
        this.name = name;

    }
    //叫号
    public void CallNumber() {
        System.out.println(name + "不用叫号，直接进入vip贵宾室");
    }

    //办理业务
    public void transcant() {
        System.out.println(name + "在贵宾室内办理业务，要取走1000万现金");
    }

    //离开
    public void leave() {
        System.out.println(name + "满意的带着钱走了");
    }
}
