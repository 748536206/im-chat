package com.instant.util;

import com.instant.shiro.enity.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户登录信息
 */
public class UserInfoUtil {
    private static Logger logger = LoggerFactory.getLogger(UserInfoUtil.class);

    /**
     * 获取用户登录信息
     * @return
     */
    public static UserInfo getUser() {
        UserInfo userInfo = null;
        try {
            userInfo = (UserInfo) SecurityUtils.getSubject().getPrincipal();
        } catch (Exception e) {
            logger.info("用户登录信息获取异常{}" + e.getMessage());
        }
        return userInfo;
    }

}
