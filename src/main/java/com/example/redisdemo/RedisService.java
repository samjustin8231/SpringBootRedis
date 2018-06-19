package com.example.redisdemo;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/6/19 15:43
 */
public interface RedisService {

    public void set(String key, Object value);

    public Object get(String key);

}
