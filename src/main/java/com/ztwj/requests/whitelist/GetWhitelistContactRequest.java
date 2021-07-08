package com.ztwj.requests.whitelist;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.whitelist.GetWhitelistContactResponse;

/**
 * @Description 白名单查询接口请求对象
 * @Author zhengjiongda
 * @Date 2020/12/14 11:02
 * @Version 1.0
 **/
public class GetWhitelistContactRequest extends BaseRequest<GetWhitelistContactResponse> {

    private String iccid;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }
}
