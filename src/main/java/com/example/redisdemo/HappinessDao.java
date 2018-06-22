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
public interface HappinessDao {
    @Select("SELECT * FROM happiness WHERE city = #{city}")
    Happiness findHappinessByCity(@Param("city") String city);

    @Insert("INSERT INTO happiness(city, num) VALUES(#{city}, #{num})")
    int insertHappiness(@Param("city") String city, @Param("num") Integer num);
}
