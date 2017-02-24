package com.njzhaomi.quartz.yuejia.service.impl;

import java.util.concurrent.TimeUnit;
import com.alibaba.fastjson.JSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.njzhaomi.quartz.yuejia.service.IRedisCacheService;

/**
 * 
 * @author xiaoyong 
 * 暂时不要扩展方法 后期会手动实现二级session缓存 三级factiory缓存 来缓存优化redis缓存
 * 
 *
 */
@Service
public class RedisCacheService implements IRedisCacheService {

	@Autowired
	private RedisTemplate<String, String> redistemplate;

	@Override
	public void hset(String key, String hashKey, Object value) {
		// 暂时不提供实现

	}

	@Override
	public void setExpire(String key, Long timeOut, TimeUnit tu) {
		// 暂时不提供实现
	}

	@Override
	public void set(String key, Object value, int timeNum, TimeUnit tu) {
		redistemplate.opsForValue().set(key, JSON.toJSONString(value), timeNum, tu);
	}

}
