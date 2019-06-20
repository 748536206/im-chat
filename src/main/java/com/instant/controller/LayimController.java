package com.instant.controller;

import cn.hutool.core.util.IdUtil;
import com.instant.entity.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * layim
 */
@RestController
@RequestMapping("/layim")
public class LayimController {

    /**
     * 用户未读消息个数(暂时模拟数据)
     * */
    @GetMapping(value = "/apply-unread")
    public Response msgCount(){
        int count = 2;
        return new Response().success(count);
    }

    /**
     * 未读消息个数(暂时模拟数据)
     * */
    @GetMapping(value = "/msgbox")
    public Response msgbox(){
        return new Response().success("你好");
    }


    /**
     * token(暂时模拟数据)
     * */
    @GetMapping(value = "/token")
    public Response token(){
        return new Response().success(IdUtil.randomUUID());
    }



}
