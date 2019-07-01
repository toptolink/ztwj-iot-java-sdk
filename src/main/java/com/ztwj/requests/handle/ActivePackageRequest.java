package com.ztwj.requests.handle;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.handle.ActivePackageResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:41
 */
public class ActivePackageRequest extends BaseRequest<ActivePackageResponse> {
    /**
     * 当前只支持iccid卡号
     */
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
