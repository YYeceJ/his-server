package com.yyece.hisserver.entity;

/**
 * Created with IntelliJ IDEA.
 * User: yingying.jiang
 * Date: 2020/7/28
 */

/**
 * 公共的返回码
 * 返回码code：
 * 成功：10000
 * 失败：10001
 * 未登录：10002
 * 未授权：10003
 * 抛出异常：99999
 */
public enum ResultCode {

    SUCCESS(true, 10000, "操作成功！"),
    FAIL(false, 10001, "操作失败"),
    UNAUTHENTICATED(false, 10002, "您还未登录"),
    SERVER_ERROR(false, 99999, "抱歉，系统繁忙，请稍后重试！"),
    NOTFOUND_PATIENT(false, 20002, "抱歉，找不到病人"),
    PATIENT_EXISTED(false, 20002, "用户已存在"),
    PASSWORD_ERROR(false, 20001, "用户名或密码错误");

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
