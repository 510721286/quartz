package com.njzhaomi.quartz.yuejia.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.njzhaomi.quartz.yuejia.povo.ExtendCaseAcct;
import com.njzhaomi.quartz.yuejia.povo.ExtendCaseAcctExample;

public interface ExtendCaseAcctMapper {
    int countByExample(ExtendCaseAcctExample example);

    int deleteByExample(ExtendCaseAcctExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExtendCaseAcct record);

    int insertSelective(ExtendCaseAcct record);

    List<ExtendCaseAcct> selectByExample(ExtendCaseAcctExample example);

    ExtendCaseAcct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExtendCaseAcct record, @Param("example") ExtendCaseAcctExample example);

    int updateByExample(@Param("record") ExtendCaseAcct record, @Param("example") ExtendCaseAcctExample example);

    int updateByPrimaryKeySelective(ExtendCaseAcct record);

    int updateByPrimaryKey(ExtendCaseAcct record);
    
    Map<String,Object> loadCont(long caseid);
    
    List<Map<String,Object>> loadSum();
}