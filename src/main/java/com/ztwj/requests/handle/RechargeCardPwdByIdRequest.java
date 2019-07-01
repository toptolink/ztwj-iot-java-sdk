package com.ztwj.requests.handle;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.handle.RechargeCardPwdByIdResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:42
 */
public class RechargeCardPwdByIdRequest extends BaseRequest<RechargeCardPwdByIdResponse> {
    /**
     * 当前只支持iccid卡号
     */
    private String cardId;
    /**
     * 套餐编码
     */
    private String packageCode;

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
}
