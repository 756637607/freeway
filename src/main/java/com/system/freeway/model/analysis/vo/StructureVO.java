package com.system.freeway.model.analysis.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.analysis.vo.StructureVO</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class StructureVO implements Serializable{
    //日期
    private String date;
    //货类
    private String goodType;
    //运量（万吨）
    private String yunliang;
    //环比
    private String hb;
}