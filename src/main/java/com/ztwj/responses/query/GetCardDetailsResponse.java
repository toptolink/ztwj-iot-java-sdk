package com.ztwj.responses.query;

import com.ztwj.data.GetCardDetailsData;
import com.ztwj.responses.BaseResponse;

/**
 * 卡片本月用量查询
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class GetCardDetailsResponse extends BaseResponse {
    private GetCardDetailsData data;

    public GetCardDetailsData getData() {
        return data;
    }

    public void setData(GetCardDetailsData data) {
        this.data = data;
    }
}
