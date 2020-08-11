public abstract class Person {
    protected String name;

    public String getName() {
        return this.name;
    }

    //叫号
    public abstract void CallNumber();

    //办理业务
    public abstract void transcant();

    //离开
    public abstract void leave();
}
