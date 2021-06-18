package com.system.freeway.model.analysis.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.analysis.vo.AnalysisVO</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class AnalysisVO implements Serializable{
    //方向
    private String direction;
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
    //通道
    private String freewayName;
    //日期
    private String date;
    //运量（万吨）
    private String yunliang;
    //平均运距（km）
    private String yunju;
    //货运周转量
    private String zhouzhuan;
    //日均单车载重量（吨/车）
    private String zaizhong;
    //车辆数
    private String carnum;
    //环比
    private String hb;
    //占比
    private String zb;
}