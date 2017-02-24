package com.njzhaomi.quartz.yuejia.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.njzhaomi.quartz.yuejia.povo.ActiveCache;
import com.njzhaomi.quartz.yuejia.povo.ActiveCacheExample;

public interface ActiveCacheMapper {
	int countByExample(ActiveCacheExample example);

	int deleteByExample(ActiveCacheExample example);

	int deleteByPrimaryKey(Long id);

	int insert(ActiveCache record);

	int insertSelective(ActiveCache record);

	List<ActiveCache> selectByExample(ActiveCacheExample example);

	ActiveCache selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") ActiveCache record, @Param("example") ActiveCacheExample example);

	int updateByExample(@Param("record") ActiveCache record, @Param("example") ActiveCacheExample example);

	int updateByPrimaryKeySelective(ActiveCache record);

	int updateByPrimaryKey(ActiveCache record);

	void deleteAll();

	Map<String, Object> sqlInfo(@Param("d") String d, @Param("tm") String tm);

	Map<String, Object> sqlInfo1(@Param("d") String d, @Param("tm") String tm);

	Map<String, Object> sqlInfo2(@Param("d") String d, @Param("tm") String tm);

	Map<String, Object> sqlInfo3(@Param("d") String d, @Param("tm") String tm);

	Map<String, Object> sqlInfo4(@Param("d") String d, @Param("tm") String tm);

	Map<String, Object> sqlInfo5(@Param("d") String d, @Param("tm") String tm);

	Map<String, Object> productBrowse(@Param("d") String d, @Param("tm") String tm);

	Map<String, Object> withdrawalSql(@Param("d") String d, @Param("tm") String tm);

	ActiveCache activeData(@Param("d") String d, @Param("tm") String tm);

	List<Map<String, String>> scheduler();
	
}