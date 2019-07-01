package com.ztwj.requests.flowpool;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.flowpool.QueryPoolFlowResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:10
 */
public class QueryPoolFlowRequest extends BaseRequest<QueryPoolFlowResponse> {
    /**
     * 池编号
     */
    private String poolNumber;
    /**
     * 子池code
     */
    private String groupCode;

    public String getPoolNumber() {
        return poolNumber;
    }

    public void setPoolNumber(String poolNumber) {
        this.poolNumber = poolNumber;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
}
