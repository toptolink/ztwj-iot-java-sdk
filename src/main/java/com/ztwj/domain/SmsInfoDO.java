package com.ztwj.domain;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 10:59
 */
public class SmsInfoDO {
    /**
     * 类型：1：从平台发送到卡2：从卡发送到平台
     */
    private String smsType;
    /**
     * 发送状态：0：已发送1：成功2：失败
     */
    private String sendState;
    /**
     * 发送时间，格式为yyyy-MM-dd HH:mm:ss
     */
    private String sendTime;
    /**
     * 短信内容
     */
    private String smsContent;

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    public String getSendState() {
        return sendState;
    }

    public void setSendState(String sendState) {
        this.sendState = sendState;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    @Override
    public String toString() {
        return "SmsInfoDO{" +
                "smsType='" + smsType + '\'' +
                ", sendState='" + sendState + '\'' +
                ", sendTime='" + sendTime + '\'' +
                ", smsContent='" + smsContent + '\'' +
                '}';
    }
}
