package atmsystem;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        AtmService service = new AtmService();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎您使用ATM自助服务系统\n请输入用户名：");
        String aname = input.nextLine();
        System.out.println("请输入密码：");
        String apassword = input.nextLine();
        String loginResult = service.login(aname, apassword);
        System.out.println(loginResult);
        if (loginResult.equals("登录成功")) {
            System.out.println("恭喜您登录成功，请您输入操作项目");
            System.out.println("查询余额请输入1\n存款请输入2\n取款请输入3\n转账请输入4\n退出请输入5\n如需帮助请拨打电话1234567890");
            String option = input.nextLine();
            switch (option) {
                case "1":
                    Float abalance = service.queryBalance(aname);
                    System.out.println("尊敬的" + aname + "用户，您的可用余额为" + abalance);
                    break;
                case "2":
                    break;
            }
        } else {
            System.out.println("对不起" + loginResult);
        }
    }
}
