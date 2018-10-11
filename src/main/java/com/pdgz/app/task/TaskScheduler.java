package com.pdgz.app.task;

import com.pdgz.app.entity.UserEntity;
import com.pdgz.app.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskScheduler {

    @Autowired
    private UserMapper userMapper;

//    @Scheduled(cron = "0/2 * * * * *")
    public void insertTask(){

        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("测试2");
        userEntity.setPassWord("12345");
        userEntity.setUserId("0002");
        userMapper.insert(userEntity);
        System.out.println("定时任务插入数据成功：userEntity"+userEntity);

    }
}
