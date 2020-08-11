package com.zxt.mapper;

import com.zxt.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> selByPid(int pid);
}
