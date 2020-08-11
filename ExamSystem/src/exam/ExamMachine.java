package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class ExamMachine {
    private HashMap<String, String> userBox = new HashMap<String, String>();

    {
        userBox.put("赵小涛", "666");
        userBox.put("乔旭涛", "888");
        userBox.put("陈旭", "123");
    }

    //属性--题库 好多个question 对象 每一个对象是一个题目
    //set集合
    //equals 和 hashcode方法
    private HashSet<Question> questionBank = new HashSet<Question>();

    //利用快初始化hashset
    {
        questionBank.add(new Question("以下选项哪个是java基本数据类型？\n\tA.String\n\tB.Integer\n\tC.boolean\n\tD.Math", "C"));
        questionBank.add(new Question("以下选项哪个不是java基本数据类型？\n\tA.String\n\tB.int\n\tC.boolean\n\tD.doublle", "A"));
        questionBank.add(new Question("以下选项哪个是java引用数据类型？\n\tA.String\n\tB.int\n\tC.boolean\n\tD.char", "A"));
        questionBank.add(new Question("以下选项哪个不是java引用数据类型？\n\tA.String\n\tB.Integer\n\tC.boolean\n\tD.Math", "C"));
        questionBank.add(new Question("以下选项哪个是java.util包中的类？\n\tA.String\n\tB.Integer\n\tC.Calender\n\tD.Random", "B"));
        questionBank.add(new Question("以下选项哪个不是java.util包中的类？\n\tA.Date\n\tB.Integer\n\tC.boolean\n\tD.Math", "C"));
        questionBank.add(new Question("以下选项哪个不是String类中的方法？\n\tA.compareTo\n\tB.append\n\tC.substring\n\tD.concat", "B"));
        questionBank.add(new Question("以下选项哪个是String类中的方法？\n\tA.append\n\tB.delete\n\tC.insert\n\tD.concat", "D"));
        questionBank.add(new Question("以下选项哪个不是接口中属性的修饰符？\n\tA.public\n\tB.static\n\tC.final\n\tD.abstract", "D"));
        questionBank.add(new Question("以下选项哪个不是Set集合的方法？\n\tA.set\n\tB.add\n\tC.remove\n\tD.iterator", "A"));
    }

    //设计方法  随机生成试卷
    //参数 确定试卷5道题 不用 返回值--》试卷集合ArrayList<question>
    public ArrayList<Question> getPaper() {
        System.out.println("考试机器正在随机生成试卷，请耐心等待");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //不重复的试卷  set存--》arraylist
        HashSet<Question> paper = new HashSet<Question>();
        //随机序号  找寻题目
        ArrayList<Question> questionsBank = new ArrayList<Question>(this.questionBank);
        //抽屉
        while (paper.size() != 5) {
            int index = new Random().nextInt(this.questionBank.size());
            paper.add(questionsBank.get(index));

        }
        return new ArrayList<Question>(paper);
    }

    //登陆方法
    public String login(String username, String password) {
        String realPassword = this.userBox.get(username);
        if (realPassword != null && realPassword.equals(password)) {
            return "登录成功";
        }
        return "用户名或密码错误";
    }

}
