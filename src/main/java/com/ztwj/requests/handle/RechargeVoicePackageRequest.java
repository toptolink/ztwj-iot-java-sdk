package com.ztwj.requests.handle;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.handle.RechargeVoicePackageResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:40
 */
public class RechargeVoicePackageRequest extends BaseRequest<RechargeVoicePackageResponse> {
    /**
     * 当前只支持iccid卡号
     */
    private String cardId;
    /**
     * 语音套餐编码
     */
    private String packageCode;
    /**
     * 语音套餐类型：2 月套餐,6加油包
     */
    private String packageType;
    /**
     * 订单编号(唯一)
     */
    private String orderNo;
    /**
     * 充值类型：0 当月生效
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
