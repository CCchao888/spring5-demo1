package com.company.spring5.annotation.service2;

import org.springframework.stereotype.Component;

@Component(value = "userService2")//默认值是类名称，首字母小写，与<bean id="userService2"类似>
public class UserService2 {
    public void add(){
        System.out.println("service..........");
    }
}
