package com.zxt.service.impl;

import com.zxt.mapper.MenuMapper;
import com.zxt.pojo.Menu;
import com.zxt.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

@Service        //相当于配置一个bean
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> show() {
        return menuMapper.selByPid(0);
    }
}
