package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:28
 */
public class PoolopQueryCardDetailsData {
    // ICCID
    private String iccid;
    // 业务号
    private String msisdn;
    // 运营商
    private String  operator;
    // 卡片本月已用的流量用量（单位：M）
    private String usedata;
    // 卡片当前套餐总的已用量（单位：M）
    private String pkgUsedata;
    // 当前卡片剩余的用量（单位：M）
    private String remainingData;
    // 当前生效套餐的总用量
    private String pkgDataControl;
    // 流量到期时间（格式：yyyy-MM-dd hh:mm:ss）
    private String flowPkgExpiredTime;
    // 主套餐到期时间（格式：yyyy-MM-dd hh:mm:ss）
    private String mainPkgExpiredTime;
    // 卡状态：1 可激活2 已激活3 已停用4 已失效
    private String simStatus;
    // 卡激活时间（格式：yyyy-MM-dd hh:mm:ss）
    private String activityTime;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getUsedata() {
        return usedata;
    }

    public void setUsedata(String usedata) {
        this.usedata = usedata;
    }

    public String getPkgUsedata() {
        return pkgUsedata;
    }

    public void setPkgUsedata(String pkgUsedata) {
        this.pkgUsedata = pkgUsedata;
    }

    public String getRemainingData() {
        return remainingData;
    }

    public void setRemainingData(String remainingData) {
        this.remainingData = remainingData;
    }

    public String getPkgDataControl() {
        return pkgDataControl;
    }

    public void setPkgDataControl(String pkgDataControl) {
        this.pkgDataControl = pkgDataControl;
    }

    public String getFlowPkgExpiredTime() {
        return flowPkgExpiredTime;
    }

    public void setFlowPkgExpiredTime(String flowPkgExpiredTime) {
        this.flowPkgExpiredTime = flowPkgExpiredTime;
    }

    public String getMainPkgExpiredTime() {
        return mainPkgExpiredTime;
    }

    public void setMainPkgExpiredTime(String mainPkgExpiredTime) {
        this.mainPkgExpiredTime = mainPkgExpiredTime;
    }

    public String getSimStatus() {
        return simStatus;
    }

    public void setSimStatus(String simStatus) {
        this.simStatus = simStatus;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    @Override
    public String toString() {
        return "PoolopQueryCardDetailsData{" +
                "iccid='" + iccid + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", operator='" + operator + '\'' +
                ", usedata='" + usedata + '\'' +
                ", pkgUsedata='" + pkgUsedata + '\'' +
                ", remainingData='" + remainingData + '\'' +
                ", pkgDataControl='" + pkgDataControl + '\'' +
                ", flowPkgExpiredTime='" + flowPkgExpiredTime + '\'' +
                ", mainPkgExpiredTime='" + mainPkgExpiredTime + '\'' +
                ", simStatus='" + simStatus + '\'' +
                ", activityTime='" + activityTime + '\'' +
                '}';
    }
}
