package com.njzhaomi.quartz.yuejia.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njzhaomi.quartz.yuejia.dao.ExtendCaseAcctMapper;
import com.njzhaomi.quartz.yuejia.povo.ExtendCaseAcct;
import com.njzhaomi.quartz.yuejia.povo.ExtendCaseAcctExample;
import com.njzhaomi.quartz.yuejia.service.IExtendCaseAcctService;
/**
 * 
 * @author xiaoyong
 *
 */
@Service
public class ExtendCaseAcctService implements IExtendCaseAcctService{

	@Autowired
	private ExtendCaseAcctMapper  extendCaseAcctMapper;
	
	@Override
	public List<ExtendCaseAcct> loadPart(Long id) {
		ExtendCaseAcctExample example =  new ExtendCaseAcctExample();
		example.or().andCaseidEqualTo(id.intValue());
		List<ExtendCaseAcct> list = extendCaseAcctMapper.selectByExample(example);
		return list;
	}

	@Override
	public Map<String,Object> loadCont(Long id) {
		return extendCaseAcctMapper.loadCont(id);
	}

	@Override
	public List<Map<String, Object>> loadSum() {
		return extendCaseAcctMapper.loadSum();
	}
	
}
