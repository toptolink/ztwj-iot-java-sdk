package com.ztwj.data;

import com.ztwj.domain.CardInfoDO;

import java.util.List;

/**
 * Description: 卡片信息
 *
 * @author : fire
 * @date : 2019/5/22 16:49
 */
public class GetAllCardInfoData {
    /**
     * 总页数
     */
    private String totalPage;
    /**
     * 卡片信息列表
     */
    private List<CardInfoDO> cardInfoList;

    public String getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(String totalPage) {
        this.totalPage = totalPage;
    }

    public List<CardInfoDO> getCardInfoList() {
        return cardInfoList;
    }

    public void setCardInfoList(List<CardInfoDO> cardInfoList) {
        this.cardInfoList = cardInfoList;
    }
}
