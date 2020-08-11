package com.atguigu.cache.service;

import com.atguigu.cache.bean.Employee;
import com.atguigu.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 将方法的运行结果进行缓存，以后再要相同的数据，直接从缓存中获取，不用调用方法
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = {"emp"}/*, keyGenerator = "myKeyGenerator", condition = "#a0>1", unless = "#a0==2"*/)
    public Employee getEmp(Integer id) {
        System.out.println("查询" + id + "号员工");
        Employee emp = employeeMapper.getEmpById(id);
        return emp;
    }

    /**
     * @param employee
     * @return
     * @CachePut:既调用方法，又更新缓存数据 修改了数据库的某个数据，同时更新缓存
     */
    @CachePut(value = "emp", key = "#result.id")
    public Employee updateEmp(Employee employee) {
        System.out.println("updateEmp:" + employee);
        employeeMapper.updateEmp(employee);
        return employee;
    }

    /**
     * 缓存清除
     */
    @CacheEvict(value = "emp"/*key = "#id",allEntries = true*/)
    public void deleteEmp(Integer id) {
        System.out.println("deleteEmp" + id);
        //employeeMapper.deleteEmp(id);
    }
}
