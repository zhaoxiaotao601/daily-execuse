package com.cc.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cc.dao.CustomerDao;
import com.cc.mapper.CustomerMapper;
import com.cc.po.Customer;
/**
 * DAO测试类
 */
public class DaoTest {
	@Test
	public void findCustomerByIdDaoTest(){
		ApplicationContext act = 
		    new ClassPathXmlApplicationContext("applicationContext.xml");
          // 根据容器中Bean的id来获取指定的Bean
	     CustomerDao customerDao = (CustomerDao) act.getBean("customerDao");
//	     CustomerDao customerDao = act.getBean(CustomerDao.class);
		 Customer customer = customerDao.findCustomerById(1);
		 System.out.println(customer);
	}
	
	@Test
	public void findCustomerByIdMapperTest(){	
	    ApplicationContext act = 
	            new ClassPathXmlApplicationContext("applicationContext.xml");
	    CustomerMapper customerMapper = act.getBean(CustomerMapper.class);   
	    Customer customer = customerMapper.findCustomerById(5);
	    System.out.println(customer);
	}

}
