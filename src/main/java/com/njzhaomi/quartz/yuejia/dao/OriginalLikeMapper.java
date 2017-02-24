package com.njzhaomi.quartz.yuejia.dao;

import com.njzhaomi.quartz.yuejia.povo.OriginalLike;
import com.njzhaomi.quartz.yuejia.povo.OriginalLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OriginalLikeMapper {
    int countByExample(OriginalLikeExample example);

    int deleteByExample(OriginalLikeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OriginalLike record);

    int insertSelective(OriginalLike record);

    List<OriginalLike> selectByExample(OriginalLikeExample example);

    OriginalLike selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OriginalLike record, @Param("example") OriginalLikeExample example);

    int updateByExample(@Param("record") OriginalLike record, @Param("example") OriginalLikeExample example);

    int updateByPrimaryKeySelective(OriginalLike record);

    int updateByPrimaryKey(OriginalLike record);
}