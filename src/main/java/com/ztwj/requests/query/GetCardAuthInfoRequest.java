package com.ztwj.requests.query;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.query.GetCardAuthInfoResponse;

/**
 * Description: 根据ICCID卡号对卡进行实名认证状态查询
 *
 * @author : fire
 * @date : 2019/5/22 15:35
 */
public class GetCardAuthInfoRequest extends BaseRequest<GetCardAuthInfoResponse> {
    /**
     * ICCID卡号
     */
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
