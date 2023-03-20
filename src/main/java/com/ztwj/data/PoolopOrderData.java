package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 11:05
 */
public class PoolopOrderData {
    // 当前只支持iccid卡号
    private String cardId;

    // 套餐编码
    private String packageCode;

    // 订单编号（唯一）
    private String orderNo;

    // 交易流水号（唯一）
    private String tradeId;

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

    @Override
    public String toString() {
        return "PoolopOrderData{" +
                "cardId='" + cardId + '\'' +
                ", packageCode='" + packageCode + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", tradeId='" + tradeId + '\'' +
                '}';
    }
}
