package com.pdgz.app.impl;

import com.pdgz.app.mapper.UserMapper;
import com.pdgz.app.entity.UserEntity;
import com.pdgz.app.service.IUserService;
import com.pdgz.app.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result userLogin(String userName, String passWord) {
        Result result = new Result(true);
        //首先根据账号查询密码 校验密码是否正确
        UserEntity userEntity = userMapper.select(userName);
        if (userEntity!=null){//账号不为空
            if(passWord.equals(userEntity.getPassWord())){
                result.setMsg("登录成功");
                result.setData(userEntity);
            }else {
                result.setMsg("密码错误");
                result.setData("");
            }
        }else {//账号为空
            result.setMsg("账号不存在");
            result.setData("");
        }
        return result;
    }

    @Override
    public int insertList() {
        List<UserEntity> list = new ArrayList<>();
        UserEntity userEntity = new UserEntity();
        userEntity.setId(UUID.randomUUID()+"");
        userEntity.setUserId("0001");
        userEntity.setUserName("测试0001");
        UserEntity userEntity1 = new UserEntity();
        userEntity1.setId(UUID.randomUUID()+"");
        userEntity1.setUserId("0002");
        userEntity1.setUserName("测试0002");
        list.add(userEntity);
        list.add(userEntity1);
        userMapper.insertList(list);
        return 0;
    }

    @Override
    public void updateUserList() {
        List<UserEntity> list = new ArrayList<>();
        UserEntity userEntity = new UserEntity();
        userEntity.setPassWord("123");
        UserEntity userEntity1 = new UserEntity();
        userEntity1.setPassWord("456");
        list.add(userEntity);
        list.add(userEntity1);
        this.userMapper.updateUserList(list);
    }

}
