package com.ztwj.requests.handle;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.handle.RechargeCardPwdResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:41
 */
public class RechargeCardPwdRequest extends BaseRequest<RechargeCardPwdResponse> {
    /**
     * 当前只支持iccid卡号
     */
    private String cardId;
    /**
     * 充值卡号
     */
    private String cardNum;
    /**
     * 充值密码
     */
    private String cardPwd;

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

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }
}
