package com.instant.controller;

import com.instant.entity.ImUserGroups;
import com.instant.entity.Response;
import com.instant.service.ImUserGroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 群组
 */
@RestController
@RequestMapping("/groupstouser")
public class ImImUserGroupsController {
    @Autowired
    private ImUserGroupsService imUserGroupsService;

    /**
     * 查询群列表
     * @return
     */
    @RequestMapping(value = "/selectGroupstouser", method = RequestMethod.GET)
    public ImUserGroups selectGroupstouser(int userId) {
        ImUserGroups imUserGroups = imUserGroupsService.selectGroupstouser(userId);
        return imUserGroups;
    }

    /**
     * 查看群成员
     * @return
     */
    @RequestMapping(value = "/selectGroupSmember", method = RequestMethod.GET)
    public Response selectGroupSmember(int id) {
        Response response = imUserGroupsService.selectGroupSmember(id);
        return response;
    }


}
