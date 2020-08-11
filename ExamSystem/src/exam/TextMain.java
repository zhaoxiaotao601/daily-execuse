package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class TextMain {
    public static void main(String[] args) {

        ExamMachine machine = new ExamMachine();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入考试系统，\n请输入用户名");
        String username = input.nextLine();
        System.out.println("请输入密码");
        String password = input.nextLine();
        Student student = new Student(username, password);
        String result = machine.login(student.getUsername(), student.getPassword());
        if (result.equals("登录成功")) {

            System.out.println("登录成功\n" + student.getUsername() + "学生开始考试，不要作弊，请认真作答");
            ArrayList<Question> paper = machine.getPaper();
            String[] answers = student.exam(paper);
            Teacher teacher = new Teacher();
            int score = teacher.checkPaper(paper, answers);
            System.out.println(student.getUsername()+"最终的成绩为："+score);
        }


//        Question question = new Question("如下哪个选项不是java基本类型？\n\tA.String\n\tB.char\n\tC.int\n\tD.double","A");
//
//        System.out.println(question.getTitle());
    }
}
