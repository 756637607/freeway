package com.system.freeway.model.analysis.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.analysis.dto.DecisionAnalysisDTO</li>
 * <li>创建时间 : 2021年06月10日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class DecisionAnalysisDTO implements Serializable{
    //不传是货类汇总，传具体货类则查具体货类，传全部货类是把所有货类都一一显示出来
    private String goodType;
    //不传是通道汇总，传具体通道则查具体通道，传全部通道是把所有通道都一一显示出来
    private String freewayName;
    //运量（不传则默认）、运距、周转量、载重量、车辆数
    private String sumColumnName;
    //出入（出渝入渝都显示出来）、出渝、入渝、整体（不传则默认即出渝入渝汇总在一起）
    private String direction;
}
