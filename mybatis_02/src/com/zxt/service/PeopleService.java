package com.zxt.service;

import com.zxt.po.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;

public interface PeopleService {
    //分页显示
    PageInfo showPage(int pageSize, int pageNumber) throws IOException;
}
