package com.ztwj.responses.whitelist;

import com.ztwj.data.GetWhitelistOperateRecordData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * @Description 白名单操作记录查询接口响应对象
 * @Author zhengjiongda
 * @Date 2020/12/14 11:31
 * @Version 1.0
 **/
public class GetWhitelistOperateRecordResponse extends BaseResponse {

    private List<GetWhitelistOperateRecordData> data;

    public List<GetWhitelistOperateRecordData> getData() {
        return data;
    }

    public void setData(List<GetWhitelistOperateRecordData> data) {
        this.data = data;
    }
}
