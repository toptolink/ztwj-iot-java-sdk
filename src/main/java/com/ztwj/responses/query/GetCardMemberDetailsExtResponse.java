package com.ztwj.responses.query;

import com.ztwj.data.GetCardMemberDetailsData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: 卡片本月用量批量查询
 *
 * @author : fire
 * @date : 2019/5/22 15:38
 */
public class GetCardMemberDetailsExtResponse extends BaseResponse {
    private List<GetCardMemberDetailsData> data;

    public List<GetCardMemberDetailsData> getData() {
        return data;
    }

    public void setData(List<GetCardMemberDetailsData> data) {
        this.data = data;
    }
}
