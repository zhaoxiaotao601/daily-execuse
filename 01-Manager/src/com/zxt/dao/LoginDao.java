package com.zxt.dao;

import com.zxt.po.User;

public interface LoginDao {
	User checkLoginDao(String uname, String pwd);
}
