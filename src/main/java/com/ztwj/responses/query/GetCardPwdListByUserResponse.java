package com.ztwj.responses.query;

import com.ztwj.data.GetCardPwdListByUserData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: java-sdk
 *
 * @author : fire
 * @date : 2019/4/18 17:07
 */
public class GetCardPwdListByUserResponse extends BaseResponse {
    private List<GetCardPwdListByUserData> data;

    public List<GetCardPwdListByUserData> getData() {
        return data;
    }

    public void setData(List<GetCardPwdListByUserData> data) {
        this.data = data;
    }
}
