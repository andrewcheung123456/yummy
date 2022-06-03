package com.yummy.config;

import com.yummy.common.ApiResponse;
import com.yummy.common.CustomException;
import com.yummy.enums.ExceptionEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * RestControllerAdvice，统一异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionConfig {

    /**
     * 业务异常处理
     *
     * @param e 业务异常
     * @return
     */
    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public ApiResponse exceptionHandler(CustomException e) {
        return ApiResponse.fail(e.getCode(), e.getErrorMsg());
    }

    /**
     * 未知异常处理
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResponse exceptionHandler(Exception e) {
        return ApiResponse.fail(ExceptionEnum.UNKNOWN.getCode(),
                ExceptionEnum.UNKNOWN.getMsg());
    }

    /**
     * 空指针异常
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ApiResponse exceptionHandler(NullPointerException e) {
        return ApiResponse.fail(ExceptionEnum.INTERNAL_SERVER_ERROR.getCode(),
                ExceptionEnum.INTERNAL_SERVER_ERROR.getMsg());
    }
}
