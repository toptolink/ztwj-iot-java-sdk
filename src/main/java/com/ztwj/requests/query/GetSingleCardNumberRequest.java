package com.ztwj.requests.query;

import com.ztwj.consts.CardIdType;
import com.ztwj.consts.IccidLenType;
import com.ztwj.requests.BaseRequest;
import com.ztwj.responses.query.GetSingleCardNumberResponse;

/**
 * @Description 单个码号信息查询请求对象
 * @Author zhengjiongda
 * @Date 2020/12/14 10:51
 * @Version 1.0
 **/
public class GetSingleCardNumberRequest  extends BaseRequest<GetSingleCardNumberResponse> {
    /**
     *  支持iccid号、业务号msisdn、IMSI号
     *  注：IMSI号仅支持联通
     */
    private String cardId;
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

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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
