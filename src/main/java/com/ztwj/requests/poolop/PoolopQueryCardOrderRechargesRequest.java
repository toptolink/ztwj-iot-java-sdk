package com.ztwj.requests.poolop;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.poolop.PoolopQueryCardOrderRechargesResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:20
 */
public class PoolopQueryCardOrderRechargesRequest extends BaseRequest<PoolopQueryCardOrderRechargesResponse> {
    // 订单编号
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "PoolopQueryCardOrderRechargesRequest{" +
                "orderNo='" + orderNo + '\'' +
                '}';
    }
}
