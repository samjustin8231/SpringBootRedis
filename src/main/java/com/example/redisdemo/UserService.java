package com.example.redisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/6/22 14:49
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User selectService(String city){
        return userDao.findUserByName(city);
    }

}
