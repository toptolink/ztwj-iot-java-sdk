package com.ztwj.responses.poolop;

import com.ztwj.data.PoolopQueryCardMainPkgExpiredTimeData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:20
 */
public class PoolopQueryCardMainPkgExpiredTimeResponse extends BaseResponse {
    private PoolopQueryCardMainPkgExpiredTimeData data;

    public PoolopQueryCardMainPkgExpiredTimeData getData() {
        return data;
    }

    public void setData(PoolopQueryCardMainPkgExpiredTimeData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PoolopQueryCardMainPkgExpiredTimeResponse{" +
                "data=" + data.toString() +
                '}';
    }
}
