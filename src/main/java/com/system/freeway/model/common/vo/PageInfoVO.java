package com.system.freeway.model.common.vo;

import lombok.Data;


/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.common.vo.PageInfoVO</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */
@Data
public class PageInfoVO<T> extends ResponseVO {

    /**
     * 当前页
     */
    private int pageNum;

    /**
     * 每页的数量
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int pages;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 创建返回对象
     * @param <T> T
     * @return ResponseVO
     */
    public static <T> PageInfoVO<T> createPageInfo() {
        return new PageInfoVO<>();
    }

    /**
     * 成功
     * @return ResponseVO
     */
    public PageInfoVO<T> successPageInfo() {
        this.setStatus(REQ_OK);
        this.setMessage("操作成功");
        return this;
    }
}
