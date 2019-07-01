package com.ztwj.requests.query;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.query.GetAllCardInfoResponse;


/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 15:34
 */
public class GetAllCardInfoRequest extends BaseRequest<GetAllCardInfoResponse> {
    /**
     * 运营商
     */
    private String operator;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 页数
     */
    private String pageNum;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
