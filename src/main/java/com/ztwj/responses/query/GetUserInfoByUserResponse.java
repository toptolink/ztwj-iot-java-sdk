package com.ztwj.responses.query;

import com.ztwj.data.GetPackageListByUserData;
import com.ztwj.data.GetUserInfoByUserData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: java-sdk
 *
 * @author : fire
 * @date : 2019/4/18 16:54
 */
public class GetUserInfoByUserResponse extends BaseResponse {
    private GetUserInfoByUserData data;

    public GetUserInfoByUserData getData() {
        return data;
    }

    public void setData(GetUserInfoByUserData data) {
        this.data = data;
    }
}
