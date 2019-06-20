package com.instant.service.impl;


import com.instant.entity.*;
import com.instant.entity.vo.BigGroupViewModel;
import com.instant.entity.vo.FriendGroupViewModel;
import com.instant.entity.vo.LayimInitDataViewModel;
import com.instant.entity.vo.UserViewModel;
import com.instant.service.*;
import com.instant.util.UserInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InitializationsServiceImpl implements InitializationsService {

    @Autowired
    private UserService userService;
    @Autowired
    private ImFriendgroupsService imFriendgroupsService;
    @Autowired
    private ImFriendsService imFriendsService;
    @Autowired
    private ImUserGroupsService imUserGroupsService;

    /**
     * 初始化用户信息
     *
     * @return
     */
    @Override
    public Response initialization() {
        //总返回 信息
        LayimInitDataViewModel layimInitDataViewModel = new LayimInitDataViewModel();
        List<FriendGroupViewModel> friendGroupViewModelList = new ArrayList<>();
        List<BigGroupViewModel> bigGroupViewModelList=new ArrayList<>();
        //获取当前登录用户人信息
        int userId = 0;
        if (null != UserInfoUtil.getUser() && UserInfoUtil.getUser().getUid() != 0) {
            userId = UserInfoUtil.getUser().getUid();
            //获取用户信息
            UserInfo userInfo = userService.selectUserInfo(userId);
            //按格组装用户信息
            UserViewModel userViewModel = new UserViewModel();
            userViewModel.setUsername(userInfo.getUsername());
            userViewModel.setAvatar(userInfo.getAvatar());
            userViewModel.setSign(userInfo.getSign());
            userViewModel.setStatus(userInfo.getState());
            //填装用户信息
            layimInitDataViewModel.setMine(userViewModel);
            //查询所有分组
            List<ImFriendgroups> imFriendgroupsList = imFriendgroupsService.selectfriendGroupstouser(userId);
            //判断是否有分组
            if (null != imFriendgroupsList && imFriendgroupsList.size() > 0)
                //循环所有分组
                for (ImFriendgroups imFriendgroups : imFriendgroupsList) {
                    //按照格式组装分组分组信息
                    FriendGroupViewModel friendGroupViewModel = new FriendGroupViewModel();
                    //分组名称
                    friendGroupViewModel.setGroupname(imFriendgroups.getFgName());
                    //分组id
                    friendGroupViewModel.setId(imFriendgroups.getFgId());
                    //通过分组id和userid获取分组内的好友集合
                    List<ImFriends> imFriendsList = imFriendsService.selectFriends(imFriendgroups.getFgId(), userId);
                    //分组内人数
                    friendGroupViewModel.setOnline(imFriendsList.size());
                    //循环好友信息做信息拼装
                    List<UserViewModel> userViewModelList = new ArrayList<>();
                    for (ImFriends imFriends : imFriendsList) {
                        UserViewModel userViewMode2 = new UserViewModel();
                        UserInfo imFriendsInfo = userService.selectUserInfo(imFriends.getfFirendid());
                        userViewMode2.setUsername(imFriendsInfo.getUsername());
                        userViewMode2.setAvatar(imFriendsInfo.getAvatar());
                        userViewMode2.setSign(imFriendsInfo.getStatus());
                        userViewMode2.setStatus(imFriendsInfo.getState());
                        userViewModelList.add(userViewMode2);
                    }
                    //放入用户信息
                    friendGroupViewModel.setList(userViewModelList);
                    friendGroupViewModelList.add(friendGroupViewModel);
                }
            layimInitDataViewModel.setFriend(friendGroupViewModelList);
            //查询群组信息
            List<ImUserGroups> imUserGroupsList = imUserGroupsService.selectGroupstouser(userId);
            if (null!=imUserGroupsList&&imUserGroupsList.size()>0)
            for (ImUserGroups imUserGroups:imUserGroupsList){
                BigGroupViewModel bigGroupViewModel=new BigGroupViewModel();
                bigGroupViewModel.setGroupname(imUserGroups.getUgName());
                bigGroupViewModel.setAvatar(imUserGroups.getUgIcon());
                bigGroupViewModel.setId(imUserGroups.getUgId());
                bigGroupViewModelList.add(bigGroupViewModel);
            }
            layimInitDataViewModel.setGroup(bigGroupViewModelList);
            return new Response().success(layimInitDataViewModel);
        }
        return new Response().failure("用户信息获取失败,初始化信息出现错误");
    }
}
