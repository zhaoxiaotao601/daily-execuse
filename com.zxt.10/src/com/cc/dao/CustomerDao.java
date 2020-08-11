package com.cc.dao;
import com.cc.po.Customer;
public interface CustomerDao {
	// 通过id查询客户
	public Customer findCustomerById(Integer id);
}
