package com.zxt.test;

import com.zxt.po.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class test_02 {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        //使用工厂设计模式
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //生产SqlSession
        SqlSession session = factory.openSession();
        //查询
//        List<Flower> list = session.selectList("com.zxt.mapper.selAll");
//        for (Flower flower : list) {
//            System.out.println(flower.toString());
//        }

//        int count = session.selectOne("com.zxt.mapper.selById");
//        System.out.println(count);
        //把数据库中哪个列的值当作map的key
        Map<Object, Object> map = session.selectMap("com.zxt.mapper.sel", "uname");
        System.out.println(map);

        session.close();
    }
}
