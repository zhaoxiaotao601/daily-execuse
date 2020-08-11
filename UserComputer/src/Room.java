public class Room {
    public Computer[] computers = new Computer[5];

    {
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(i + 1);
        }
    }

    public void welcomeStudent(Student student) {
        System.out.println("欢迎" + student.getName() + "同学进入机房");
        for (int i = 0; i < computers.length; i++) {
            boolean computersState = computers[i].isUsed();
            if (!computersState) {
                student.useComputer(computers[i]);
                break;
            }
        }
    }
}
