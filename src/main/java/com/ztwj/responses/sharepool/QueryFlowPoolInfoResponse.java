package com.ztwj.responses.sharepool;

import com.ztwj.data.QueryFlowPoolInfoData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:12
 */
public class QueryFlowPoolInfoResponse extends BaseResponse {
    private List<QueryFlowPoolInfoData> data;

    public List<QueryFlowPoolInfoData> getData() {
        return data;
    }

    public void setData(List<QueryFlowPoolInfoData> data) {
        this.data = data;
    }
}
