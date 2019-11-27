package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class user implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String phoneNumber;
    private Date birthday;
    private List<domain.loginInfo> loginInfoList;
    private List<domain.role> roleList;

    public List<domain.role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<domain.role> roleList) {
        this.roleList = roleList;
    }

    public List<loginInfo> getLoginInfoList() {
        return loginInfoList;
    }

    public void setLoginInfoList(List<loginInfo> loginInfoList) {
        this.loginInfoList = loginInfoList;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
