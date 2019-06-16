package com.instant.entity.vo;

/**
 * @author fyp
 * @crate 2017/11/2 21:54
 * @project SpringBootLayIM
 */
public class BigGroupViewModel extends BaseViewModel {
    private String groupname;
    private String avatar;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "BigGroupViewModel{" +
                "groupname='" + groupname + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
