package com.ztwj.responses.handle;

import com.ztwj.data.RechargeCardPwdData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:43
 */
public class RechargeCardPwdResponse extends BaseResponse {
    private RechargeCardPwdData data;

    public RechargeCardPwdData getData() {
        return data;
    }

    public void setData(RechargeCardPwdData data) {
        this.data = data;
    }
}
