package com.ztwj.requests.handle;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.handle.SendSmsResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:41
 */
public class SendSmsRequest extends BaseRequest<SendSmsResponse> {
    /**
     * 目前支持iccid卡号、msisdn业务号，
     * 最多不超过50个，多个号码之间用","相隔，
     * 例如："12345678901234567890,12345678901234567891"
     */
    private String cardId;
    /**
     * 短信内容：若为纯英文，则内容长度为1000个字；若存在中文，则内容长度为500个字
     */
    private String contents;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
