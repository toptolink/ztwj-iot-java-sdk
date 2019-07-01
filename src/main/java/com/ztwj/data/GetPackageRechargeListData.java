package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:58
 */
public class GetPackageRechargeListData {
    /**
     * ICCID卡号
     */
    private String cardId;
    /**
     * 订单编号(唯一)
     */
    private String orderNo;
    /**
     * 交易流水号
     */
    private String tradeId;
    /**
     * 充值时间
     */
    private String rechargeTime;
    /**
     * 充值类型 0：当月生效 1：次月生效
     */
    private String rechargeType;
    /**
     * 套餐名称
     */
    private String packageName;
    /**
     * 套餐编码
     */
    private String packageCode;
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
     * 订单状态
     */
    private String status;
    /**
     * 套餐标识：1 流量套餐 2 组合套餐
     */
    private String packageFlag;
    /**
     * 套餐类型：1流量包，2主套餐（当packageFlag==1时 有此数值）
     */
    private String packageType;
    /**
     * 套餐语音用量（当packageFlag==2时 有此数值）
     */
    private String voicePlan;
    /**
     * 组合套餐类型：1 叠加组合包 2 每月固定组合包（当packageFlag==2时 有此数值）
     */
    private String voicePackageType;

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

    public String getVoicePackageType() {
        return voicePackageType;
    }

    public void setVoicePackageType(String voicePackageType) {
        this.voicePackageType = voicePackageType;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(String rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
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

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
