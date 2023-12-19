package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:57
 */
public class GetUserInfoByUserData {
    //登录名
    private String username;
    //公司名称
    private String companyName;
    //手机号
    private String mobile;
    //邮箱
    private String email;
    //余额
    private String free;
    //授信金额
    private String creditMoney;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getCreditMoney() {
        return creditMoney;
    }

    public void setCreditMoney(String creditMoney) {
        this.creditMoney = creditMoney;
    }
}
