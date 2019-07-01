package com.ztwj.requests.handle;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.handle.RechargePackageResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:39
 */
public class RechargePackageRequest extends BaseRequest<RechargePackageResponse> {
    /**
     * 当前只支持iccid卡号
     */
    private String cardId;
    /**
     * 套餐编码
     */
    private String packageCode;
    /**
     * 套餐类型：
     * 1 流量包
     * 2 月套餐
     * 3 定向流量包
     * 5 共享月套餐
     * 6 加油包
     * 7 季度包
     * 8 半年包
     * 9 年包
     */
    private String packageType;
    /**
     * 订单编号(唯一)
     */
    private String orderNo;
    /**
     * 充值类型：
     * 0 当月生效
     * 1 次月生效
     * 6 手动生效 （packageType为1的时候，此字段生效，不填写默认为0）
     */
    private String rechargeType;

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

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }
}
