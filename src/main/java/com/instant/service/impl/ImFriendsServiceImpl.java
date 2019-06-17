package com.instant.service.impl;

import com.instant.dao.ImFriendsDao;
import com.instant.entity.ImFriends;
import com.instant.entity.ImFriendsQuery;
import com.instant.service.ImFriendsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImFriendsServiceImpl implements ImFriendsService {
    private static Logger logger = LoggerFactory.getLogger(ImFriendsServiceImpl.class);
    @Autowired
    private ImFriendsDao imFriendsDao;

    /**
     * 查询好友信息
     * @return
     */
    @Override
    public List<ImFriends> selectFriends(int fgId, int userId) {
        ImFriendsQuery imFriendsQuery = new ImFriendsQuery();
        ImFriendsQuery.Criteria criteria = imFriendsQuery.createCriteria();
        criteria.andFIdEqualTo(fgId);
        criteria.andFUseridEqualTo(userId);
        List<ImFriends> imFriendsList = imFriendsDao.selectByQuery(imFriendsQuery);
        return imFriendsList;
    }
}
