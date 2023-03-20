package com.ztwj.responses.poolop;

import com.ztwj.data.PoolopQueryCardOrderRechargesData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:19
 */
public class PoolopQueryCardOrderRechargesResponse extends BaseResponse {
    private PoolopQueryCardOrderRechargesData data;

    public PoolopQueryCardOrderRechargesData getData() {
        return data;
    }

    public void setData(PoolopQueryCardOrderRechargesData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PoolopQueryCardOrderRechargesResponse{" +
                "data=" + data.toString() +
                '}';
    }
}
