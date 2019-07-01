package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:56
 */
public class GetCardInfoByImeiData {
    /**
     * ICCID
     */
    private String cardId;
    /**
     * MSISDN业务号
     */
    private String msisdn;
    /**
     * IMSI号，支持联通、移动
     */
    private String IMSI;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }
}
