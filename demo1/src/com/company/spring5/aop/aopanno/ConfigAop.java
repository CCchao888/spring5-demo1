package com.company.spring5.aop.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.company.spring5.aop.aopanno"})
@EnableAspectJAutoProxy
public class ConfigAop {
}
