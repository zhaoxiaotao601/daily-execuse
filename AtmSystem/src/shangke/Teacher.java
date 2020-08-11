package shangke;

public class Teacher{

    private String teacherName;

    public Teacher() {
    }

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void jiangKe() {
        System.out.println(this.getTeacherName() + "开始讲课");
    }
}
