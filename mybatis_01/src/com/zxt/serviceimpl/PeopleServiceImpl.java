package com.zxt.serviceimpl;

import com.zxt.po.People;
import com.zxt.service.PeopleService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//在数据访问层处理异常和在控制器中处理异常，service中之抛出异常
public class PeopleServiceImpl implements PeopleService {
    InputStream is = Resources.getResourceAsStream("mybatis.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
    SqlSession session = factory.openSession();

    public PeopleServiceImpl() throws IOException {
    }

    @Override
    public List<People> show() throws IOException {
        //前面是工厂设计模式，实例化工厂对象时，使用的是构建者设计模式，名称标志，后面有builder
        //构建者模式的意义，简化对象实例化过程
        List<People> list = session.selectList("com.zxt.mapper.PeopleMapper.selAll");
        session.close();
        return list;
    }
//    @Override
//    public int ins() throws IOException {
//        People p = new People();
//        p.setName("赵小涛");
//        p.setAge(99);
//        int index = session.insert("com.zxt.mapper.PeopleMapper.ins", p);
//        if (index > 0) {
//            System.out.println("插入成功");
//        } else {
//            System.out.println("插入失败");
//        }
//        session.commit();
//        session.close();
//        return index;
//    }

}
