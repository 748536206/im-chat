package com.instant.controller;

import com.instant.entity.ImFriendgroups;
import com.instant.service.ImFriendgroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * 好友分组
 */
@RestController
@RequestMapping("/friendgroups")
public class ImFriendgroupsController {
    @Autowired
    private ImFriendgroupsService imFriendgroupsService;
    /**
     * 查询好友分组信息
     * @return
     */
    @RequestMapping(value = "/selectfriendGroupstouser", method = RequestMethod.GET)
    public List<ImFriendgroups> selectfriendGroupstouser(int userId) {
        List<ImFriendgroups> imFriendgroupsList = imFriendgroupsService.selectfriendGroupstouser(userId);
        return imFriendgroupsList;
    }
}
