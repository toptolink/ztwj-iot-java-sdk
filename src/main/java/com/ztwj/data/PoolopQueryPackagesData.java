package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2023/3/17 11:18
 */
public class PoolopQueryPackagesData {
    // 套餐编码
    private String packageCode;
    // 系统套餐名称
    private String packageName;
    // 套餐售价（单位：元）
    private String scaleSellMoney;
    // 套餐用量
    private String datacontrol;
    // 套餐周期
    private Integer packageCycle;
    // 周期单位
    private String unit;
    // 运营商
    private String operator;
    // 套餐类型：主套餐/叠加流量包
    private Integer packageType;

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

    public String getScaleSellMoney() {
        return scaleSellMoney;
    }

    public void setScaleSellMoney(String scaleSellMoney) {
        this.scaleSellMoney = scaleSellMoney;
    }

    public String getDatacontrol() {
        return datacontrol;
    }

    public void setDatacontrol(String datacontrol) {
        this.datacontrol = datacontrol;
    }

    public Integer getPackageCycle() {
        return packageCycle;
    }

    public void setPackageCycle(Integer packageCycle) {
        this.packageCycle = packageCycle;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    @Override
    public String toString() {
        return "PoolopQueryPackagesData{" +
                "packageCode='" + packageCode + '\'' +
                ", packageName='" + packageName + '\'' +
                ", scaleSellMoney='" + scaleSellMoney + '\'' +
                ", datacontrol='" + datacontrol + '\'' +
                ", packageCycle=" + packageCycle +
                ", unit='" + unit + '\'' +
                ", operator=" + operator +
                ", packageType=" + packageType +
                '}';
    }
}
