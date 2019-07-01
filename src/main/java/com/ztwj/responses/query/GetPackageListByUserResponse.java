package com.ztwj.responses.query;

import com.ztwj.data.GetPackageListByUserData;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * Description: java-sdk
 *
 * @author : fire
 * @date : 2019/4/18 16:54
 */
public class GetPackageListByUserResponse extends BaseResponse {
    private List<GetPackageListByUserData> data;

    public List<GetPackageListByUserData> getData() {
        return data;
    }

    public void setData(List<GetPackageListByUserData> data) {
        this.data = data;
    }
}
