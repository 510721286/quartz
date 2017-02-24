package com.njzhaomi.quartz.yuejia.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njzhaomi.quartz.yuejia.constants.Constants;
import com.njzhaomi.quartz.yuejia.dao.CaseAcctMapperMapper;
import com.njzhaomi.quartz.yuejia.service.ICaseAcctService;

/**
 * 
 * @ClassName: CaseAcctService
 * @author: xiaoyong
 * @date: 2016年11月8日 下午7:32:47
 */
@Service
public class CaseAcctService implements ICaseAcctService {

	@Autowired
	private CaseAcctMapperMapper caseAcctMapperMapper;

	@Autowired
	private RedisCacheService redisCacheService;

	@Override
	public void extension() {
		List<Integer> list = identity();
		for (int i = 0; i < list.size(); i++) {
			String identity = String.valueOf(list.get(i));
			List<Map<String, Integer>> dataList = caseAcctMapperMapper.loadData(date()[0], date()[1], identity);
			if (null != dataList && !dataList.isEmpty()) {
				redisCacheService.set("rankPojos3" + identity, dataList, 1, TimeUnit.DAYS);
			}
			List<Map<String, Integer>> partDataList = caseAcctMapperMapper.loadPart(date()[0], date()[1], identity);
			if (null != partDataList && !partDataList.isEmpty()) {
				redisCacheService.set("rankPojos2" + identity, partDataList, 1, TimeUnit.DAYS);
			}
		}
	}

	/**
	 * 
	 * @return date[]
	 */
	private String[] date() {
		String startDate = Constants.TOP_START_DATE;
		// 获取当前时间
		String endDate = new SimpleDateFormat("yyyy-M-d").format(new Date());
		String arrayDate[] = { startDate, endDate };
		return arrayDate;
	}

	/**
	 * 
	 * @return identity[]
	 */
	private List<Integer> identity() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(Constants.COMPANYID_FIVE);
		list.add(Constants.COMPANYID_SIX);
		return list;
	}

}
