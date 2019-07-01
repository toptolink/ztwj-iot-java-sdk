package com.ztwj.requests.flowpool;

import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.flowpool.UpdateFlowDataByControlTypeResponse;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/23 11:11
 */
public class UpdateFlowDataByControlTypeRequest extends BaseRequest<UpdateFlowDataByControlTypeResponse> {
    /**
     * ICCID号
     */
    private String cardId;
    /**
     * 设置流量限制类型：0，不限制，1 每月 ，2. 周期
     */
    private String controlType;
    /**
     * 设置阈值数值(M)（controlType 为非0时候，dataControl必填，且数值必须大于0）
     */
    private String dataControl;
    /**
     * 周期月数（限制类型为"周期",周期月数必填）
     */
    private String controlCycle;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public String getDataControl() {
        return dataControl;
    }

    public void setDataControl(String dataControl) {
        this.dataControl = dataControl;
    }

    public String getControlCycle() {
        return controlCycle;
    }

    public void setControlCycle(String controlCycle) {
        this.controlCycle = controlCycle;
    }
}
