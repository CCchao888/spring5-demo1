package com.company.spring5.aop.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserProxy2 {
    @Before(value = "execution(* com.company.spring5.aop.aopanno.User.add(..))")
    public void proxy2(){
        System.out.println("2222before.....");
    }
}
