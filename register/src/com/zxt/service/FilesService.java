package com.zxt.service;

import com.zxt.pojo.Files;
import com.zxt.pojo.Users;

import java.util.List;

public interface FilesService {
    /**
     * 显示全部
     * @return
     */
    List<Files> show();

    /**
     * 根据id修改资料下载次数
     * @param id
     * @return
     */
    int updCount(int id, Users users,String name);
}
