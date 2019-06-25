package com.instant.service;

import com.instant.entity.ImUserGroups;
import com.instant.entity.ImUserGroupstouser;
import com.instant.entity.Response;

import java.util.List;

public interface ImUserGroupsService {
    /**
     * 查询群信息
     */
    ImUserGroups selectGroupstouser(int UgId);
    /**
     * 查询群成员
     */
    Response selectGroupSmember(int id);

    /**
     * 查询自己所在的群
     */
    List<ImUserGroupstouser> selectHaveUserGroups(int id);
}
