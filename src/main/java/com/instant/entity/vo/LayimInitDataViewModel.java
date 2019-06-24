package com.instant.entity.vo;

import java.util.List;


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

    @Override
    public String toString() {
        return "LayimInitDataViewModel{" +
                "mine=" + mine +
                ", friend=" + friend +
                ", group=" + group +
                '}';
    }
}
