package com.instant.service.impl;

import com.instant.dao.ImUserGroupsDao;
import com.instant.dao.ImUserGroupstouserDao;
import com.instant.entity.*;
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
    @Autowired
    private ImUserGroupstouserDao imUserGroupstouserDao;

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



    @Override
    public Response selectGroupSmember(int id) {
        ImUserGroupstouserQuery imUserGroupstouserQuery=new ImUserGroupstouserQuery();
        ImUserGroupstouserQuery.Criteria criteria=imUserGroupstouserQuery.createCriteria();
        criteria.andUgGroupidEqualTo(id);
        //查询出群成员
        List<ImUserGroupstouser> imUserGroupstouserList= imUserGroupstouserDao.selectByQuery(imUserGroupstouserQuery);
        for (ImUserGroupstouser imUserGroupstouser:imUserGroupstouserList){

        }
        //查询群成员信息


        return null;
    }


}
