package com.cc.dao.impl;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.cc.dao.CustomerDao;
import com.cc.po.Customer;
public class CustomerDaoImpl 
                      extends SqlSessionDaoSupport implements CustomerDao {
	// 通过id查询客户
	public Customer findCustomerById(Integer id) {
         	return this.getSqlSession().selectOne("com.cc.po"
				      + ".CustomerMapper.findCustomerById", id);
	}
}
