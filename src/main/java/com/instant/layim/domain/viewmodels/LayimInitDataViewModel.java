package com.instant.layim.domain.viewmodels;

import java.util.List;

/**
 * @author fyp
 * @crate 2017/11/2 21:49
 * @project SpringBootLayIM
 */
public class LayimInitDataViewModel {

    private UserViewModel mine;

    private List<FriendGroupViewModel> friend;

    private List<BigGroupViewModel> group;

    public UserViewModel getMine() {
        return mine;
    }

    public void setMine(UserViewModel mine) {
        this.mine = mine;
    }

    public List<FriendGroupViewModel> getFriend() {
        return friend;
    }

    public void setFriend(List<FriendGroupViewModel> friend) {
        this.friend = friend;
    }

    public List<BigGroupViewModel> getGroup() {
        return group;
    }

    public void setGroup(List<BigGroupViewModel> group) {
        this.group = group;
    }
}
