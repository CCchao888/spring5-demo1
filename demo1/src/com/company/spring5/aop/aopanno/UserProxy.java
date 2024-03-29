package com.company.spring5.aop.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect   //生成代理对象
@Order(3)
public class UserProxy {

    //相同切入点的抽取
    @Pointcut(value = "execution(* com.company.spring5.aop.aopanno.User.add(..))")
    public void pointcut(){

    }

    //前置通知
    @Before(value = "pointcut()")
    public void before(){
        System.out.println("before....");
    }
    //后置通知
    @AfterReturning(value = "execution(* com.company.spring5.aop.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning....");
    }
    //最终通知
    @After(value = "execution(* com.company.spring5.aop.aopanno.User.add(..))")
    public void after(){
        System.out.println("after....");
    }
    //异常通知
    @AfterThrowing(value = "execution(* com.company.spring5.aop.aopanno.User.add(..))")
    public void afterthrow(){
        System.out.println("afterthrow....");
    }
    //环绕通知
    @Around(value = "execution(* com.company.spring5.aop.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }


}
