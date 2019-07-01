package com.ztwj.responses.flowpool;

import com.ztwj.data.QueryPoolFlowData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:11
 */
public class QueryPoolFlowResponse extends BaseResponse {
    private QueryPoolFlowData data;

    public QueryPoolFlowData getData() {
        return data;
    }

    public void setData(QueryPoolFlowData data) {
        this.data = data;
    }
}
