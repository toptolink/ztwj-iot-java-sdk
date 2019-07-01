package com.ztwj.requests.handle;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.handle.ChangeCardSwitchResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:40
 */
public class ChangeCardSwitchRequest extends BaseRequest<ChangeCardSwitchResponse> {
    /**
     * 当前只支持iccid卡号
     */
    private String cardId;
    /**
     * 操作类型：0 停用1 激活
     */
    private String optType;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
    }
}
