package com.ztwj.data;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/22 16:57
 */
public class GetPackageListByUserData {
    /**
     * 套餐编码
     */
    private String packageCode;
    /**
     * 套餐名称
     */
    private String packageName;
    /**
     * 套餐金额（单位：元）
     */
    private String price;
    /**
     * 公众号价格（单位：元）
     */
    private String publicNumerPrice;
    /**
     * 套餐用量（单位：M）
     */
    private String dataPlan;
    /**
     * 套餐周期（单位：月）
     */
    private String cycle;
    /**
     * 运 营 商 ：1 移动2 联通3 电信
     */
    private String operator;
    /**
     * 套餐类型：1 流量套餐2 组合套餐3 定向套餐
     */
    private String packageFlag;
    /**
     * 流量套餐类型（当packageFlag=1或者3时，此参数有值）：
     * 1 流量包
     * 2 月套餐
     * 3 定向流量包
     * 4 定向月套餐
     * 5 共享月套餐
     * 6 加油包
     * 7 季度包
     * 8 半年包
     * 9 年包
     */
    private String packageType;
    /**
     * 语音用量（单位：分钟）（当packageFlag=2时，此参数有值）
     */
    private String voicePlan;
    /**
     * 组合套餐类型（当packageFlag=2时，此参数有值）：
     * 2 月套餐
     */
    private String voicePackageType;


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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPublicNumerPrice() {
        return publicNumerPrice;
    }

    public void setPublicNumerPrice(String publicNumerPrice) {
        this.publicNumerPrice = publicNumerPrice;
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

    public String getPackageFlag() {
        return packageFlag;
    }

    public void setPackageFlag(String packageFlag) {
        this.packageFlag = packageFlag;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getVoicePlan() {
        return voicePlan;
    }

    public void setVoicePlan(String voicePlan) {
        this.voicePlan = voicePlan;
    }

    public String getVoicePackageType() {
        return voicePackageType;
    }

    public void setVoicePackageType(String voicePackageType) {
        this.voicePackageType = voicePackageType;
    }
}
