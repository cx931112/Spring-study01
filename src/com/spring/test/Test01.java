package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.serviceimpl.UserServiceImpl;

public class Test01 {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	//需要使用指定的名字，如果没有指定的名字这里userService应该是类名首字母小写即userServiceImpl
	UserServiceImpl userServiceImpl=(UserServiceImpl)ac.getBean("userService");
	userServiceImpl.addUser("cx", "123");
}
}
