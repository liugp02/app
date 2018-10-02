package com.pdgz.app.mapper;

import com.pdgz.app.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    UserEntity select(String userName);

}
