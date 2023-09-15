package com.company.spring5.annotation.service2;

import com.company.spring5.annotation.dao2.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService2")//默认值是类名称，首字母小写，与<bean id="userService2"类似>
public class UserService2 {

    //Value注入普通属性
    @Value(value = "chao")
    private String name;

   //@Autowired，Qualifier，Resource注入引用对象
    //@Resource(name = "userDaoImp")//这里的name类似于bean id，根据类型或名称
    @Autowired
   @Qualifier(value = "userDaoImp")
    private UserDao userDao;
    public void add(){
     userDao.add();
        System.out.println("service.........."+name);
    }
}
