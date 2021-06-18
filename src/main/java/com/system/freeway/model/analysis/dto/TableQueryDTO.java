package com.system.freeway.model.analysis.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.analysis.dto.TableQueryDTO</li>
 * <li>创建时间 : 2021年05月24日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class TableQueryDTO implements Serializable{
    //开始日期
    private String startDate;
    //结束日期
    private String endDate;
    //起点省份
    private String startProvince;
    //起点地市
    private String startCounty;
    //终点省份
    private String endProvince;
    //终点地市
    private String endCounty;
    //货类
    private String goodType;
    //页码
    private String pageNum;
    //每页数量
    private int pageSize;
}
