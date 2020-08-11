public class Student {
    private String name;
    private int RP=(int)(Math.random()*10);

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void useComputer(Computer computer) {
        System.out.println(this.name + "开始使用电脑");
        computer.beOpen();
        computer.beUsing();
        if(this.RP<5){
            computer.beClose();
        }else{
            System.out.println(this.name+"人品有问题，没关电脑，啥素质啊~");
        }
    }
}
