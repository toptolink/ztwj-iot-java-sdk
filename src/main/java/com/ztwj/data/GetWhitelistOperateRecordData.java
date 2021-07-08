package com.ztwj.data;

/**
 * @Description 白名单操作记录
 * @Author zhengjiongda
 * @Date 2020/12/14 11:32
 * @Version 1.0
 **/
public class GetWhitelistOperateRecordData {
    /**
     * iccid
     */
    private String iccid;
    /**
     * 业务号
     */
    private String msisdn;
    /**
     * 状态码：
     * 1,12：添加成功
     * 2,3：添加失败
     * 4：启用成功
     * 5：启用失败
     * 6,11：删除成功
     * 7：删除失败
     * 9：禁用成功
     * 10：禁用失败
     * 13：添加中
     */
    private Integer status;
    /**
     * 白名单号码
     */
    private String whiteMsisdn;
    /**
     * 错误原因
     */
    private String errorEason;

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

    public String getErrorEason() {
        return errorEason;
    }

    public void setErrorEason(String errorEason) {
        this.errorEason = errorEason;
    }
}
