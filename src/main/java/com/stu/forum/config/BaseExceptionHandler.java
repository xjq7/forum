package com.stu.forum.config;

import com.stu.forum.core.result.GlobalResult;
import com.stu.forum.core.result.ResultCode;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Object handler, Exception exception){
        GlobalResult<ResultCode> result = new GlobalResult<>();

        if (isAjax(request)) {
            if(exception instanceof UnauthenticatedException){
                result = new GlobalResult<>(ResultCode.UNAUTHENTICATED);
            }

            return result;
        }
        return result;
    }

    private boolean isAjax(HttpServletRequest request) {
        String requestedWith = request.getHeader("x-requested-with");
        if ("XMLHttpRequest".equalsIgnoreCase(requestedWith)) {
            return true;
        }
        String contentType = request.getContentType();
        return StringUtils.isNotBlank(contentType) && contentType.contains("application/json");
    }


}
