package com.ztwj.responses.query;

import com.ztwj.data.GetSmsHistoryInfoData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: java-sdk
 *
 * @author : fire
 * @date : 2019/4/18 17:06
 */
public class GetSmsHistoryInfoResponse extends BaseResponse {
    private GetSmsHistoryInfoData data;

    public GetSmsHistoryInfoData getData() {
        return data;
    }

    public void setData(GetSmsHistoryInfoData data) {
        this.data = data;
    }
}
