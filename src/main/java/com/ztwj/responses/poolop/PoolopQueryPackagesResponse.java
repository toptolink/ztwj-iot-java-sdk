package com.ztwj.responses.poolop;

import com.ztwj.data.PoolopQueryPackagesData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:19
 */
public class PoolopQueryPackagesResponse extends BaseResponse {
    private List<PoolopQueryPackagesData> data;

    public List<PoolopQueryPackagesData> getData() {
        return data;
    }

    public void setData(List<PoolopQueryPackagesData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PoolopQueryPackagesResponse{" +
                "data=" + data.toString() +
                '}';
    }
}
