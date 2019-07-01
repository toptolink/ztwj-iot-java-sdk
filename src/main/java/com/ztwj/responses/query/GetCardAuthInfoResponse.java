package com.ztwj.responses.query;

import com.ztwj.data.GetCardAuthInfoData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 15:37
 */
public class GetCardAuthInfoResponse extends BaseResponse {
    private GetCardAuthInfoData data;

    public GetCardAuthInfoData getData() {
        return data;
    }

    public void setData(GetCardAuthInfoData data) {
        this.data = data;
    }
}
