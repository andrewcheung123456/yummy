package com.yummy.common;

import lombok.Data;

/**
 * @author yeqc
 * @date 2022/3/28 21:54
 */
@Data
public class ApiResponse<T> {

    public static final Integer SUCCESS_CODE = 200;
    public static final Integer FAIL_CODE = 400;
    public static final String SUCCESS_MESSAGE = "success";
    public static final String FAIL_MESSAGE = "fail";
    /**
     * 返回状态码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    private ApiResponse() {
    }

    public static <T> ApiResponse<T> success() {
        ApiResponse<T> resultUtil = new ApiResponse<>();
        resultUtil.setCode(SUCCESS_CODE);
        resultUtil.setMessage(SUCCESS_MESSAGE);
        return resultUtil;
    }

    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> resultUtil = success();
        resultUtil.setData(data);
        return resultUtil;
    }

    public static <T> ApiResponse<T> success(String message, T data) {
        ApiResponse<T> resultUtil = success();
        resultUtil.setMessage(message);
        resultUtil.setData(data);
        return resultUtil;
    }

    public static <T> ApiResponse<T> success(Integer code, String message, T data) {
        ApiResponse<T> resultUtil = new ApiResponse<>();
        resultUtil.setCode(code);
        resultUtil.setMessage(message);
        resultUtil.setData(data);
        return resultUtil;
    }

    public static <T> ApiResponse<T> fail() {
        ApiResponse<T> resultUtil = new ApiResponse<>();
        resultUtil.setCode(FAIL_CODE);
        resultUtil.setMessage(FAIL_MESSAGE);
        return resultUtil;
    }

    public static <T> ApiResponse<T> fail(T data) {
        ApiResponse<T> resultUtil = fail();
        resultUtil.setData(data);
        return resultUtil;
    }

    public static <T> ApiResponse<T> fail(String message, T data) {
        ApiResponse<T> resultUtil = fail();
        resultUtil.setMessage(message);
        resultUtil.setData(data);
        return resultUtil;
    }

    public static <T> ApiResponse<T> fail(Integer code, String message) {
        ApiResponse<T> resultUtil = fail();
        resultUtil.setCode(code);
        resultUtil.setMessage(message);
        return resultUtil;
    }

    public static <T> ApiResponse<T> fail(Integer code, String message, T data) {
        ApiResponse<T> resultUtil = new ApiResponse<>();
        resultUtil.setCode(code);
        resultUtil.setMessage(message);
        resultUtil.setData(data);
        return resultUtil;
    }
}