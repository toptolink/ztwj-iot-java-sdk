package com.ztwj.responses.query;

import com.ztwj.data.GetCardMemberDetailsData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * 卡片本月用量批量查询
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class GetCardMemberDetailsResponse extends BaseResponse {
    private List<GetCardMemberDetailsData> data;

    public List<GetCardMemberDetailsData> getData() {
        return data;
    }

    public void setData(List<GetCardMemberDetailsData> data) {
        this.data = data;
    }
}
