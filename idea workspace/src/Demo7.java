import java.util.Scanner;

public class Demo7 {
    String[][] box = {{"赵小涛", "123456"}, {"陈旭", "666666"}, {"乔旭涛", "888888"}};

    public String login(String userName, String passWord) {
        String result = "用户名或密码错误！";
        for (int i = 0; i < box.length; i++) {
            if (box[i][0].equals(userName)) {
                if (box[i][1].equals(passWord)) {
                    result = "登录成功！";
                }
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Demo7 d7 = new Demo7();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = input.nextLine();
        System.out.println("请输入密码：");
        String passWord = input.nextLine();
        String result = d7.login(userName, passWord);
        System.out.println(result);
    }
}
