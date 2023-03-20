package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 11:08
 */
public class PoolopQueryCardMainPkgExpiredTimeData {
    // ICCID
    private String iccid;

    // 业务号
    private String msisdn;

    // 主套餐到期时间
    private String mainPackageExpiredTime;

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

    public String getMainPackageExpiredTime() {
        return mainPackageExpiredTime;
    }

    public void setMainPackageExpiredTime(String mainPackageExpiredTime) {
        this.mainPackageExpiredTime = mainPackageExpiredTime;
    }

    @Override
    public String toString() {
        return "PoolopQueryCardMainPkgExpiredTimeData{" +
                "iccid='" + iccid + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", mainPackageExpiredTime='" + mainPackageExpiredTime + '\'' +
                '}';
    }
}
