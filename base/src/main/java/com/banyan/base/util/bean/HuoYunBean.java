package com.banyan.base.util.bean;

import java.util.Set;

public class HuoYunBean {
    /**
     * "userId":"2c914f1670eb79ee0170eb8b917e0005",
     * "personalQRCode":"http://39.105.171.217:9201/jkws/uploads/user/8ba13ca8-572c-4a28-8848-f49aaad7ab5c.png",
     * "wxuserQrCode":"/miniProgramCode/f39ebad0bc674ba994ac3201eb138d15.png",
     * "wlzzfyq":"0",
     * "gswlzzfyq":"0",
     * "jkzzfyq":null,
     * "zfbuserId":null,
     * "wxuserId":"2c914f1670eb79ee0170eb8ae8dd0000",
     * "nickName":"一米七三的小兄弟",
     * "gender":"1",
     * "language":"zh_CN",
     * "city":"石家庄",
     * "province":"河北",
     * "country":"中国",
     * "avatarUrl":"https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTL6412hewRZnzeTmzpsBQ3O84nzvH5fsZqxfP1PJt6BmslS88PkF4XcfR32WdLfpo48muZpQYakhQ/132",
     * "isPhone":true,
     * "employeeId":"2c914f1670eb79ee0170eb8b91470004",
     * "employeeRealname":"任佳琦",
     * "communityId":"2c914f1670eb79ee0170eb8b8e8d0003",
     * "communityName":"容树科技",
     * "companyId":"2c914f1670eb79ee0170eb8b82db0002",
     * "companyName":"容树科技",
     * "shareUserAppShareImg":"/share/user_app_share_img.jpg",
     * "userIdentityList":[
     * "VehicleOwner"
     * ],
     * "bankCardOpeningBank":"中国农业银行槐安路支行",
     * "bankCardNo":"6226622803781699"
     */
    private String userId;
    private String testEmployee;//用来判断是否是测试人员的。
    private String personalQRCode;
    private String wxuserQrCode;
    private String wlzzfyq;
    private String gswlzzfyq;
    private String jkzzfyq;
    private String zfbuserId;
    private String wxuserId;
    private String nickName;
    private String gender;
    private String language;
    private String city;
    private String province;
    private String country;
    private String avatarUrl;
    private String isPhone;
    private String employeeId;
    private String employeeRealname;
    private String communityId;
    private String communityName;
    private String companyId;
    private String companyName;
    private String shareUserAppShareImg;
    private Set<String> userIdentityList;
    private String bankCardOpeningBank;
    private String bankCardNo;
    private String loginName;
    private String password;
    private String userIdentitys;

    public String getTestEmployee() {
        return testEmployee;
    }

    public void setTestEmployee(String testEmployee) {
        this.testEmployee = testEmployee;
    }

    public String getUserIdentitys() {
        return userIdentitys;
    }

    public void setUserIdentitys(String userIdentitys) {
        this.userIdentitys = userIdentitys;
    }

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPersonalQRCode() {
        return personalQRCode;
    }

    public void setPersonalQRCode(String personalQRCode) {
        this.personalQRCode = personalQRCode;
    }

    public String getWxuserQrCode() {
        return wxuserQrCode;
    }

    public void setWxuserQrCode(String wxuserQrCode) {
        this.wxuserQrCode = wxuserQrCode;
    }

    public String getWlzzfyq() {
        return wlzzfyq;
    }

    public void setWlzzfyq(String wlzzfyq) {
        this.wlzzfyq = wlzzfyq;
    }

    public String getGswlzzfyq() {
        return gswlzzfyq;
    }

    public void setGswlzzfyq(String gswlzzfyq) {
        this.gswlzzfyq = gswlzzfyq;
    }

    public String getJkzzfyq() {
        return jkzzfyq;
    }

    public void setJkzzfyq(String jkzzfyq) {
        this.jkzzfyq = jkzzfyq;
    }

    public String getZfbuserId() {
        return zfbuserId;
    }

    public void setZfbuserId(String zfbuserId) {
        this.zfbuserId = zfbuserId;
    }

    public String getWxuserId() {
        return wxuserId;
    }

    public void setWxuserId(String wxuserId) {
        this.wxuserId = wxuserId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getIsPhone() {
        return isPhone;
    }

    public void setIsPhone(String isPhone) {
        this.isPhone = isPhone;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeRealname() {
        return employeeRealname;
    }

    public void setEmployeeRealname(String employeeRealname) {
        this.employeeRealname = employeeRealname;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getShareUserAppShareImg() {
        return shareUserAppShareImg;
    }

    public void setShareUserAppShareImg(String shareUserAppShareImg) {
        this.shareUserAppShareImg = shareUserAppShareImg;
    }

    public Set<String> getUserIdentityList() {
        return userIdentityList;
    }

    public void setUserIdentityList(Set<String> userIdentityList) {
        this.userIdentityList = userIdentityList;
    }

    public String getBankCardOpeningBank() {
        return bankCardOpeningBank;
    }

    public void setBankCardOpeningBank(String bankCardOpeningBank) {
        this.bankCardOpeningBank = bankCardOpeningBank;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }
}