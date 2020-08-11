package com.cc.jdbc;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
    /**
     * 使用execute()方法建表
     */
//	public static void main(String[] args) {
//		// 加载配置文件
//		ApplicationContext applicationContext = 
//		   new ClassPathXmlApplicationContext("applicationContext.xml");
//		// 获取JdbcTemplate实例
//		JdbcTemplate jdTemplate = 
//			   (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
//		// 使用execute()方法执行SQL语句，创建用户账户管理表account
//		jdTemplate.execute("create table account(" + 
//					         "id int primary key auto_increment," +
//					         "username varchar(50)," + 
//					         "balance double)");
//		System.out.println("账户表account创建成功！");
//	}
    @Test
    public void mainTest() {

        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取JdbcTemplate实例
        JdbcTemplate jdTemplate =
                (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

        // 使用execute()方法执行SQL语句，创建用户账户管理表account
        //jdTemplate.execute("create table account(" + "id int primary key auto_increment," + "username varchar(50)," + "balance double)");
        //System.out.println("账户表account创建成功！");
        //jdTemplate.execute("create table t_customer(" + "id int primary key auto_increment," + "username varchar(50)," + "jobs varchar(255)," + "phone varchar(255))");
        //System.out.println("账户表t_customer创建成功！");
        //jdTemplate.execute("create table t_user(" + "id int primary key auto_increment," + "name varchar(50)," + "age int (10))");
        //System.out.println("账户表t_user创建成功！");

        //第九章用
        //jdTemplate.execute("create table tb_idcard(" + "id int primary key auto_increment," + "code varchar (18))");
        //System.out.println("账户表tb_idcard创建成功！");
        //jdTemplate.execute("create table tb_person(" + "id int primary key auto_increment," + "name varchar(50)," + "age int (10),"+"sex varchar(8),"+"card_id int,"+"foreign key(card_id) REFERENCES tb_idcard(id))");
        //System.out.println("账户表tb_person创建成功！");
        //jdTemplate.execute("create table tb_user(" + "id int primary key auto_increment," + "username varchar(50)," + "address varchar (256))");
        //System.out.println("账户表tb_user创建成功！");
        //jdTemplate.execute("create table tb_orders(" + "id int primary key auto_increment," + "number varchar(50)," + "user_id int (32)," + "foreign key(user_id) REFERENCES tb_user(id))");
        //System.out.println("账户表tb_orders创建成功！");
        //jdTemplate.execute("create table tb_product(" + "id int primary key auto_increment," + "name varchar(50)," + "price double)");
        //System.out.println("账户表tb_product创建成功！");
        //jdTemplate.execute("create table tb_ordersitem(" + "id int primary key auto_increment," + "orders_id int(50)," + "product_id int (32)," + "foreign key(orders_id) REFERENCES tb_orders(id)," + "foreign key(product_id) REFERENCES tb_product(id))");
        //System.out.println("账户表tb_ordersitem创建成功！");
    }

    @Test
    public void addAccountTest() {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        // 创建Account对象，并向Account对象中添加数据
        Account account = new Account();
        account.setUsername("tom");
        account.setBalance(1000.00);
        // 执行addAccount()方法，并获取返回结果
        int num = accountDao.addAccount(account);
        if (num > 0) {
            System.out.println("成功插入了" + num + "条数据！");
        } else {
            System.out.println("插入操作执行失败！");
        }
    }

    @Test
    public void updateAccountTest() {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        // 创建Account对象，并向Account对象中添加数据
        Account account = new Account();
        account.setId(4);
        account.setUsername("Jack");
        account.setBalance(2000.00);
        // 执行updateAccount()方法，并获取返回结果
        int num = accountDao.updateAccount(account);
        if (num > 0) {
            System.out.println("成功修改了" + num + "条数据！");
        } else {
            System.out.println("修改操作执行失败！");
        }
    }

    @Test
    public void deleteAccountTest() {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        // 执行deleteAccount()方法，并获取返回结果
        int num = accountDao.deleteAccount(2);
        if (num > 0) {
            System.out.println("成功删除了" + num + "条数据！");
        } else {
            System.out.println("删除操作执行失败！");
        }
    }

    @Test
    public void findAccountByIdTest() {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        // 执行findAccountById()方法
        Account account = accountDao.findAccountById(3);
        System.out.println(account);
    }

    @Test
    public void findAllAccountTest() {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        // 执行findAllAccount()方法,获取Account对象的集合
        List<Account> account = accountDao.findAllAccount();
        // 循环输出集合中的对象
        for (Account act : account) {
            System.out.println(act);
        }
    }
}
