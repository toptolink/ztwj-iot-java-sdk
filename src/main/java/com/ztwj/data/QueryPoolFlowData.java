package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:23
 */
public class QueryPoolFlowData {
    /**
     * 流量池编号
     */
    private String poolNumber;
    /**
     * 子池编号
     */
    private String groupCode;
    /**
     * 卡池总流量
     */
    private String dataControl;
    /**
     * 已使用总流量（单位：M）
     */
    private String usedData;
    /**
     * 流量池激活时间（格式：yyyy-MM-dd）
     */
    private String activeTime;
    /**
     * 流量到期时间（格式：yyyy-MM-dd）
     */
    private String expiredTime;
    /**
     * 池状态 ：可启用已启用已停用
     */
    private String poolStatus;
    /**
     * 已激活数量
     */
    private String activeCount;
    /**
     * 已停卡数量
     */
    private String stopCount;
    /**
     * 卡片数量
     */
    private String cardCount;

    public String getPoolNumber() {
        return poolNumber;
    }

    public void setPoolNumber(String poolNumber) {
        this.poolNumber = poolNumber;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getDataControl() {
        return dataControl;
    }

    public void setDataControl(String dataControl) {
        this.dataControl = dataControl;
    }

    public String getUsedData() {
        return usedData;
    }

    public void setUsedData(String usedData) {
        this.usedData = usedData;
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

    public String getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    public String getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(String activeCount) {
        this.activeCount = activeCount;
    }

    public String getStopCount() {
        return stopCount;
    }

    public void setStopCount(String stopCount) {
        this.stopCount = stopCount;
    }

    public String getCardCount() {
        return cardCount;
    }

    public void setCardCount(String cardCount) {
        this.cardCount = cardCount;
    }
}
