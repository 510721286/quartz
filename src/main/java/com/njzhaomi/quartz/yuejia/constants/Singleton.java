package com.njzhaomi.quartz.yuejia.constants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author xiaoyong
 * 单例
 */
public class Singleton {
	private static Singleton instance = new Singleton();
	private  Map<Integer,List<Object[]>> map = new HashMap<Integer,List<Object[]>>();

	public Map<Integer, List<Object[]>> getMap() {
		return map;
	}

	public void setMap(Map<Integer, List<Object[]>> map) {
		this.map = map;
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
