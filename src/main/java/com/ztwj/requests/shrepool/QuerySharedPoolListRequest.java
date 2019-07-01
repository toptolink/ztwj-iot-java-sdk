package com.ztwj.requests.shrepool;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.sharepool.QuerySharedPoolListResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:08
 */
public class QuerySharedPoolListRequest extends BaseRequest<QuerySharedPoolListResponse> {
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
