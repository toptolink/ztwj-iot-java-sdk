package com.ztwj.data;

/**
 * Description: 查询当前客户的卡密套餐列表
 *
 * @author : fire
 * @date : 2019/5/22 16:57
 */
public class GetCardPwdListByUserData {
    /**
     * 套餐编码
     */
    private String packageCode;
    /**
     * 套餐名称
     */
    private String packageName;
    /**
     * 套餐用量(M)
     */
    private String dataPlan;
    /**
     * 套餐周期(月)
     */
    private String cycle;
    /**
     * 运营商：运营商，1移动，2联通，3电信
     *
     * @see com.ztwj.consts.Operator
     */
    private String operator;
    /**
     * 卡密可用数量
     */
    private String count;

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDataPlan() {
        return dataPlan;
    }

    public void setDataPlan(String dataPlan) {
        this.dataPlan = dataPlan;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
