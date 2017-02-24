package com.njzhaomi.quartz.yuejia.dao;

import com.njzhaomi.quartz.yuejia.povo.ContentBusiness;
import com.njzhaomi.quartz.yuejia.povo.ContentBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentBusinessMapper {
    int countByExample(ContentBusinessExample example);

    int deleteByExample(ContentBusinessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContentBusiness record);

    int insertSelective(ContentBusiness record);

    List<ContentBusiness> selectByExample(ContentBusinessExample example);

    ContentBusiness selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContentBusiness record, @Param("example") ContentBusinessExample example);

    int updateByExample(@Param("record") ContentBusiness record, @Param("example") ContentBusinessExample example);

    int updateByPrimaryKeySelective(ContentBusiness record);

    int updateByPrimaryKey(ContentBusiness record);
    
    List<ContentBusiness> selectAll();
}