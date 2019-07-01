package com.ztwj.domain;

import java.io.Serializable;

/**
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class OrderedPkgDO implements Serializable {
    /**
     * 套餐类型 1.流量套餐 2. 组合套餐
     */
    private String packageFlag;
    /**
     * ICCID卡号
     */
    private String cardId;
    /**
     * 套餐编码
     */
    private String packageCode;
    /**
     * 套餐名称
     */
    private String packageName;
    /**
     * 套餐订购时间
     */
    private String packageTime;
    /**
     * 套餐金额,单位元
     */
    private String price;
    /**
     * 套餐用量
     */
    private String dataPlan;
    /**
     * 套餐周期
     */
    private String cycle;
    /**
     * 运营商
     */
    private String operator;
    /**
     * 套餐类型：1叠加包，2主套餐
     */
    private String type;
    /**
     * 套餐已用量
     */
    private String useData;
    /**
     * 语音总用量
     */
    private String voicePlan;
    /**
     * 语音已用量
     */
    private String useVoice;
    /**
     * 组合套餐类型:1 叠加组合包 2 每月固定组合包
     */
    private String voicePackageType;
    /**
     * 生效日期
     */
    private String activeTime;
    /**
     * 到期日期
     */
    private String expiredTime;
    /**
     * 价格组名
     */
    private String priceName;
    /**
     * msisdn
     */
    private String msisdn;
    /**
     * imsi
     */
    private String imsi;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getPriceName() {
        return priceName;
    }

    public void setPriceName(String priceName) {
        this.priceName = priceName;
    }

    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getPackageFlag() {
        return packageFlag;
    }

    public void setPackageFlag(String packageFlag) {
        this.packageFlag = packageFlag;
    }

    public String getVoicePlan() {
        return voicePlan;
    }

    public void setVoicePlan(String voicePlan) {
        this.voicePlan = voicePlan;
    }

    public String getUseVoice() {
        return useVoice;
    }

    public void setUseVoice(String useVoice) {
        this.useVoice = useVoice;
    }

    public String getVoicePackageType() {
        return voicePackageType;
    }

    public void setVoicePackageType(String voicePackageType) {
        this.voicePackageType = voicePackageType;
    }

    public String getUseData() {
        return useData;
    }

    public void setUseData(String useData) {
        this.useData = useData;
    }

    public String getPackageTime() {
        return packageTime;
    }

    public void setPackageTime(String packageTime) {
        this.packageTime = packageTime;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDataPlan() {
        return dataPlan;
    }

    public void setDataPlan(String dataPlan) {
        this.dataPlan = dataPlan;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "OrderedPkgDO{" +
                "packageFlag='" + packageFlag + '\'' +
                ", cardId='" + cardId + '\'' +
                ", packageCode='" + packageCode + '\'' +
                ", packageName='" + packageName + '\'' +
                ", packageTime='" + packageTime + '\'' +
                ", price='" + price + '\'' +
                ", dataPlan='" + dataPlan + '\'' +
                ", cycle='" + cycle + '\'' +
                ", operator='" + operator + '\'' +
                ", type='" + type + '\'' +
                ", useData='" + useData + '\'' +
                ", voicePlan='" + voicePlan + '\'' +
                ", useVoice='" + useVoice + '\'' +
                ", voicePackageType='" + voicePackageType + '\'' +
                ", activeTime='" + activeTime + '\'' +
                ", expiredTime='" + expiredTime + '\'' +
                ", priceName='" + priceName + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", imsi='" + imsi + '\'' +
                '}';
    }
}
