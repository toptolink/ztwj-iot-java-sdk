package com.ztwj.requests.query;


import com.ztwj.responses.query.GetPackageListResponse;
import com.ztwj.requests.BaseRequest;

/**
 * 卡片已订购套餐查询
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class GetPackageListRequest extends BaseRequest<GetPackageListResponse> {
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
