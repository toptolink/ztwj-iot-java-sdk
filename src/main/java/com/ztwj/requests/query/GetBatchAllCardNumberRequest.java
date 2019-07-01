package com.ztwj.requests.query;

import com.ztwj.consts.CardIdType;
import com.ztwj.consts.IccidLenType;
import com.ztwj.consts.Operator;
import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.query.GetBatchAllCardNumberResponse;

/**
 * Description: 批量互查卡的iccid、业务号msisdn、IMSI信息
 *
 * @author : fire
 * @date : 2019/4/18 17:08
 */
public class GetBatchAllCardNumberRequest extends BaseRequest<GetBatchAllCardNumberResponse> {
    /**
     *  支持iccid号、业务号msisdn、IMSI号，最多不超过50个，
     *  各个号码之间用","相隔，例如："12345678901234567890,12345678901234567891,12345678901234567892"
     *  注：IMSI号仅支持联通
     */
    private String cardIds;
    /**
     * 运营商
     * @see Operator
     */
    private String operator;
    /**
     * 卡号类型
     * @see CardIdType
     */
    private String type;
    /**
     * iccid号码位数类型（当type=1时填写）：
     * 0：卡号为19位1：卡号为20位（默认值）
     * @see IccidLenType
     */
    private String iccidLenType;

    public String getCardIds() {
        return cardIds;
    }

    public void setCardIds(String cardIds) {
        this.cardIds = cardIds;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIccidLenType() {
        return iccidLenType;
    }

    public void setIccidLenType(String iccidLenType) {
        this.iccidLenType = iccidLenType;
    }
}
