package com.system.freeway.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.system.freeway.mapper.AnalysisMapper;
import com.system.freeway.model.analysis.dto.AnalysisDTO;
import com.system.freeway.model.analysis.dto.DecisionAnalysisDTO;
import com.system.freeway.model.analysis.dto.StructureDTO;
import com.system.freeway.model.analysis.dto.TableQueryDTO;
import com.system.freeway.model.analysis.vo.TableListVO;
import com.system.freeway.model.common.vo.PageInfoVO;
import com.system.freeway.model.common.vo.ResponseVO;
import com.system.freeway.service.AnalysisService;
import com.system.freeway.util.ResponseUtil;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.service.impl.AnalysisServiceImpl</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */
@Service
public class AnalysisServiceImpl implements AnalysisService {

    @Autowired
    private AnalysisMapper analysisMapper;

    @Override
    public ResponseVO getAnalysisInfo(AnalysisDTO param) {
        return ResponseUtil.success(analysisMapper.getAnalysisInfo(param));
    }
    
    @Override
    public ResponseVO decisionAnalysis(DecisionAnalysisDTO param) {
        return ResponseUtil.success(analysisMapper.decisionAnalysis(param));
    }
    
    @Override
    public ResponseVO getCountyList(String provinceName) {
        return ResponseUtil.success(analysisMapper.getCountyList(provinceName));
    }
    
    @Override
    public ResponseVO getTableList(TableQueryDTO param){
        List<TableListVO> list = analysisMapper.getTableList(param);
        PageInfo<TableListVO> pageInfo = new PageInfo<>(list);
        // copy数据
        PageInfoVO pageInfoVO = ResponseUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        pageInfoVO.setTotal(list.size()==0?0:list.get(0).getTotal());
        return pageInfoVO;
    }
    
    @Override
    public ResponseVO getStructureInfo(StructureDTO param) {
        return ResponseUtil.success(analysisMapper.getStructureInfo(param));
    }
}
