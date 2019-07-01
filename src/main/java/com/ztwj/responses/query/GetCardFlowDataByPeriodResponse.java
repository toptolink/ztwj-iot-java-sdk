package com.ztwj.responses.query;

import com.ztwj.data.GetCardFlowDataByPeriodData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: java-sdk
 *
 * @author : fire
 * @date : 2019/4/18 16:52
 */
public class GetCardFlowDataByPeriodResponse extends BaseResponse {
    private GetCardFlowDataByPeriodData data;

    public GetCardFlowDataByPeriodData getData() {
        return data;
    }

    public void setData(GetCardFlowDataByPeriodData data) {
        this.data = data;
    }
}
