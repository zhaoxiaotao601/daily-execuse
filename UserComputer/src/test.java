public class test {
    public static void main(String[] args) {
        Room room=new Room();
        Student student1=new Student("赵小涛");
        room.welcomeStudent(student1);
        Student student2=new Student("乔旭涛");
        room.welcomeStudent(student2);
        Student student3=new Student("陈旭");
        room.welcomeStudent(student3);
        Student student4=new Student("常成");
        room.welcomeStudent(student4);
        Student student5=new Student("梁佑");
        room.welcomeStudent(student5);
        Student student6=new Student("张宇鹏");
        room.welcomeStudent(student6);
    }
}
