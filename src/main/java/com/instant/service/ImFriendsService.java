package com.instant.service;

import com.instant.entity.ImFriends;

import java.util.List;

public interface ImFriendsService {
    /**
     * 查询好友信息
     */
    List<ImFriends> selectFriends(int fgId, int userId);
}
