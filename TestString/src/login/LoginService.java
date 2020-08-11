package login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class LoginService {
    //    //设计一个方法，登陆认证 一维数组
//    public String loginForArray(String name, String password) {
//        String[] userBox = new String[]{"赵小涛", "乔旭涛", "陈旭"};
//        int[] passwordBox = new int[]{123, 666, 888};
//        for (int i = 0; i < userBox.length; i++) {
//            if (userBox[i].equals(name)) {
//                if (passwordBox[i] == Integer.parseInt(password)) {
//                    return "登录成功";
//                }
//    break;
//            }
//        }
//        return "用户名或密码错误";
//    }


//    //设计一个方法，做登陆认证--ArrayList
//    private ArrayList<String> userBox = new ArrayList<String>();
//
//    {
//        userBox.add("赵小涛-123");
//        userBox.add("乔旭涛-666");
//        userBox.add("陈旭-888");
//    }
//
//    public String loginForList(String name, String password) {
//        for (int i = 0; i < userBox.size(); i++) {
//            String[] value = userBox.get(i).split("-");
//            if (value[0].equals(name)) {
//                if (value[1].equals(password)) {
//                    return "登录成功";
//                }
//                break;
//            }
//        }
//        return "用户名或密码错误";
//    }


//    //设计一个方法 登陆认证
//    private HashSet<String> userBox = new HashSet<String>();
//
//    {
//        userBox.add("赵小涛-123");
//        userBox.add("乔旭涛-666");
//        userBox.add("陈旭-888");
//    }
//
//    public String loginForSet(String name, String password) {
//        Iterator<String> it = userBox.iterator();
//        while (it.hasNext()) {
//            String[] value = it.next().split("-");
//            if (value[1].equals(password)) {
//                return "登录成功";
//            }
//            break;
//        }
//        return "用户名或密码错误";
//    }


    //设计一个方法 登陆认证 map
    private HashMap<String, Integer> userBox = new HashMap<String, Integer>();

    {
        userBox.put("赵小涛", 123);
        userBox.put("乔旭涛", 666);
        userBox.put("陈旭", 888);
    }

    public String loginForMap(String name, String password) {
        Integer realPssword = userBox.get(name);
        if (realPssword != null) {
            if (realPssword.equals(Integer.parseInt(password))) {
                return "成功";
            }
        }
        return "失败";
    }
}