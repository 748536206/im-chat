package com.instant.entity.vo;

import java.util.List;

/**
 * @author fyp
 * @crate 2017/11/8 23:26
 * @project SpringBootLayIM
 */
public class LayimGroupMembersViewModel {
    private UserViewModel owner;
    private List<UserViewModel> list;

    public UserViewModel getOwner() {
        return owner;
    }

    public void setOwner(UserViewModel owner) {
        this.owner = owner;
    }

    public List<UserViewModel> getList() {
        return list;
    }

    public void setList(List<UserViewModel> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "LayimGroupMembersViewModel{" +
                "owner=" + owner +
                ", list=" + list +
                '}';
    }
}
