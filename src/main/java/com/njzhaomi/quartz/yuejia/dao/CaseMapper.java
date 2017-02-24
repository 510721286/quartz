package com.njzhaomi.quartz.yuejia.dao;

import com.njzhaomi.quartz.yuejia.povo.Case;
import com.njzhaomi.quartz.yuejia.povo.CaseExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseMapper {
    int countByExample(CaseExample example);

    int deleteByExample(CaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Case record);

    int insertSelective(Case record);

    List<Case> selectByExample(CaseExample example);

    Case selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Case record, @Param("example") CaseExample example);

    int updateByExample(@Param("record") Case record, @Param("example") CaseExample example);

    int updateByPrimaryKeySelective(Case record);

    int updateByPrimaryKey(Case record);
    
    List<Case> page(@Param("appID") String appID);
}