package com.ztwj.requests.whitelist;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.whitelist.GetWhitelistOperateRecordResponse;

/**
 * @Description 白名单操作记录查询接口请求对象
 * @Author zhengjiongda
 * @Date 2020/12/14 11:31
 * @Version 1.0
 **/
public class GetWhitelistOperateRecordRequest extends BaseRequest<GetWhitelistOperateRecordResponse> {

    private String iccid;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }
}
