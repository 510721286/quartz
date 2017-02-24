package com.njzhaomi.quartz.yuejia.dao;

import com.njzhaomi.quartz.yuejia.povo.CaseComment;
import com.njzhaomi.quartz.yuejia.povo.CaseCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseCommentMapper {
    int countByExample(CaseCommentExample example);

    int deleteByExample(CaseCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CaseComment record);

    int insertSelective(CaseComment record);

    List<CaseComment> selectByExample(CaseCommentExample example);

    CaseComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CaseComment record, @Param("example") CaseCommentExample example);

    int updateByExample(@Param("record") CaseComment record, @Param("example") CaseCommentExample example);

    int updateByPrimaryKeySelective(CaseComment record);

    int updateByPrimaryKey(CaseComment record);
}