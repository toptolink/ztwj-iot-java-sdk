package com.ztwj.responses.query;

import com.ztwj.data.GetPackageListData;
import com.ztwj.domain.OrderedPkgDO;
import com.ztwj.responses.BaseResponse;

import java.util.List;

/**
 * 卡片已订购套餐查询
 *
 * @author LIUSF
 * @date 2019-03-27 18:32:06
 */
public class GetPackageListResponse extends BaseResponse {
    private GetPackageListData data;

    public GetPackageListData getData() {
        return data;
    }

    public void setData(GetPackageListData data) {
        this.data = data;
    }
}
