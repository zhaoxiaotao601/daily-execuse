package com.zxt.test;

import com.zxt.po.People;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        //前面是工厂设计模式，实例化工厂对象时，使用的是构建者设计模式，名称标志，后面有builder
        //构建者模式的意义，简化对象实例化过程
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        People p = new People();
        p.setName("新增name");
        p.setAge(88);
        int index = session.insert("com.zxt.mapper.PeopleMapper.ins", p);
        if (index>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        session.commit();
        session.close();
    }
}
