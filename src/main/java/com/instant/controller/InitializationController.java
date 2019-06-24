package com.instant.controller;

import com.instant.entity.Response;
import com.instant.service.InitializationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 初始化用户信息
 */
@RestController
@RequestMapping("/user")
public class InitializationController {

    @Autowired
    private InitializationsService initializationsService;

    /**
     * 初始化用户信息
     *
     * @return
     */
    @RequestMapping(value = "/initialization", method = RequestMethod.GET)
    public Response initialization() {
        Response response = initializationsService.initialization();
        return response;
    }

}
