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
public class HappinessService {
    @Autowired
    private HappinessDao happinessDao;

    public Happiness selectService(String city){
        return happinessDao.findHappinessByCity(city);
    }

    @Transactional
    public void insertService(){
        happinessDao.insertHappiness("西安", 9421);
        //int a = 1 / 0; //模拟故障
        happinessDao.insertHappiness("长安", 1294);
    }
}
