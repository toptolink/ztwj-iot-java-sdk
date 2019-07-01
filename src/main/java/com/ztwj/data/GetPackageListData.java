package com.ztwj.data;

import com.ztwj.domain.OrderedPkgDO;

import java.util.List;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:58
 */
public class GetPackageListData {
    /**
     * 套餐列表
     */
    private List<OrderedPkgDO> pkgs;

    public List<OrderedPkgDO> getPkgs() {
        return pkgs;
    }

    public void setPkgs(List<OrderedPkgDO> pkgs) {
        this.pkgs = pkgs;
    }
}
