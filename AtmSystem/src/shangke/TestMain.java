package shangke;

public class TestMain {
    public static void main(String[] args) {
    Room room = new Room();
    Teacher teacher = new Teacher("赵老师");
    Student student = new Student("乔旭涛");
    room.wlecome(student,teacher);
    }
}
