package com.williamnews.model;

public class LoginEntity {
    private String UserName;
    private String Password;

    public LoginEntity() {
    }

    public LoginEntity(String userName, String password) {
        UserName = userName;
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
