package com.njzhaomi.quartz.yuejia.tools;

import java.io.UnsupportedEncodingException;

import com.alibaba.fastjson.JSON;
/**
 * 
 * @author xiaoyong
 *
 */
public class JsonUtil {

	public static String toJsonString(Object obj) {
		return JSON.toJSONString(obj);
	}

	public static <T> T toObject(String json, Class<T> clazz) {
		return JSON.parseObject(json, clazz);
	}

	public static <T> T toObject(byte[] byteArray, Class<T> clazz) {
		return JSON.parseObject(byteArray, clazz);
	}
	
	public static Object toBoject(String json) {
		return JSON.parseObject(json);
	}

	public static byte[] toByteArray(Object obj) throws UnsupportedEncodingException {
		return JSON.toJSONBytes(obj);
	}
}
