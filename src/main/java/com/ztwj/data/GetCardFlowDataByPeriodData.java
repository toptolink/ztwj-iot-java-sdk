package com.ztwj.data;

import com.ztwj.domain.CardDayFlowDO;

import java.util.List;

/**
 * Description: 根据ICCID卡号和开始日期 和结束日期查询卡已使用流量
 *
 * @author : fire
 * @date : 2019/5/22 16:56
 */
public class GetCardFlowDataByPeriodData {
    /**
     * 卡Icccid号
     */
    private String iccid;
    /**
     * 业务号msisdn
     */
    private String msisdn;
    /**
     * imsi
     */
    private String imsi;
    /**
     * 已使用流量
     */
    private String dataUsage;
    /**
     * 开始日期
     */
    private String startTime;
    /**
     * 结束日期
     */
    private String endTime;

    /**
     * 每日用量信息
     */
    private List<CardDayFlowDO> detailList;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getDataUsage() {
        return dataUsage;
    }

    public void setDataUsage(String dataUsage) {
        this.dataUsage = dataUsage;
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

    public List<CardDayFlowDO> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<CardDayFlowDO> detailList) {
        this.detailList = detailList;
    }
}
