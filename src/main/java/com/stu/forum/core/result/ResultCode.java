package com.stu.forum.core.result;

import lombok.Getter;

@Getter
public enum ResultCode {
    SUCCESS(0, "SUCCESS"),
    UNAUTHENTICATED(401, "签名错误"),
    ;

    private final int code;
    private final String message;


    ResultCode(int code,String message) {
        this.code = code;
        this.message = message;
    }
}
