package com.pdgz.app.mapper;

import com.pdgz.app.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    UserEntity select(String userName);

    void insert(UserEntity userEntity);

    void insertList(@Param("list") List<UserEntity> list);

    void updateUserList(@Param("list") List<UserEntity> list);
}
