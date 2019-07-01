package com.ztwj.requests.flowpool;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.flowpool.AddCardsToPoolResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:10
 */
public class AddCardsToPoolRequest extends BaseRequest<AddCardsToPoolResponse> {
    /**
     * ICCID号
     */
    private String cardId;
    /**
     * 池编号
     */
    private String poolNumber;
    /**
     * 子池编号
     */
    private String groupCode;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPoolNumber() {
        return poolNumber;
    }

    public void setPoolNumber(String poolNumber) {
        this.poolNumber = poolNumber;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
}
