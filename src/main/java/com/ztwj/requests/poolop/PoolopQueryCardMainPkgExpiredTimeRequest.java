package com.ztwj.requests.poolop;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.poolop.PoolopQueryCardMainPkgExpiredTimeResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 10:20
 */
public class PoolopQueryCardMainPkgExpiredTimeRequest extends BaseRequest<PoolopQueryCardMainPkgExpiredTimeResponse> {
    // 月份：支持整数，若输入1，则查询在本月主套餐到期的卡片
    private Integer monthNum;

    public Integer getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(Integer monthNum) {
        this.monthNum = monthNum;
    }

    @Override
    public String toString() {
        return "PoolopQueryCardMainPkgExpiredTimeRequest{" +
                "monthNum=" + monthNum +
                '}';
    }
}
