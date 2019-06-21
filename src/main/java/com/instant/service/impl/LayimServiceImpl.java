package com.instant.service.impl;

import com.instant.entity.Response;
import com.instant.service.LayimService;
import com.instant.util.AESUtil;
import com.instant.util.UserInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LayimServiceImpl implements LayimService {
    private static Logger logger = LoggerFactory.getLogger(ImUserGroupsServiceImpl.class);








    @Override
    public Response getUserToken() {
        int userId = UserInfoUtil.getUser().getUid();
        if (userId > 0) {
            String key = String.format("%d_%d", userId, System.currentTimeMillis());
            logger.info("当前时间：{}",key);
            String token = AESUtil.encyrpt(key);
            return new  Response().success(token);
        }
        return new Response().failure("用户不存在");
    }
}
