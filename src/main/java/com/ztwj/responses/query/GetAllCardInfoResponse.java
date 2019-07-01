package com.ztwj.responses.query;

import com.ztwj.data.GetAllCardInfoData;
import com.ztwj.domain.CardInfoDO;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 15:36
 */
public class GetAllCardInfoResponse  extends BaseResponse {
    private GetAllCardInfoData  data;

    public GetAllCardInfoData getData() {
        return data;
    }

    public void setData(GetAllCardInfoData data) {
        this.data = data;
    }
}
