package com.system.freeway.model.analysis.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.analysis.vo.TableListPagesVO</li>
 * <li>创建时间 : 2021年05月25日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class TableListPagesVO implements Serializable{
    //记录总数
    private String total;
    //页码
    private String pageNum;
    //每页数量
    private int pageSize;
    //总页数
    private int pages;
    //数据
    List<TableListVO> list;
}