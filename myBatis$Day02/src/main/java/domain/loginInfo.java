package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class loginInfo implements Serializable {
    private Integer lid;
    private String ip;
    private Date loginTime;
    private domain.user user;
    private List<domain.user> userList;



    public List<user> getUserList() {
        return userList;
    }

    public void setUserList(List<user> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "loginInfo{" +
                "lid=" + lid +
                ", ip='" + ip + '\'' +
                ", loginTime=" + loginTime +
                '}';
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public domain.user getUser() {
        return user;
    }

    public void setUser(domain.user user) {
        this.user = user;
    }
}
