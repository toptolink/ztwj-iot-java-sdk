package com.ztwj.responses.query;

import com.ztwj.data.GetCardInfoByImeiData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 15:38
 */
public class GetCardInfoByImeiResponse extends BaseResponse {
    private GetCardInfoByImeiData data;

    public GetCardInfoByImeiData getData() {
        return data;
    }

    public void setData(GetCardInfoByImeiData data) {
        this.data = data;
    }
}
