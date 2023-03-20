package com.ztwj.requests.poolop;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.poolop.PoolopQueryCardDetailsResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:17
 */
public class PoolopQueryCardDetailsRequest extends BaseRequest<PoolopQueryCardDetailsResponse> {
    // ICCID或MSISDN
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "PoolopQueryCardDetailsRequest{" +
                "cardId='" + cardId + '\'' +
                '}';
    }
}
