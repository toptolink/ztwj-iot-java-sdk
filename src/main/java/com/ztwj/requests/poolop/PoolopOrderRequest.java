package com.ztwj.requests.poolop;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.poolop.PoolopOrderResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:21
 */
public class PoolopOrderRequest extends BaseRequest<PoolopOrderResponse> {
    // 卡号：ICCID
    private String iccid;

    // 套餐编码
    private String packageCode;

    // 套餐类型：1叠加流量包 2主套餐
    private String packageType;

    // 订单编号：唯一性
    private String orderNo;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "PoolopOrderRequest{" +
                "iccid='" + iccid + '\'' +
                ", packageCode='" + packageCode + '\'' +
                ", packageType='" + packageType + '\'' +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}
