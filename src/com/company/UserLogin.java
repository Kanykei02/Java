package com.company;

import java.util.Date;

public class UserLogin {
    private int userLOginId;
    private User userId;
    private Date loginTime;
    private String loginResult;

    public UserLogin(){}

    public UserLogin(int userLOginId, User userId, Date loginTime, String loginResult) {
        this.userLOginId = userLOginId;
        this.userId = userId;
        this.loginTime = loginTime;
        this.loginResult = loginResult;
    }

    public int getUserLOginId() {
        return userLOginId;
    }

    public void setUserLOginId(int userLOginId) {
        this.userLOginId = userLOginId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(String loginResult) {
        this.loginResult = loginResult;
    }
}
