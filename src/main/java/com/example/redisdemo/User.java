package com.example.redisdemo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/6/19 15:45
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUId = 1L;

    private int id;
    private String username;
    private int age;
    private Date ctm;
}
