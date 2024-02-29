package com.stu.forum.core.result;

import lombok.Data;

@Data
public class GlobalResult<T> {
    private T data;
    private int code;
    private String message;

    public GlobalResult(){

    }

    public GlobalResult(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public static <T> GlobalResult<T> success(T data){
        GlobalResult<T> result = new GlobalResult<>();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setData(data);
        result.setMessage(null);
        return result;
    }

}
