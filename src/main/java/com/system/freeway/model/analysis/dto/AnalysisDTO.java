package com.system.freeway.model.analysis.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.analysis.dto.AnalysisDTO</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class AnalysisDTO implements Serializable{
    //不传是重庆汇总，传具体地市则查重庆具体地市，传全部地市则把所有地市一一显示出来
    private String chongqingCounty;
    //不传是全国汇总，传具体省份则查具体省份，传全部省份则把所有省份一一显示出来
    private String otherProvince;
    //不传是省份汇总，传具体地市则查具体地市，传全部地市则把所有地市一一显示出来
    private String otherCounty;
    //不传是货类汇总，传具体货类则查具体货类，传全部货类是把所有货类都一一显示出来
    private String goodType;
    //不传是通道汇总，传具体通道则查具体通道，传全部通道是把所有通道都一一显示出来
    private String freewayName;
    //运量（不传则默认）、运距、周转量、载重量、车辆数
    private String sumColumnName;
    //出入（不传则默认即出渝入渝都显示出来）、出渝、入渝、整体（出渝入渝汇总在一起）
    private String direction;
    //传则查具体日期，不传则查所有日期
    private String startDate;
    //传则查具体日期，不传则查所有日期
    private String endDate;
    //否-环比（不传则默认）、是-占比
    private String isSumDate;
}
