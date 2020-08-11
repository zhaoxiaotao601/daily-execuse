package ioc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MySpring {
    //设计一个方法，帮我们控制对象的创建
    //需要一个参数  String 类全名
    //需要一个返回值  对象Object
    public Object getbean(String className) {
        Object obj = null;
        Scanner input = new Scanner(System.in);
        System.out.println("请给" + className + "类的对象赋值");

        try {
            //获取方法传递进来的参数对应的类
            Class clazz = Class.forName(className);
            //通过clazz创建一个对象
            obj = clazz.newInstance();

            //通过clazz找到所有私有属性
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                //获取属性名
                String fieldName = field.getName();
                //手动拼串儿
                String firstLetter = fieldName.substring(0, 1).toUpperCase();
                String otherLetters = fieldName.substring(1);
                StringBuilder setMethodName = new StringBuilder("set");
                setMethodName.append(firstLetter);
                setMethodName.append(otherLetters);
                //后去field对应的属性类型--》找寻set方法时传递参数用
                Class fieldClass = field.getType();
                //通过处理好的set方法名，找寻类中的set方法
                Method setMethod = clazz.getMethod(setMethodName.toString(), fieldClass);
                System.out.println("请给" + fieldName + "属性提供值");
                String value = input.nextLine();
                setMethod.invoke(obj,value);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
