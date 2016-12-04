package com.spring.serviceimpl;

import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.daoimpl.UserDaoImpl;
//3.0和4.0都支持
//@Service("userService")Service层注解，如果交代名字则获得bean时需要使用该名字，如果没有交代则默认是类名首字母小写
@Component("userService")//另一种注解
public class UserServiceImpl {
	//3.0和4.0都支持
	@Autowired//自动注入注解
	private UserDaoImpl userDaoImpl;
	//此处的setter方法是必须的getter不是必须的
	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
public void addUser(String username,String password){
	userDaoImpl.addUser(username, password);
	
}

}
