package com.ztwj.responses.poolop;

import com.ztwj.data.PoolopOrderData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:21
 */
public class PoolopOrderResponse extends BaseResponse {
    private PoolopOrderData data;

    public PoolopOrderData getData() {
        return data;
    }

    public void setData(PoolopOrderData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PoolopOrderResponse{" +
                "data=" + data.toString() +
                '}';
    }
}
