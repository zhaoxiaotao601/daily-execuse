package com.zxt.service;

import com.zxt.po.People;

import java.io.IOException;
import java.util.List;

public interface PeopleService {
    //显示全部
    List<People> show() throws IOException;
    //插入数据
//    int ins() throws IOException;
}
