package com.instant.shiro.sevice.impl;

import com.instant.shiro.dao.UserInfoDao;
import com.instant.shiro.enity.UserInfo;
import com.instant.shiro.sevice.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    private static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        logger.info("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}