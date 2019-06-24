package com.instant.controller;

import com.instant.entity.ImFriendgroups;
import com.instant.service.ImFriendgroupsService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
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



    public static void main(String[] args) {
        String newPassword = new SimpleHash("MD5",//散列算法:这里使用MD5算法
                "123456",//明文密码
                ByteSource.Util.bytes("唯有尘世依然美8d78869f470951332959580424d4bf4f"),//salt：用户名 + salt
                2//散列的次数，相当于MD5(MD5(**))
        ).toHex();
        System.out.println(newPassword);
    }


}
