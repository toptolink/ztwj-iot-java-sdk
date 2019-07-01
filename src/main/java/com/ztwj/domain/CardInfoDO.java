package com.ztwj.domain;

import com.ztwj.consts.CardFlag;

import java.io.Serializable;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:24
 */
public class CardInfoDO implements Serializable {
    /**
     * ICCID卡号
     */
    private String iccid;
    /**
     * MSISDN业务号
     */
    private String msisdn;
    /**
     * IMSI号
     */
    private String imsi;
    /**
     * 卡片类型
     * @see CardFlag
     */
    private String cardFlag;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getCardFlag() {
        return cardFlag;
    }

    public void setCardFlag(String cardFlag) {
        this.cardFlag = cardFlag;
    }

    @Override
    public String toString() {
        return "CardInfoDO{" +
                "iccid='" + iccid + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", imsi='" + imsi + '\'' +
                ", cardFlag='" + cardFlag + '\'' +
                '}';
    }
}
