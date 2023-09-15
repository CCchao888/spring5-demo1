package com.company.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//使用配置类代替xml配置文件，实现完全注解
@Configuration
@ComponentScan(basePackages={"com.company.spring5"})
public class SpringConfig {

}
