package com.instant.service.impl;

import com.instant.layim.domain.result.JsonResult;
import com.instant.layim.domain.viewmodels.BigGroupViewModel;
import com.instant.layim.domain.viewmodels.FriendGroupViewModel;
import com.instant.layim.domain.viewmodels.LayimInitDataViewModel;
import com.instant.layim.domain.viewmodels.UserViewModel;
import com.instant.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
    public JsonResult getBaseList(){
        LayimInitDataViewModel resultViewModel = new LayimInitDataViewModel();

        //自己的信息
        UserViewModel mine = new UserViewModel();
        mine.setUsername("小盘子");
        mine.setSign("SpringBoot学习中");
        mine.setAvatar("https://vignette.wikia.nocookie.net/dragonball/images/d/da/Kid-Goku-psd61058.png/revision/latest?cb=20120213205410");
        long id=123456;
        mine.setId(id);

        resultViewModel.setMine(mine);
        //好友列表信息
        ArrayList<FriendGroupViewModel> friends = new ArrayList<FriendGroupViewModel>();

        FriendGroupViewModel frined1 = new FriendGroupViewModel();
        frined1.setId(1L);
        frined1.setGroupname("我的好友");
        frined1.setOnline(10);

        ArrayList<UserViewModel> users1 = new ArrayList<UserViewModel>();

        UserViewModel user1 = new UserViewModel();
        user1.setId(100001L);
        user1.setAvatar("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjvcDBSg8-TYMzRSbw75MJAawM5dF9StHSisVhdhWmL6vK8K66UQ");
        user1.setSign("教练，我想打篮球");
        user1.setUsername("三井寿");

        users1.add(user1);

        frined1.setList(users1);
        friends.add(frined1);

        resultViewModel.setFriend(friends);
        //分组信息
        ArrayList<BigGroupViewModel> groups  = new ArrayList<BigGroupViewModel>();

        BigGroupViewModel bigGroup1 = new BigGroupViewModel();
        bigGroup1.setId(1000001L);
        bigGroup1.setGroupname("SpringBoot爱好者群");
        bigGroup1.setAvatar("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTp9Q8BuXHj30KbOHPY7qlnR10oI4cCpplRcBFThQFzZ4bx3mBz");
        groups.add(bigGroup1);

        resultViewModel.setGroup(groups);
        return JsonResult.success(resultViewModel);
    }

}
