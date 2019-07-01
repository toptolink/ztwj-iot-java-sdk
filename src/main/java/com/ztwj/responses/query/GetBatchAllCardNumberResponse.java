package com.ztwj.responses.query;

import com.ztwj.data.GetBatchAllCardNumberData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: java-sdk
 *
 * @author : fire
 * @date : 2019/4/18 17:08
 */
public class GetBatchAllCardNumberResponse extends BaseResponse {
    private List<GetBatchAllCardNumberData> data;

    public List<GetBatchAllCardNumberData> getData() {
        return data;
    }

    public void setData(List<GetBatchAllCardNumberData> data) {
        this.data = data;
    }
}
