package com.zxt.service.impl;

import com.zxt.po.PageInfo;
import com.zxt.service.PeopleService;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class PeopleServiceImpl implements PeopleService {

    @Override
    public PageInfo showPage(int pageSize, int pageNumber) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        PageInfo pi = new PageInfo();
        pi.setPageNumber(pageNumber);
        pi.setPageSize(pageSize);

        Map<String, Object> map = new HashMap<>();
        map.put("pageStart", pageSize * (pageNumber - 1));
        map.put("pageSize", pageSize);
        pi.setList(session.selectList("com.zxt.mapper.PeopleMapper.selByPage", map));
        //总条数
        int count = session.selectOne("com.zxt.mapper.PeopleMapper.selCount");
        pi.setTotal(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        session.close();
        return pi;
    }
}
