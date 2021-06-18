package com.system.freeway.service;

import com.system.freeway.model.analysis.dto.AnalysisDTO;
import com.system.freeway.model.analysis.dto.DecisionAnalysisDTO;
import com.system.freeway.model.analysis.dto.StructureDTO;
import com.system.freeway.model.analysis.dto.TableQueryDTO;
import com.system.freeway.model.common.vo.ResponseVO;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.service.AnalysisService</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */
public interface AnalysisService {

    ResponseVO getAnalysisInfo(AnalysisDTO param);
    
    ResponseVO decisionAnalysis(DecisionAnalysisDTO param);
    
    ResponseVO getCountyList(String provinceName);
    
    ResponseVO getTableList(TableQueryDTO param);
    
    ResponseVO getStructureInfo(StructureDTO param);
}
