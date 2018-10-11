package com.pdgz.app.service;

import com.pdgz.app.util.Result;

public interface IUserService {

    Result userLogin(String userName, String password);

    /**
     * 批量插入数据
     */
    int insertList();

    void updateUserList();
}
