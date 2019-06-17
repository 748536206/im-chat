package com.instant.service.impl;

import com.instant.dao.UserDao;
import com.instant.entity.UserInfo;
import com.instant.entity.UserInfoQuery;
import com.instant.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userInfoDao;

    /**
     * 查询个人信息
     * @return
     */
    @Override
    public UserInfo selectUserInfo(int userId) {
        UserInfo userInfo = new UserInfo();
        UserInfoQuery userInfoQuery = new UserInfoQuery();
        UserInfoQuery.Criteria criteria = userInfoQuery.createCriteria();
        criteria.andUidEqualTo(userId);
        List<UserInfo> userInfoList = userInfoDao.selectByQuery(userInfoQuery);
        if (null != userInfoList && userInfoList.size() > 0) {
            userInfo = userInfoList.get(0);
        }
        return userInfo;
    }
}
