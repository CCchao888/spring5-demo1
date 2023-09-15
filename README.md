# spring5-demo1
##一、spring概述
##二、IOC
##三、AOP
###（1）AOP术语
1. aop概念![img.png](img.png)![img_1.png](img_1.png)
2. 连接点：类里面可以被增强的方法
3. 切入点：实际被增强的方法
4. 通知（增强）：实际增强的逻辑部分，分为：
- 前置通知
- 后置通知
- 环绕通知
- 异常通知
- 最终通知
5. 切面：把通知应用到切入点的过程
###（2）基于AspectJ框架实现AOP操作
1. 实现方式：
- xml配置文件
- 注解方式
   
2. 切入点表达式
- 作用：知道对哪个类的哪个方法进行增强。
- 切入点表达式：ps:execution(* com.company.spring5.aop.aopanno.User.add(..))

##四、jdbcTemplate
