package com.ztwj.responses.query;

import com.ztwj.data.GetSmsDetailsData;
import com.ztwj.responses.BaseResponse;

/**
 * Description: java-sdk
 *
 * @author : fire
 * @date : 2019/4/18 17:05
 */
public class GetSmsDetailsResponse extends BaseResponse {
    private GetSmsDetailsData data;

    public GetSmsDetailsData getData() {
        return data;
    }

    public void setData(GetSmsDetailsData data) {
        this.data = data;
    }
}
