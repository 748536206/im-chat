package com.instant.controller;

import com.instant.entity.ImFriends;
import com.instant.entity.UserInfo;
import com.instant.service.ImFriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 *
 * 好友信息
 */
@RestController
@RequestMapping("/friends")
public class ImFriendsClontroller {
        @Autowired
        private ImFriendsService imFriendsService;

    /**
     * 查询好友信息
     * @return
     */
    @RequestMapping(value = "/selectFriends", method = RequestMethod.GET)
    public List<ImFriends> selectFriends(int fgId,int userId) {
        List<ImFriends> imFriendsList = imFriendsService.selectFriends(fgId,userId);
        return imFriendsList;
    }
}
