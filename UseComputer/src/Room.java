public class Room {
private Computer computer=new Computer();
public void welcomeStudent(Student student){
 String studentName=student.getName();
    System.out.println("欢迎"+studentName+"进入电脑房");
    student.useComputer(computer);
}
}
