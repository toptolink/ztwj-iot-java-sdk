package com.ztwj.requests.whitelist;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.whitelist.DeleteWhitelistContactResponse;

/**
 * @Description 白名单单个删除接口请求对象
 * @Author zhengjiongda
 * @Date 2020/12/14 11:28
 * @Version 1.0
 **/
public class DeleteWhitelistContactRequest extends BaseRequest<DeleteWhitelistContactResponse> {
    /**
     * iccid
     */
    private String iccid;
    /**
     * 白名单号码
     */
    private String whiteMsisdn;

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
}
