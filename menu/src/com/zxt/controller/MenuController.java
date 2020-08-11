package com.zxt.controller;

import com.zxt.pojo.Menu;
import com.zxt.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    /**
     * springmvc容器调用spring容器中的内容
     */
    @Resource
    private MenuService menuServiceImpl;

    @RequestMapping("show")
    @ResponseBody
    public List<Menu> show() { return menuServiceImpl.show();}
}
