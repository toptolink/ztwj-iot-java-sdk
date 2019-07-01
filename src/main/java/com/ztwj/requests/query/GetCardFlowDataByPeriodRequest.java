package com.ztwj.requests.query;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.query.GetCardFlowDataByPeriodResponse;

/**
 * Description: 根据ICCID卡号和开始日期 和结束日期查询卡已使用流量
 *
 * @author : fire
 * @date : 2019/4/18 16:52
 */
public class GetCardFlowDataByPeriodRequest extends BaseRequest<GetCardFlowDataByPeriodResponse> {
    /**
     * ICCID号
     */
    private String cardId;
    /**
     * 开始时间，格式为yyyy-MM-dd
     */
    private String startTime;
    /**
     * 结束时间，格式为yyyy-MM-dd
     */
    private String endTime;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
