package com.olive.spring.test;

import com.olive.spring.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void fun01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User)ac.getBean("user");
        System.out.println(user);
    }
}
