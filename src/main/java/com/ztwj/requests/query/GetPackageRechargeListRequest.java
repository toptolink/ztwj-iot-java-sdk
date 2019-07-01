package com.ztwj.requests.query;


import com.ztwj.responses.query.GetPackageRechargeListResponse;
import com.ztwj.requests.BaseRequest;

/**
 * 充值订单查询
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class GetPackageRechargeListRequest extends BaseRequest<GetPackageRechargeListResponse> {
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
