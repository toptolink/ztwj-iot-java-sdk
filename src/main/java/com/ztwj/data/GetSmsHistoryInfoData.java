package com.ztwj.data;

import com.ztwj.domain.SmsInfoDO;

import java.util.List;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:59
 */
public class GetSmsHistoryInfoData {
    /**
     * 目前支持iccid卡号、msisdn业务号
     */
    private String cardId;
    /**
     * 总页数
     */
    private String totalPage;
    /**
     * 短信内容详情列表集合
     */
    private List<SmsInfoDO> smsInfoList;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(String totalPage) {
        this.totalPage = totalPage;
    }

    public List<SmsInfoDO> getSmsInfoList() {
        return smsInfoList;
    }

    public void setSmsInfoList(List<SmsInfoDO> smsInfoList) {
        this.smsInfoList = smsInfoList;
    }
}
