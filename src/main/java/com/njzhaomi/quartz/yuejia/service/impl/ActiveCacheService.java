package com.njzhaomi.quartz.yuejia.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.njzhaomi.quartz.yuejia.dao.ActiveCacheMapper;
import com.njzhaomi.quartz.yuejia.povo.ActiveCache;
import com.njzhaomi.quartz.yuejia.povo.Scheduler;
import com.njzhaomi.quartz.yuejia.service.IActiveCacheService;
import com.njzhaomi.quartz.yuejia.tools.JsonUtil;

@Service
public class ActiveCacheService implements IActiveCacheService {
	@Autowired
	private RedisCacheService redisCacheService;

	@Autowired
	private ActiveCacheMapper activeCacheMapper;

	@Override
	public void deleteAll() {
		activeCacheMapper.deleteAll();
	}

	@Override
	public void activeData(String d, String tm) {
		ActiveCache mp = activeCacheMapper.activeData(d, tm);
		try {
			mp.setStarttime(new SimpleDateFormat("yyyy-MM-dd").parse(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		activeCacheMapper.insert(mp);
	}

	@Override
	public void scheduler() {
		System.out.println("开始执行定时任务");
		List<Map<String, String>> schedulerList = activeCacheMapper.scheduler();
		int size = schedulerList.size();
		Scheduler schedulerInfo = null;
		 List<Scheduler> pojos = new ArrayList<Scheduler>();
		for (int i = 0; i < size; i++) {
			Map<String, String> schedulerMap = schedulerList.get(i);
			schedulerInfo = new Scheduler();
			schedulerInfo.setEmpNum(String.valueOf(schedulerMap.get("num")));
			//schedulerInfo.setOrgLevelOneId(schedulerMap.get("orgLevelOneId").toString());
			schedulerInfo.setFdNum(String.valueOf(schedulerMap.get("totalprice")));
			schedulerInfo.setReadCount(String.valueOf(schedulerMap.get("totalReadCount")));
			schedulerInfo.setFd2Num(String.valueOf(schedulerMap.get("credits")));
			schedulerInfo.setCompanyName(String.valueOf(schedulerMap.get("orgLevelOne")));
			schedulerInfo.setFd1Num(String.valueOf(schedulerMap.get("vipCount")));
			pojos.add(schedulerInfo);
		}
		String dataJson =JsonUtil.toJsonString(pojos);
		redisCacheService.set("fourCheckTeamCore" ,dataJson, 2, TimeUnit.DAYS);
	}

}
