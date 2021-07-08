package com.ztwj.responses.whitelist;

import com.ztwj.data.GetWhitelistContactData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * @Description 白名单查询接口响应对象
 * @Author zhengjiongda
 * @Date 2020/12/14 11:03
 * @Version 1.0
 **/
public class GetWhitelistContactResponse extends BaseResponse {

    private List<GetWhitelistContactData> data;

    public List<GetWhitelistContactData> getData() {
        return data;
    }

    public void setData(List<GetWhitelistContactData> data) {
        this.data = data;
    }
}
