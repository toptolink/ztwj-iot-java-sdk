package com.ztwj.data;

/**
 * @Description 白名单
 * @Author zhengjiongda
 * @Date 2020/12/14 11:05
 * @Version 1.0
 **/
public class GetWhitelistContactData {
    /**
     * ICCID
     */
    private String iccid;
    /**
     * MSISDN
     */
    private String msisdn;
    /**
     * 卡号状态
     * 联通或者移动EC的卡： 0：正常  1：正常  4：删除中
     * 移动非EC的卡：0：启用  1：禁用  4：禁用中  6：启用中
     */
    private Integer status;
    /**
     * 白名单号码
     */
    private String whiteMsisdn;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 操作时间
     */
    private String gmtCreate;

    public String getWhiteMsisdn() {
        return whiteMsisdn;
    }

    public void setWhiteMsisdn(String whiteMsisdn) {
        this.whiteMsisdn = whiteMsisdn;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
