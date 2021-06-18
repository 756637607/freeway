package com.system.freeway.model.common.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.common.vo.ResponseVO</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class ResponseVO<T> implements Serializable {

    /**
     * 请求成功
     */
    public static final Integer REQ_OK = 200;
    /**
     * 请求错误
     */
    public static final Integer REQ_ERROR = 300;

    /**
     * code码
     */
    private Integer status;
    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 创建返回对象
     * @param <T> T
     * @return ResponseVO
     */
    public static <T> ResponseVO<T> create() {
        return new ResponseVO<>();
    }

    /**
     * 成功
     * @return ResponseVO
     */
    public ResponseVO<T> success() {
        this.setStatus(REQ_OK);
        this.setMessage("操作成功");
        return this;
    }

    /**
     * 成功
     * @return ResponseVO
     */
    public ResponseVO<T> success(String message) {
        this.setStatus(REQ_OK);
        this.setMessage(message);
        return this;
    }

    /**
     * 成功
     * @param data 数据data
     * @return ResponseVO
     */
    public ResponseVO<T> success(T data) {
        this.setStatus(REQ_OK);
        this.setData(data);
        this.setMessage("成功");
        return this;
    }

    /**
     * 失败
     * @return ResponseVO
     */
    public ResponseVO<T> fail() {
        this.setStatus(REQ_ERROR);
        this.setMessage("操作失败");
        return this;
    }

    /**
     * 失败
     * @param message 失败message
     * @return ResponseVO
     */
    public ResponseVO<T> fail(String message) {
        this.setStatus(REQ_ERROR);
        this.setMessage(message);
        return this;
    }

    /**
     * 失败
     * @param code 失败code
     * @param message 失败message
     * @return ResponseVO
     */
    public ResponseVO<T> fail(Integer code, String message) {
        this.setStatus(code);
        this.setMessage(message);
        return this;
    }
}
