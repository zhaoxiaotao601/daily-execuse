public class oldMan extends Person {
    public oldMan() {

    }

    public oldMan(String name) {
        this.name = name;

    }

    //叫号
    public void CallNumber() {
        System.out.println(name + "不会叫号，于是找到了大堂经理帮忙");
    }

    //办理业务
    public void transcant() {
        System.out.println(name + "来到了办理窗口，要取1000元");
    }

    //离开
    public void leave() {
        System.out.println(name + "满意的带着钱走了");
    }
}
