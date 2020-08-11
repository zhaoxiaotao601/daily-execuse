package com.atguigu.crud.controller;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname DepartmentController
 * @Description TODO
 * @Date 2020/5/14 14:27
 * @Created by Administrator
 * 处理和部门有关的
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 返回所有的部门信息
     */
    @RequestMapping("depts")
    @ResponseBody
    public Msg getDepts() {
        //查处的所有部门信息
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts", list);

    }

}
