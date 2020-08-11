public class bank {
    //老人进来

    public void ComeIn(Person person) {
        System.out.println("尊敬的" + person.getName() + "，欢迎进入本银行！");
        person.CallNumber();
        person.transcant();
        person.leave();
    }
}
