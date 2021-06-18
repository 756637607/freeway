package com.system.freeway.model.analysis.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.analysis.dto.StructureDTO</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class StructureDTO implements Serializable{
    //开始日期
    private String startDate;
    //结束日期
    private String endDate;
    //货类
    private String goodType;
    //1查<200
    //2查200~800
    //3查>800
    private int distanceRange;
}
