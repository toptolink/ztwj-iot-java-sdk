package com.ztwj.responses.poolop;

import com.ztwj.data.PoolopQueryCardDetailsData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:17
 */
public class PoolopQueryCardDetailsResponse extends BaseResponse {
    private PoolopQueryCardDetailsData data;

    public PoolopQueryCardDetailsData getData() {
        return data;
    }

    public void setData(PoolopQueryCardDetailsData data) {
        this.data = data;
    }
}
