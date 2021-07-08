package com.ztwj.data;

/**
 * @Description 单个码号信息查询
 * @Author zhengjiongda
 * @Date 2020/12/14 10:49
 * @Version 1.0
 **/
public class GetSingleCardNumberData {
    /**
     * ICCID
     */
    private String iccid;
    /**
     * MSISDN
     */
    private String msisdn;
    /**
     * IMSI
     */
    private String IMSI;

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

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }
}
