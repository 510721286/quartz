package com.njzhaomi.quartz.yuejia.service;

import java.util.List;
import java.util.Map;

import com.njzhaomi.quartz.yuejia.povo.ExtendCaseAcct;

public interface IExtendCaseAcctService {
	

	public List<ExtendCaseAcct> loadPart(Long id);
	
	public Map<String,Object> loadCont(Long caseId);
	//统计
	public List<Map<String,Object>> loadSum();

}
