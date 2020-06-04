package com.corson.learning.pattern.strategy.channel;

/**
 * PayEnum
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-06-02
 */
public enum PayEnum {
    ALI_PAY("ali", "支付宝支付"),
    WECHAT_PAY("wechat", "微信支付"),
    UNION_PAY("union", "网联支付");

    private String code;
    private String desc;

    PayEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
