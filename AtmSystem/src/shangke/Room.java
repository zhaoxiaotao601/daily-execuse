package shangke;

public class Room {
    //参数 学生 老师
    //有一个方法，欢迎学生进入
    public void wlecome(Student student, Teacher teacher) {
        System.out.println(student.getStudentName() + "进入教室");
        System.out.println(teacher.getTeacherName() + "进入教室");
        student.shangKe();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        teacher.jiangKe();
    }
}
