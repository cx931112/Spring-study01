package com.spring.daoimpl;



import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository该注解加在daoimpl层，3.0和4.0都支持
@Component//另一种注解方式
public class UserDaoImpl {
public void addUser(String username,String password){
	System.out.println("username:"+username);
}
}
