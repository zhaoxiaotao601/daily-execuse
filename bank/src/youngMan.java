public class youngMan extends Person {

    public youngMan() {

    }

    public youngMan(String name) {
        this.name = name;

    }
    //叫号
    public void CallNumber() {
        System.out.println(name + "年轻人懂得多，自己会叫号");
    }

    //办理业务
    public void transcant() {
        System.out.println(name + "来到了办理窗口，要取100000元买房");
    }

    //离开
    public void leave() {
        System.out.println(name + "高兴的带着钱走了");
    }
}
