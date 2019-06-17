package com.instant.service;

import com.instant.entity.ImUserGroups;

import java.util.List;

public interface ImUserGroupsService {
    /**
     * 查询群列表
     */
    List<ImUserGroups> selectGroupstouser(int userId);
}
