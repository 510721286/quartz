package com.njzhaomi.quartz.yuejia.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CaseAcctMapperMapper {
	/**
	 * identity 标识  根据标识不同统计不同的结果
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	List<Map<String, Integer>> loadData(@Param("beginDate") String beginDate, @Param("endDate")String endDate,@Param("identity") String identity );
	/**
	 *  标识  根据标识不同统计不同的结果
	 * @param beginDate
	 * @param endDate
	 * @param identity
	 * @return
	 */
	List<Map<String, Integer>> loadPart(@Param("beginDate") String beginDate, @Param("endDate")String endDate,@Param("identity") String identity );
}
