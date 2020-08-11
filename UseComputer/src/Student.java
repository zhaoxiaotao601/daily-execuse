public class Student {
    private String name;

    public String getName() {
        return this.name;
    }

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public void useComputer(Computer computer) {
        System.out.println(name+"开始使用电脑");
        computer.beOpen();
        computer.beusing();
        computer.beClose();

    }
}
