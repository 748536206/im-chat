package com.instant.service;

import com.instant.entity.UserInfo;

public interface UserService {
    /**
     * 查询个人信息
     */
    UserInfo selectUserInfo(int userId);
}
