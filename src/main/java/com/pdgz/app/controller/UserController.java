package com.pdgz.app.controller;

import com.pdgz.app.service.IUserService;
import com.pdgz.app.util.EmptyUtil;
import com.pdgz.app.util.RestServerStateCodeContant;
import com.pdgz.app.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public Result login(@RequestParam("userName") String userName,
                        @RequestParam("password") String passWord) {

        String msg = null;
        boolean rlt = true;
        if (EmptyUtil.isEmpty(userName)) {
            rlt = false;
            msg = "教师登录帐号不能为空";
        }
        if (EmptyUtil.isEmpty(passWord)) {
            rlt = false;
            msg = "教师登录密码不能为空";
        }
        if (!rlt) {
            return new Result(rlt, RestServerStateCodeContant.PARAM_NULL_ERROR, msg, "");
        }

        try {
            return this.userService.userLogin(userName, passWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,RestServerStateCodeContant.CHECK_PWD_LOCK,"","");
    }

    @RequestMapping(value = "/insertList")
    public void insertList(){
        this.userService.insertList();
    }

    @RequestMapping(value = "/updateUserList")
    public void  updateUserList(){
        this.userService.updateUserList();
    }


}
