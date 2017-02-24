package com.njzhaomi.quartz.yuejia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njzhaomi.quartz.yuejia.dao.CaseCommentMapper;
import com.njzhaomi.quartz.yuejia.povo.CaseComment;
import com.njzhaomi.quartz.yuejia.povo.CaseCommentExample;
import com.njzhaomi.quartz.yuejia.service.ICaseCommentService;

/**
 * 
 * @author xiaoyong
 *
 */
@Service
public class CaseCommentService implements ICaseCommentService {

	@Autowired
	private CaseCommentMapper caseCommentMapper;

	@Override
	public List<CaseComment> loadPart(Long id) {
		CaseCommentExample example = new CaseCommentExample();
		example.or().andCaseidEqualTo(id.intValue());
		List<CaseComment> list = caseCommentMapper.selectByExample(example);
		return list;
	}

}
