package com.instant.service.impl;

import com.instant.dao.ImUserGroupsDao;
import com.instant.dao.ImUserGroupstouserDao;
import com.instant.entity.*;
import com.instant.entity.vo.LayimGroupMembersViewModel;
import com.instant.entity.vo.UserViewModel;
import com.instant.service.ImUserGroupsService;
import com.instant.service.UserService;
import com.instant.util.UserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImUserGroupsServiceImpl implements ImUserGroupsService {
    private static Logger logger = LoggerFactory.getLogger(ImUserGroupsServiceImpl.class);
    @Autowired
    private ImUserGroupsDao imUserGroupsDao;
    @Autowired
    private ImUserGroupstouserDao imUserGroupstouserDao;
    @Autowired
    private UserService userService;

    /**
     * 查询群信息
     *
     * @return
     */
    @Override
    public ImUserGroups selectGroupstouser(int UgId) {
        ImUserGroupsQuery imUserGroupsQuery = new ImUserGroupsQuery();
        ImUserGroupsQuery.Criteria criteria = imUserGroupsQuery.createCriteria();
        criteria.andUgIdEqualTo(UgId);
        ImUserGroups imUserGroups = imUserGroupsDao.selectByPrimaryKey(UgId);
        return imUserGroups;
    }


    @Override
    public Response selectGroupSmember(int id) {
        //群成员返回组装
        LayimGroupMembersViewModel layimGroupMembersViewModel = new LayimGroupMembersViewModel();
        //群成员
        List<UserViewModel> userViewModelList = new ArrayList<>();
        ImUserGroupstouserQuery imUserGroupstouserQuery = new ImUserGroupstouserQuery();
        ImUserGroupstouserQuery.Criteria criteria = imUserGroupstouserQuery.createCriteria();
        criteria.andUgGroupidEqualTo(id);
        //查询询群成员
        List<ImUserGroupstouser> imUserGroupstouserList = imUserGroupstouserDao.selectByQuery(imUserGroupstouserQuery);
        //把所有的群成员信息组装成完整的数据
        for (ImUserGroupstouser imUserGroupstouser : imUserGroupstouserList) {
            //查询每个群成员的个人信息
            UserInfo userInfo = userService.selectUserInfo(imUserGroupstouser.getUgUserid());
            UserViewModel userViewModel = new UserViewModel();
            userViewModel.setId(userInfo.getUid());
            userViewModel.setUsername(userInfo.getUsername());
            userViewModel.setAvatar(userInfo.getAvatar());
            userViewModel.setSign(userInfo.getSign());
            userViewModel.setStatus(userInfo.getState());
            userViewModelList.add(userViewModel);
            //当前人的个人信息
            if (UserUtil.getUser().getUid() == userInfo.getUid()) {
                layimGroupMembersViewModel.setOwner(userViewModel);
            }
        }
        layimGroupMembersViewModel.setList(userViewModelList);
        //查询群成员信息
        return new Response().success(layimGroupMembersViewModel);
    }


    /**
     *查询自己所拥有的群
     * @param id
     * @return
     */
    public List<ImUserGroupstouser> selectHaveUserGroups(int id){
    ImUserGroupstouserQuery imUserGroupstouserQuery = new ImUserGroupstouserQuery();
    ImUserGroupstouserQuery.Criteria criteria = imUserGroupstouserQuery.createCriteria();
    criteria.andUgUseridEqualTo(id);
    List<ImUserGroupstouser> imUserGroupstouserList = imUserGroupstouserDao.selectByQuery(imUserGroupstouserQuery);
    return imUserGroupstouserList;
    }

}
