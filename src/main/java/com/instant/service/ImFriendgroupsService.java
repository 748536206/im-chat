package com.instant.service;

import com.instant.entity.ImFriendgroups;

import java.util.List;

public interface ImFriendgroupsService {
    /**
     * 查询好友分组信息
     */
    List<ImFriendgroups> selectfriendGroupstouser(int userId);
}
