package com.pdgz.app.impl;

import com.pdgz.app.mapper.UserMapper;
import com.pdgz.app.entity.UserEntity;
import com.pdgz.app.service.IUserService;
import com.pdgz.app.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
}
