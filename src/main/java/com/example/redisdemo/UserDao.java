package com.example.redisdemo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/6/22 14:46
 */
@Mapper
public interface UserDao {
    User findUserByName(String name);
}
