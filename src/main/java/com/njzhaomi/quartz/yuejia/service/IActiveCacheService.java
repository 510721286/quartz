package com.njzhaomi.quartz.yuejia.service;

public interface IActiveCacheService {
	
	public void activeData(String d, String tm);

	public void deleteAll();

	public void scheduler();
}
