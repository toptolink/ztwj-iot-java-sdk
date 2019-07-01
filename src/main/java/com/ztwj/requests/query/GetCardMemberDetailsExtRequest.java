package com.ztwj.requests.query;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.query.GetCardMemberDetailsExtResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 15:34
 */
public class GetCardMemberDetailsExtRequest extends BaseRequest<GetCardMemberDetailsExtResponse> {
    /**
     * 目前只支持iccid卡号，最多不超过50个，各个卡号之间用","相隔，例如：
     * "12345678901234567890,12345678901234567891,12345678901234567892"
     */
    private String cardIds;

    /**
     * 运营商：1：移动2：联通3：电信
     */
    private String operator;

    /**
     * 卡号位数类型：0：卡号为19位1：卡号为20位（默认值）
     */
    private String cardLenType;

    public String getCardIds() {
        return cardIds;
    }

    public void setCardIds(String cardIds) {
        this.cardIds = cardIds;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCardLenType() {
        return cardLenType;
    }

    public void setCardLenType(String cardLenType) {
        this.cardLenType = cardLenType;
    }
}
