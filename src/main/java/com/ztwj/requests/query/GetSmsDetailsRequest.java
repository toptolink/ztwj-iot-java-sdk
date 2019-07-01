package com.ztwj.requests.query;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.query.GetSmsDetailsResponse;

/**
 * Description: java-sdk
 *
 * @author : fire
 * @date : 2019/4/18 17:04
 */
public class GetSmsDetailsRequest extends BaseRequest<GetSmsDetailsResponse> {
    /**
     * 目前支持iccid卡号、msisdn业务号
     */
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
