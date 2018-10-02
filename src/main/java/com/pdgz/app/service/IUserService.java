package com.pdgz.app.service;

import com.pdgz.app.util.Result;

public interface IUserService {
    Result userLogin(String userName, String password);
}
