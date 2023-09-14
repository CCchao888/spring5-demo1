package com.company.spring5.beanlife;

public class Orders2 {
    //无参构造

    public Orders2() {
        System.out.println("第一步 执行无参构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用set方法设置属性值");
    }
    //创建执行的初始化方法
    public void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }
    //创建执行的销毁方法
    public void destroyMethod(){
        System.out.println("第五步 执行销毁的方法");
    }
}
