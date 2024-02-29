package com.stu.forum.core.result;

import lombok.Data;

@Data
public class GlobalResult<T> {
    private T data;
    private ResultCode code = ResultCode.SUCCESS;
    private String message;

    public GlobalResult() {
    }

    public static <T> GlobalResult<T> success(T data){
        GlobalResult<T> result = new GlobalResult<>();
        result.setCode(ResultCode.SUCCESS);
        result.setData(data);
        result.setMessage(null);
        return result;
    }

    public static <T> GlobalResult<T> error(ResultCode code, String message){
        GlobalResult<T> result = new GlobalResult<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
