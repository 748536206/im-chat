package com.instant.entity.vo;

import java.util.List;


public class FriendGroupViewModel extends BaseViewModel {
    private String groupname;
    private int online;
    private List<UserViewModel> list;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public List<UserViewModel> getList() {
        return list;
    }

    public void setList(List<UserViewModel> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "FriendGroupViewModel{" +
                "groupname='" + groupname + '\'' +
                ", online=" + online +
                ", list=" + list +
                '}';
    }
}
