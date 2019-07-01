package com.ztwj.responses.handle;

import com.ztwj.data.RechargeVoicePackageData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:44
 */
public class RechargeVoicePackageResponse extends BaseResponse {
    private RechargeVoicePackageData data;

    public RechargeVoicePackageData getData() {
        return data;
    }

    public void setData(RechargeVoicePackageData data) {
        this.data = data;
    }
}
