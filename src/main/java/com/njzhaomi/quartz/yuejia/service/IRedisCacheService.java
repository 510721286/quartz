package com.njzhaomi.quartz.yuejia.service;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author xiaoyong  
 * 后期会分布式 该接口以及实现会迁移到其他其他项目[非必要情况 不要扩展接口]
 *
 */
public interface IRedisCacheService {
	/**
	 * xiaoyong  
	 * @param key
	 * @param hashKey
	 * @param value
	 */
	void hset(String key, String hashKey, Object value);
	/**
	 * 
	 * @param key
	 * @param timeOut
	 * @param tu
	 */
	void setExpire(String key, Long timeOut, TimeUnit tu);
	/**
	 * 
	 * @param key
	 * @param value
	 * @param timeNum
	 * @param tu
	 */
	void set(String key, Object value, int timeNum, TimeUnit tu);
}
