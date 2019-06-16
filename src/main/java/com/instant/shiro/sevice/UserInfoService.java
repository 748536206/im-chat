package com.instant.shiro.sevice;


import com.instant.shiro.enity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}