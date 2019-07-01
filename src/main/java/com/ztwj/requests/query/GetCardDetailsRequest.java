package com.ztwj.requests.query;

import com.ztwj.responses.query.GetCardDetailsResponse;
import com.ztwj.requests.BaseRequest;

/**
 * 卡片本月用量查询
 *
 * @author LIUSF
 * @date 2019-03-28 18:56:06
 */
public class GetCardDetailsRequest extends BaseRequest<GetCardDetailsResponse> {
    /**
     * ICCID或MSISDN或IMSI
     */
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
