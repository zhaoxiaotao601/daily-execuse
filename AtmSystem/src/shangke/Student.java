package shangke;

public class Student extends Thread{
    private String StudentName;

    public Student() {

    }

    public Student(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }


    public void shangKe() {
        System.out.println(this.getStudentName() + "学生开始听课");
    }

}
