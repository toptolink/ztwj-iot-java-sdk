package com.ztwj.requests.query;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.query.GetSmsHistoryInfoResponse;

/**
 * Description:
 *
 * @author : fire
 * @date : 2019/4/18 17:05
 */
public class GetSmsHistoryInfoRequest extends BaseRequest<GetSmsHistoryInfoResponse> {
    /**
     * 目前支持iccid卡号、msisdn业务号
     */
    private String cardId;
    /**
     * 开始日期，格式为yyyy-MM-dd
     */
    private String startTime;
    /**
     * 结束日期，格式为yyyy-MM-dd
     */
    private String endTime;
    /**
     * 分页页数
     */
    private String pageNum;

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

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }
}
