package com.company.spring5.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
@Transactional(noRollbackFor = {NoSuchFieldError.class},timeout = -1,readOnly = false,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {
    @Autowired
    private UserDao userDao;

    //转账业务方法
    public void accountMoney(){
       // try{
            //1.开启事务
            //2.进行业务操作

            userDao.reduceMoney();
            //模拟异常
            int i=10/0;

            userDao.addMoney();

            //3.没有异常，则提交事务
      //  }catch (Exception e){
            //4.出现异常，事务回滚
      //  }

    }
}
