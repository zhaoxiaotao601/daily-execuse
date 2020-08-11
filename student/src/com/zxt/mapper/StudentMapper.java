package com.zxt.mapper;

import com.zxt.pojo.PageInfo;
import com.zxt.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selByPage(PageInfo pi);
    //总条数
    long selCountByPageInfo(PageInfo pi);
}
