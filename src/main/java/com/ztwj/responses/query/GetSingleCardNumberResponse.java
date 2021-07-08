package com.ztwj.responses.query;

import com.ztwj.data.GetSingleCardNumberData;
import com.ztwj.responses.BaseResponse;

/**
 * @Description 单个码号查询响应对象
 * @Author zhengjiongda
 * @Date 2020/12/14 10:51
 * @Version 1.0
 **/
public class GetSingleCardNumberResponse extends BaseResponse {

    private GetSingleCardNumberData data;

    public GetSingleCardNumberData getData() {
        return data;
    }

    public void setData(GetSingleCardNumberData data) {
        this.data = data;
    }
}
