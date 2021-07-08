package com.ztwj.requests.whitelist;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.whitelist.AddWhitelistContactResponse;

/**
 * @Description 白名单单个新增接口
 * @Author zhengjiongda
 * @Date 2020/12/14 11:11
 * @Version 1.0
 **/
public class AddWhitelistContactRequest extends BaseRequest<AddWhitelistContactResponse> {
    /**
     * iccid
     */
    private String iccid;
    /**
     * 白名单号码
     */
    private String whiteMsisdn;
    /**
     * 白名单姓名
     */
    private String contact;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

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
}
