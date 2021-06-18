package com.system.freeway.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.system.freeway.model.analysis.dto.AnalysisDTO;
import com.system.freeway.model.analysis.dto.DecisionAnalysisDTO;
import com.system.freeway.model.analysis.dto.StructureDTO;
import com.system.freeway.model.analysis.dto.TableQueryDTO;
import com.system.freeway.model.analysis.vo.AnalysisVO;
import com.system.freeway.model.analysis.vo.StructureVO;
import com.system.freeway.model.analysis.vo.TableListVO;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.mapper.AnalysisMapper</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */
@Mapper
public interface AnalysisMapper {

    List<AnalysisVO> getAnalysisInfo(AnalysisDTO param);
    
    List<AnalysisVO> decisionAnalysis(DecisionAnalysisDTO param);
    
    List<Map<String,String>> getCountyList(String provinceName);
    
    List<TableListVO> getTableList(TableQueryDTO param);
    
    List<StructureVO> getStructureInfo(StructureDTO param);
}
