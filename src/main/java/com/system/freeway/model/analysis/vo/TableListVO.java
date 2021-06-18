package com.system.freeway.model.analysis.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.analysis.vo.TableListVO</li>
 * <li>创建时间 : 2021年05月24日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class TableListVO implements Serializable{
    //记录总数
    private int total;
    //入口地市
    private String inCounty;
    //入口省份
    private String inProvince;
    //入口时间
    private String inTime;
    //出口地市
    private String outCounty;
    //出口省份
    private String outProvince;
    //出口时间
    private String outTime;
    //货运量
    private String yunliang;
    //平均运距
    private String yunju;
    //平均速度
    private String speed;
    //货类
    private String goodType;
}