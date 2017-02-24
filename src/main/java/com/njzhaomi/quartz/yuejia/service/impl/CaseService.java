package com.njzhaomi.quartz.yuejia.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njzhaomi.quartz.yuejia.dao.CaseMapper;
import com.njzhaomi.quartz.yuejia.povo.Case;
import com.njzhaomi.quartz.yuejia.povo.CaseExample;
import com.njzhaomi.quartz.yuejia.service.ICaseService;

/**
 * 
 * @author xiaoyong
 *
 */
@Service
public class CaseService implements ICaseService {
	@Autowired
	private CaseMapper caseMapper;

	@Override
	public List<Case> loadPart(String appID) {
		List<Case> listInfo = caseMapper.page(appID);
		return listInfo;
	}

	@Override
	public void updateCase(Long id, Integer point, Integer read, Integer share, Integer join, Integer commentTimes) {
		Case caseInfo = caseMapper.selectByPrimaryKey(id);
		caseInfo.setReadcnt(read);
		caseInfo.setSharecnt(share);
		caseInfo.setJoincnt(join);
		caseInfo.setPoint(point);
		caseInfo.setCommentcnt(commentTimes);
		caseMapper.updateByPrimaryKey(caseInfo);

	}

	@Override
	public void executeUpdate() {
		CaseExample example = new CaseExample();
		example.createCriteria().andCasestatusEqualTo(1).andDdateLessThanOrEqualTo(new Date());
		List<Case> list = caseMapper.selectByExample(example);
		if (null != list && !list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				Case caseInfo = list.get(i);
				caseInfo.setCasestatus(0);
				caseMapper.updateByPrimaryKey(list.get(i));
			}
		}

	}

}
