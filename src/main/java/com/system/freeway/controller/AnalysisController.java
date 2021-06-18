package com.system.freeway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.system.freeway.model.analysis.dto.AnalysisDTO;
import com.system.freeway.model.analysis.dto.DecisionAnalysisDTO;
import com.system.freeway.model.analysis.dto.StructureDTO;
import com.system.freeway.model.analysis.dto.TableQueryDTO;
import com.system.freeway.model.common.vo.ResponseVO;
import com.system.freeway.service.AnalysisService;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.controller.AnalysisController</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */
@CrossOrigin(allowCredentials="true", allowedHeaders="*", methods={RequestMethod.GET,RequestMethod.POST}, origins="*")
@RestController
@RequestMapping("/analysis")
public class AnalysisController {
    
    @Autowired
    private AnalysisService studentService;
    
    @GetMapping("/getAnalysisInfo")
    public ResponseVO getAnalysisInfo(AnalysisDTO param){
        return studentService.getAnalysisInfo(param);
    }
    
    @GetMapping("/decisionAnalysis")
    public ResponseVO decisionAnalysis(DecisionAnalysisDTO param){
        return studentService.decisionAnalysis(param);
    }

    @GetMapping("/getCountyList")
    public ResponseVO getCountyList(String provinceName){
        return studentService.getCountyList(provinceName);
    }
    
    @GetMapping("/getTableList")
    public ResponseVO getTableList(TableQueryDTO param){
        return studentService.getTableList(param);
    }
    
    @GetMapping("/getStructureInfo")
    public ResponseVO getStructureInfo(StructureDTO param){
        return studentService.getStructureInfo(param);
    }
    //test
}
