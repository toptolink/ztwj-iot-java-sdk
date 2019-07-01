package com.ztwj.responses.query;


import com.ztwj.data.GetPackageRechargeListData;
import com.ztwj.responses.BaseResponse;

/**
 * 充值订单查询
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class GetPackageRechargeListResponse extends BaseResponse {
    private GetPackageRechargeListData data;

    public GetPackageRechargeListData getData() {
        return data;
    }

    public void setData(GetPackageRechargeListData data) {
        this.data = data;
    }
}
