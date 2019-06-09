package com.instant.controller;

import com.instant.layim.domain.result.JsonResult;
import com.instant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * layim基础初始化数据
     * 好友信息，群组信息，个人信息
     * */
    @RequestMapping(value = "getBaseData", method = RequestMethod.GET)
    public JsonResult getBaseData(){
        return userService.getBaseList();
    }

}
