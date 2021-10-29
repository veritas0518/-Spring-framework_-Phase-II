package com.spring5.service;

import com.spring5.dao.UserDao;
import com.spring5.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: User
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/20 14:54
 **/

/*
    在注解里面value属性值可以省略不写
    默认值是类名称的首字母小写，即：类名称是UserService，那么默认值就是userService
 */
@Controller //bean id="userService" class="..." **bean里的id值和value是等价的**
public class UserService {

    @Value(value = "abc")
    private String name;

    //定义dao类型属性
    //不需要添加set方法，因为这个注解已经封装了，只需要添加注入属性注解
//    @Autowired //根据类型进行注入
//    @Qualifier(value = "userDaoImpl") //根据名称进行注入
//    private UserDao userDao = new UserDaoImpl();

    @Resource(name = "userDaoImpl1") //根据类型进行注入
    private UserDao userDao;
    public void add() {
        System.out.println("service add..."+name);
        userDao.add();
    }
}
