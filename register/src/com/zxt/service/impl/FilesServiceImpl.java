package com.zxt.service.impl;

import com.zxt.mapper.FilesMapper;
import com.zxt.pojo.Files;
import com.zxt.pojo.Users;
import com.zxt.service.FilesService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FilesServiceImpl implements FilesService {
    @Resource
    private FilesMapper filesMapper;

    @Override
    public List<Files> show() {
        return filesMapper.selAll();
    }

    @Override
    public int updCount(int id, Users users, String name) {
        Logger logger = Logger.getLogger(FilesService.class);
        logger.info(users.getUsername() + "下载了" + name);
        return filesMapper.updCountById(id);
    }
}
