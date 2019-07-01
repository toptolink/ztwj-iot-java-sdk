package com.ztwj.responses.sharepool;

import com.ztwj.data.QuerySharedPoolListData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:12
 */
public class QuerySharedPoolListResponse extends BaseResponse {
    private List<QuerySharedPoolListData> data;

    public List<QuerySharedPoolListData> getData() {
        return data;
    }

    public void setData(List<QuerySharedPoolListData> data) {
        this.data = data;
    }
}
