package com.mini.miniServer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mini.miniServer.domain.Common;
import com.mini.miniServer.dto.response.PageRes;

@Mapper
public interface CommonMapper { 
    int saveCommon(Common common);
	
	List<Common> findAllCommon();
	
	PageRes<Common> findAllCommonCount();
}
