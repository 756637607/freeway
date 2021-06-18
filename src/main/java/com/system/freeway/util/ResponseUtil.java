package com.system.freeway.util;

import java.io.Serializable;

import com.system.freeway.model.common.vo.PageInfoVO;
import com.system.freeway.model.common.vo.ResponseVO;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.ResponseUtil</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */
public class ResponseUtil implements Serializable{

    /**
     * 分页成功对象
     * @param <T> 泛型对象
     * @return PageInfoVO
     */
    public static <T> PageInfoVO<T> successPageInfo() {
        return PageInfoVO.<T>createPageInfo().successPageInfo();
    }

    /**
     * 成功
     * @param <T> 泛型对象
     * @return ResponseVO
     */
    public static <T> ResponseVO<T> success() {
        return ResponseVO.<T>create().success();
    }

    /**
     * 成功
     * @param message 成功消息
     * @param <T> 泛型对象
     * @return ResponseVO
     */
    public static <T> ResponseVO<T> success(String message) {
        return ResponseVO.<T>create().success(message);
    }

    /**
     * 成功
     * @param data 数据data
     * @param <T> 泛型对象
     * @return ResponseVO
     */
    public static <T> ResponseVO<T> success(T data) {
        return ResponseVO.<T>create().success(data);
    }

    /**
     * 失败
     * @param <T> 泛型对象
     * @return ResponseVO
     */
    public static <T> ResponseVO<T> fail() {
        return ResponseVO.<T>create().fail();
    }

    /**
     * 失败
     * @param message 失败消息
     * @param <T> 泛型对象
     * @return ResponseVO
     */
    public static <T> ResponseVO<T> fail(String message) {
        return ResponseVO.<T>create().fail(message);
    }

    /**
     * 失败
     * @param code 失败code
     * @param message 失败消息
     * @param <T> 泛型对象
     * @return ResponseVO
     */
    public static <T> ResponseVO<T> fail(Integer code, String message) {
        return ResponseVO.<T>create().fail(code, message);
    }
}
