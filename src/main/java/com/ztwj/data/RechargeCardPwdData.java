package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 12:07
 */
public class RechargeCardPwdData {
    /**
     * 当前只支持iccid卡号
     */
    private String cardId;
    /**
     * 充值卡号
     */
    private String cardNum;
    /**
     * 套餐名称
     */
    private String packageName;
    /**
     * 套餐周期（单位：月）
     */
    private String cycle;
    /**
     * 套餐用量（单位：M）
     */
    private String dataPlan;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getDataPlan() {
        return dataPlan;
    }

    public void setDataPlan(String dataPlan) {
        this.dataPlan = dataPlan;
    }
}
