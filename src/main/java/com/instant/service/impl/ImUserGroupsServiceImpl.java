package com.instant.service.impl;

import com.instant.dao.ImUserGroupsDao;
import com.instant.entity.ImUserGroups;
import com.instant.entity.ImUserGroupsQuery;
import com.instant.service.ImUserGroupsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImUserGroupsServiceImpl implements ImUserGroupsService {
    private static Logger logger = LoggerFactory.getLogger(ImUserGroupsServiceImpl.class);
    @Autowired
    private ImUserGroupsDao imUserGroupsDao;


    /**
     * 查询群列表
     * @return
     */
    @Override
    public List<ImUserGroups> selectGroupstouser(int userId) {
        ImUserGroupsQuery imUserGroupsQuery = new ImUserGroupsQuery();
        ImUserGroupsQuery.Criteria criteria =imUserGroupsQuery.createCriteria();
        criteria.andUgAdminidEqualTo(userId);
        List<ImUserGroups> imUserGroupsList = imUserGroupsDao.selectByQuery(imUserGroupsQuery);
        return imUserGroupsList;
    }
}
