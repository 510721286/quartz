package com.njzhaomi.quartz.yuejia.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.njzhaomi.quartz.yuejia.povo.Case;
/**
 * 
 * @author xiaoyong
 *
 */
public interface ICaseService {

	public List<Case> loadPart(String appID);
	
	@Transactional
	public void updateCase(Long id,Integer point,Integer read,Integer share,Integer join,Integer commentTimes); 
	
	@Transactional
	public void executeUpdate();
}
