package com.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserDaoImpl
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/20 16:34
 **/

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao...");
    }
}
