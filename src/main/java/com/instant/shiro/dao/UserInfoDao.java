package com.instant.shiro.dao;


import com.instant.shiro.enity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);
}