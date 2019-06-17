package com.instant.controller;

import com.instant.entity.UserInfo;
import com.instant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 个人信息
 */
@RestController
@RequestMapping("/userInfo")
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 查询个人信息
     * @return
     */
    @RequestMapping(value = "/selectUserInfo", method = RequestMethod.GET)
    public UserInfo selectUserInfo(int userId) {
        UserInfo userInfo = userService.selectUserInfo(userId);
        return userInfo;
    }


}
