package com.banyan.base.util.bean;

import java.util.Set;

public class HuoYunWXBean {
    /**
     { "status": "success", "massage": "注册成功", "obj":
     { "id": "402881e65d1d7938015d1d7d4c320000",
     "userName": "15131649931",
     "sex": "MAN",
     "userType": "APPHT",
     "imgUrl": null,
     "nick": null,
     "rongYunToken": "QaQxSRdRqffVCxkFCFF1S55llHF1TVWdy3F/b6r1vdZjfj1qsdrOvUbULZG9P8s5zCFWvZVJIUslKL481imsq4dfHZRk0ZgL3QvjR7pAI9pAFLwE2nmrETjqH9Dh8faa" } }
     */
    private String id;
    private String userName;
    private String sex;
    private String userType;
    private String imgUrl;
    private String nick;
    private String rongYunToken;
    private String loginName;
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getRongYunToken() {
        return rongYunToken;
    }

    public void setRongYunToken(String rongYunToken) {
        this.rongYunToken = rongYunToken;
    }
}