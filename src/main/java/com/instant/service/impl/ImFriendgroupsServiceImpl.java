package com.instant.service.impl;

import com.instant.dao.ImFriendgroupsDao;
import com.instant.entity.ImFriendgroups;
import com.instant.entity.ImFriendgroupsQuery;
import com.instant.service.ImFriendgroupsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImFriendgroupsServiceImpl implements ImFriendgroupsService {
    private static Logger logger = LoggerFactory.getLogger(ImFriendgroupsServiceImpl.class);
    @Autowired
    private ImFriendgroupsDao imFriendgroupsDao;

    /**
     * 查询好友分组信息
     * @return
     */
    @Override
    public List<ImFriendgroups> selectfriendGroupstouser(int userId) {
        ImFriendgroupsQuery imFriendgroupsQuery = new ImFriendgroupsQuery();
        ImFriendgroupsQuery.Criteria criteria = imFriendgroupsQuery.createCriteria();
        criteria.andFgUseridEqualTo(userId);
        List<ImFriendgroups> imFriendgroupsList = imFriendgroupsDao.selectByQuery(imFriendgroupsQuery);
        return imFriendgroupsList;
    }
}
