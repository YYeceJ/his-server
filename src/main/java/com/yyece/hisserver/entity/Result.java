package com.yyece.hisserver.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: yingying.jiang
 * Date: 2020/7/27
 */
@Data
public class Result {
    private boolean success;//是否成功
    private long code;
    private String message;
    private Object data;

    public Result(ResultCode code){
        this.success = code.success;
        this.message = code.message;
        this.code = code.code;
    }

    public Result(ResultCode code,Object data){
        this.success = code.success;
        this.message = code.message;
        this.code = code.code;
        this.data = data;
    }

    public Result(boolean success,long code,String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Result(Object data){
        this.data = data;
    }

    public static Result SUCCESS(){
        return new Result(ResultCode.SUCCESS);
    }
    public static Result ERROR(){
        return new Result(ResultCode.SERVER_ERROR);
    }
    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }
}
