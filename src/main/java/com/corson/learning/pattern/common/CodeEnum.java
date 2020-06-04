package com.corson.learning.pattern.common;

/**
 * CodeEnum
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-06-04
 */
public enum CodeEnum {
    SUCCESS(200, "成功"),
    FAILURE(400, "失败"),
    EXCEPTION(500, "异常");

    private int code;
    private String desc;

    CodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
