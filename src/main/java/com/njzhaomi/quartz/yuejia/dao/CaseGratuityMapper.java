package com.njzhaomi.quartz.yuejia.dao;

import com.njzhaomi.quartz.yuejia.povo.CaseGratuity;
import com.njzhaomi.quartz.yuejia.povo.CaseGratuityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseGratuityMapper {
    int countByExample(CaseGratuityExample example);

    int deleteByExample(CaseGratuityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CaseGratuity record);

    int insertSelective(CaseGratuity record);

    List<CaseGratuity> selectByExample(CaseGratuityExample example);

    CaseGratuity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CaseGratuity record, @Param("example") CaseGratuityExample example);

    int updateByExample(@Param("record") CaseGratuity record, @Param("example") CaseGratuityExample example);

    int updateByPrimaryKeySelective(CaseGratuity record);

    int updateByPrimaryKey(CaseGratuity record);
}