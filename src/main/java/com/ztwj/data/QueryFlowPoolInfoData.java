package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:23
 */
public class QueryFlowPoolInfoData {
    /**
     * 共享池编号
     */
    private String poolNumber;
    /**
     * 池本月总量（单位：M）
     */
    private String remainingData;
    /**
     * 池本月已用量（单位：M）
     */
    private String usedData;
    /**
     * 卡片总数（单位：张）
     */
    private String cardCount;
    /**
     * 可激活卡片数（单位：张）
     */
    private String deactivateCount;
    /**
     * 已激活卡片数（单位：张）
     */
    private String activatedCount;
    /**
     * 已停用卡片数（单位：张）
     */
    private String stopCount;

    public String getPoolNumber() {
        return poolNumber;
    }

    public void setPoolNumber(String poolNumber) {
        this.poolNumber = poolNumber;
    }

    public String getRemainingData() {
        return remainingData;
    }

    public void setRemainingData(String remainingData) {
        this.remainingData = remainingData;
    }

    public String getUsedData() {
        return usedData;
    }

    public void setUsedData(String usedData) {
        this.usedData = usedData;
    }

    public String getCardCount() {
        return cardCount;
    }

    public void setCardCount(String cardCount) {
        this.cardCount = cardCount;
    }

    public String getDeactivateCount() {
        return deactivateCount;
    }

    public void setDeactivateCount(String deactivateCount) {
        this.deactivateCount = deactivateCount;
    }

    public String getActivatedCount() {
        return activatedCount;
    }

    public void setActivatedCount(String activatedCount) {
        this.activatedCount = activatedCount;
    }

    public String getStopCount() {
        return stopCount;
    }

    public void setStopCount(String stopCount) {
        this.stopCount = stopCount;
    }
}
