package com.system.freeway.model.common.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;

import lombok.Data;

/**
 * <ul>
 * <li>文件名称 : com.system.freeway.model.common.dto.PageDTO</li>
 * <li>创建时间 : 2021年05月08日</li>
 * <li>描    述 : 
 * <p>
 * </ul>
 *
 * @author TangFan
 * @version 1.0.0
 */

@Data
public class PageDTO implements Serializable{

	//页码
	@Min(1)
    private int pageNum = 1;

    //每页条数
    @Min(2)
    private int pageSize = 2;
}
