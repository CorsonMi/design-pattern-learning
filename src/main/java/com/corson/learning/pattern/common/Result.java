package com.corson.learning.pattern.common;

/**
 * Result
 *
 * @author chengkesen
 * @version v1.0.0
 * @Date 2020-06-02
 */
public class Result<T> {
    private int code;
    private T data;
    private String msg;

    public Result() {
    }

    public Result(int code) {
        new Result<T>(code, null);
    }

    public Result(int code, T data) {
        new Result<T>(code, data, null);
    }

    public Result(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
