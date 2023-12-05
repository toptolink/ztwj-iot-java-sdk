package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:55
 */
public class GetCardDetailsData {
    /**
     * ICCID
     */
    private String cardId;

    /**
     * 业务号码
     */
    private String msisdn;

    /**
     * IMSI
     */
    private String imsi;

    /**
     * 运营商（1=中国移动，2=中国联通，3=中国电信）
     */
    private String operator;

    /**
     * 本月已用流量（单位：M）
     */
    private String dataUsage;

    /**
     * 本月剩余流量（单位：M）
     */
    private String remainingData;

    private String surplusData;


    /**
     * 是否无限流量：0.否1. 是
     */
    private String useDataType;

    /**
     * 历史已使用总流量（单位：M）（注：不包含本月）
     */
    private String totalDataUsage;

    /**
     * 流量到期时间（格式：yyyy-MM-dd）
     */
    private String expiredTime;

    /**
     * 卡状态 ：1 可激活2 已激活3 已停用
     */
    private String simStatus;

    /**
     * 卡激活时间（格式：yyyy-MM-dd）
     */
    private String activatedTime;

    /**
     * 本月总流量（单位：M）（本月总流量为0，并且卡类型为共享卡，表示不限量）
     */
    private String dataControl;

    /**
     * 卡类型：1.流量卡2. 语音卡
     */
    private String cardFlag;

    /**
     * 卡共享类型：1.独享卡2. 共享卡
     */
    private String shareFlag;

    /**
     * 本月语音已用量（单位：分钟）（当cardFlag=2时，此参数有值）
     */
    private String usedVoice;

    /**
     * 本月语音剩余用量（单位：分钟）（当cardFlag=2时，此参数有值）
     */
    private String remainingVoice;

    /**
     * 本月语音总可用量（单位：分钟）（当cardFlag=2时，此参数有值）
     */
    private String voiceControl;

    /**
     * 历史已使用语音总量（单位：分钟）（当cardFlag=2时，此参数有值；不包含本月）
     */
    private String totalVoiceUsage;

    /**
     * 卡片价格组
     */
    private String priceName;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDataUsage() {
        return dataUsage;
    }

    public void setDataUsage(String dataUsage) {
        this.dataUsage = dataUsage;
    }

    public String getRemainingData() {
        return remainingData;
    }

    public void setRemainingData(String remainingData) {
        this.remainingData = remainingData;
    }

    public String getTotalDataUsage() {
        return totalDataUsage;
    }

    public void setTotalDataUsage(String totalDataUsage) {
        this.totalDataUsage = totalDataUsage;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getSimStatus() {
        return simStatus;
    }

    public void setSimStatus(String simStatus) {
        this.simStatus = simStatus;
    }

    public String getActivatedTime() {
        return activatedTime;
    }

    public void setActivatedTime(String activatedTime) {
        this.activatedTime = activatedTime;
    }

    public String getDataControl() {
        return dataControl;
    }

    public void setDataControl(String dataControl) {
        this.dataControl = dataControl;
    }

    public String getCardFlag() {
        return cardFlag;
    }

    public void setCardFlag(String cardFlag) {
        this.cardFlag = cardFlag;
    }

    public String getShareFlag() {
        return shareFlag;
    }

    public void setShareFlag(String shareFlag) {
        this.shareFlag = shareFlag;
    }

    public String getUsedVoice() {
        return usedVoice;
    }

    public void setUsedVoice(String usedVoice) {
        this.usedVoice = usedVoice;
    }

    public String getRemainingVoice() {
        return remainingVoice;
    }

    public void setRemainingVoice(String remainingVoice) {
        this.remainingVoice = remainingVoice;
    }

    public String getVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(String voiceControl) {
        this.voiceControl = voiceControl;
    }

    public String getTotalVoiceUsage() {
        return totalVoiceUsage;
    }

    public void setTotalVoiceUsage(String totalVoiceUsage) {
        this.totalVoiceUsage = totalVoiceUsage;
    }

    public String getPriceName() {
        return priceName;
    }

    public void setPriceName(String priceName) {
        this.priceName = priceName;
    }

    public String getSurplusData() {
        return surplusData;
    }

    public void setSurplusData(String surplusData) {
        this.surplusData = surplusData;
    }

    public String getUseDataType() {
        return useDataType;
    }

    public void setUseDataType(String useDataType) {
        this.useDataType = useDataType;
    }
}
