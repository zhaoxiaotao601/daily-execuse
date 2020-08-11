package com.zxt.service;

import com.zxt.pojo.PageInfo;

public interface StudentService {
        PageInfo showPage(String sname,String tname,String pageSize,String pageNumber);
}
