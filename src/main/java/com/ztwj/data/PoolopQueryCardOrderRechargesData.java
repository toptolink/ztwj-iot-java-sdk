package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 11:11
 */
public class PoolopQueryCardOrderRechargesData {
    // 订单状态
    private String status;

    // 卡号
    private String iccid;

    //订单编号
    private String orderNo;

    //充值时间
    private String orderTime;

    // 套餐编码
    private String packageCode;

    // 系统套餐名称
    private String packageName;

    //套餐金额（单位：元）
    private Double money;

    // 订购套餐类型：主套餐/叠加流量包
    private String packageType;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    @Override
    public String toString() {
        return "PoolopQueryCardOrderRechargesData{" +
                "status='" + status + '\'' +
                ", iccid='" + iccid + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", packageCode=" + packageCode +
                ", packageName='" + packageName + '\'' +
                ", money=" + money +
                ", packageType='" + packageType + '\'' +
                '}';
    }
}
