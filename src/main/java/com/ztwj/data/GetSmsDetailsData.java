package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:58
 */
public class GetSmsDetailsData {
    /**
     * 目前支持iccid卡号、msisdn业务号
     */
    private String cardId;
    /**
     * 是否开通短信：0：否1：是
     */
    private String smsStatus;
    /**
     * 卡到平台总接收条数
     */
    private String smsUp;
    /**
     *卡到平台已接收条数
     */
    private String smsUpUsed;
    /**
     * 平台到卡总发送条数
     */
    private String smsDown;
    /**
     * 平台到卡已发送条数
     */
    private String smsDownUsed;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    public String getSmsUp() {
        return smsUp;
    }

    public void setSmsUp(String smsUp) {
        this.smsUp = smsUp;
    }

    public String getSmsUpUsed() {
        return smsUpUsed;
    }

    public void setSmsUpUsed(String smsUpUsed) {
        this.smsUpUsed = smsUpUsed;
    }

    public String getSmsDown() {
        return smsDown;
    }

    public void setSmsDown(String smsDown) {
        this.smsDown = smsDown;
    }

    public String getSmsDownUsed() {
        return smsDownUsed;
    }

    public void setSmsDownUsed(String smsDownUsed) {
        this.smsDownUsed = smsDownUsed;
    }
}
