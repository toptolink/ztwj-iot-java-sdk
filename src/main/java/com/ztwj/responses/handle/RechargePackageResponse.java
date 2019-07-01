package com.ztwj.responses.handle;

import com.ztwj.data.RechargePackageData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:44
 */
public class RechargePackageResponse extends BaseResponse {
    private RechargePackageData data;

    public RechargePackageData getData() {
        return data;
    }

    public void setData(RechargePackageData data) {
        this.data = data;
    }
}
