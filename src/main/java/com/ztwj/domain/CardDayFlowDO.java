package com.ztwj.domain;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 10:08
 */
public class CardDayFlowDO {
    /**
     * 用量信息（M）
     */
    private String usedFlow;
    /**
     * 日期
     */
    private String usedDate;

    public String getUsedFlow() {
        return usedFlow;
    }

    public void setUsedFlow(String usedFlow) {
        this.usedFlow = usedFlow;
    }

    public String getUsedDate() {
        return usedDate;
    }

    public void setUsedDate(String usedDate) {
        this.usedDate = usedDate;
    }

    @Override
    public String toString() {
        return "CardDayFlowDO{" +
                "usedFlow='" + usedFlow + '\'' +
                ", usedDate='" + usedDate + '\'' +
                '}';
    }
}
