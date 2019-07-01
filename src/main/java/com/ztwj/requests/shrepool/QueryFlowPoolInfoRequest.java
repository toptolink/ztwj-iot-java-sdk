package com.ztwj.requests.shrepool;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.sharepool.QueryFlowPoolInfoResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:09
 */
public class QueryFlowPoolInfoRequest extends BaseRequest<QueryFlowPoolInfoResponse> {
    /**
     * 	池编号
     */
    private String poolNumber;

    public String getPoolNumber() {
        return poolNumber;
    }

    public void setPoolNumber(String poolNumber) {
        this.poolNumber = poolNumber;
    }
}
