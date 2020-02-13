package com.example.CartAPI.Users;
//This class is used just to conversion JSON to Pojo obj and vise-versa.

public class User {
    private String emailId;
    private String password;

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
