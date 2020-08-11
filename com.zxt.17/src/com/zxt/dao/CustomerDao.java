package com.zxt.dao;
import com.zxt.po.Customer;
/**
 * Customer接口文件
 */
public interface CustomerDao {
	/**
	 * 根据id查询客户信息
	 */
	public Customer findCustomerById(Integer id);
}
