package com.stu.forum.core.result;

import lombok.Getter;

@Getter
public enum ResultCode {

    SUCCESS(0),
    INVALID_PARAM(10000),
    ;

    private final int code;


    ResultCode(int code) {
        this.code = code;
    }

}
