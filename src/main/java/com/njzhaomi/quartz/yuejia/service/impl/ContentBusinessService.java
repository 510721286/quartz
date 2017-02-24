package com.njzhaomi.quartz.yuejia.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njzhaomi.quartz.yuejia.dao.CaseCommentMapper;
import com.njzhaomi.quartz.yuejia.dao.CaseGratuityMapper;
import com.njzhaomi.quartz.yuejia.dao.ContentBusinessMapper;
import com.njzhaomi.quartz.yuejia.dao.OriginalLikeMapper;
import com.njzhaomi.quartz.yuejia.povo.CaseComment;
import com.njzhaomi.quartz.yuejia.povo.CaseCommentExample;
import com.njzhaomi.quartz.yuejia.povo.CaseGratuityExample;
import com.njzhaomi.quartz.yuejia.povo.ContentBusiness;
import com.njzhaomi.quartz.yuejia.povo.ContentBusinessExample;
import com.njzhaomi.quartz.yuejia.povo.OriginalLikeExample;
import com.njzhaomi.quartz.yuejia.service.ICaseService;
import com.njzhaomi.quartz.yuejia.service.IContentBusinessService;
import com.njzhaomi.quartz.yuejia.service.IExtendCaseAcctService;

@Service
public class ContentBusinessService implements IContentBusinessService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ContentBusinessService.class);
	@Autowired
	private ContentBusinessMapper contentBusinessMapper;
	@Autowired
	private OriginalLikeMapper originalLikeMapper;
	@Autowired
	private CaseGratuityMapper caseGratuityMapper;

	@Autowired
	private CaseCommentMapper caseCommentMapper;

	@Autowired
	private ICaseService caseService;

	// @Autowired
	// private ExtendCaseAcctMapper extendCaseAcctMapper;

	@Autowired
	private IExtendCaseAcctService extendCaseAcctService;

	// @Override
	// public void contentBusiness() {
	//
	// String appID = Constants.APP_ID;
	// List<Case> cases = caseService.loadPart(appID);
	// // List<ContentBusiness> list = contentBusinessMapper.selectAll();
	// for (Case c : cases) {
	// ContentBusiness contentBusinessInfo = new ContentBusiness();
	// Long id = c.getId();
	// Map<String,Object> map = extendCaseAcctService.loadCont(id);
	// //List<ExtendCaseAcct> list = extendCaseAcctService.loadPart(id);
	//// if (list.isEmpty()|| null==list){
	//// continue;
	//// }
	// int read = 0 , share = 0;
	// try{
	// read = Integer.parseInt(map.get("readcnt").toString());// 阅读
	// share = Integer.parseInt(map.get("sharecnt").toString());// 转发
	//
	// }catch(Exception e){
	// LOGGER.error("错误信息e="+e.getMessage());
	// }
	//// for (ExtendCaseAcct ca : list) {
	//// read += ca.getReadcnt();
	//// share += ca.getSharecnt();
	//// }
	// contentBusinessInfo.setEntityId(id.intValue());
	// comment(id,contentBusinessInfo);
	// //contentBusinessInfo.setCommentCount(comment(id));//评论数
	// contentBusinessInfo.setReadCount(read);// 阅读
	// contentBusinessInfo.setShareCount(share);// 分享
	// //contentBusinessInfo.setEntity(list.get(0).getEntity());
	// calculationR(contentBusinessInfo);
	// calculationGratuity(contentBusinessInfo);
	// saveOrUpdate(contentBusinessInfo);
	// }
	//
	// }
	// 评论数
	private void comment(ContentBusiness contentBusinessInfo) {
		CaseCommentExample example = new CaseCommentExample();
		example.createCriteria().andCaseidEqualTo(contentBusinessInfo.getEntityId()).andEntityEqualTo(contentBusinessInfo.getEntity());
		List<CaseComment> listInfo = caseCommentMapper.selectByExample(example);
		contentBusinessInfo.setCommentCount(listInfo.size());
		if (!listInfo.isEmpty()) {
			contentBusinessInfo.setEntity(listInfo.get(0).getEntity());
		}
	}

	// 喜好
	private void calculationR(ContentBusiness contentBusiness) {
		OriginalLikeExample example = new OriginalLikeExample();
		example.createCriteria().andStatusEqualTo(1).andEntityEqualTo(contentBusiness.getEntity())
				.andCaseidEqualTo((long) contentBusiness.getEntityId());
		int size = originalLikeMapper.countByExample(example);
		contentBusiness.setLikeCount(size);
	}

	// 打赏
	private void calculationGratuity(ContentBusiness contentBusiness) {
		CaseGratuityExample example = new CaseGratuityExample();
		example.createCriteria().andStatusEqualTo(1).andCaseIdEqualTo(contentBusiness.getEntityId());
		int size = caseGratuityMapper.countByExample(example);
		contentBusiness.setGratuityCount(size);
	}

	private void saveOrUpdate(ContentBusiness contentBusiness) {
		ContentBusinessExample example = new ContentBusinessExample();
		example.createCriteria().andEntityEqualTo(contentBusiness.getEntity())
				.andEntityIdEqualTo(contentBusiness.getEntityId());
		List<ContentBusiness> list = contentBusinessMapper.selectByExample(example);
		if (!list.isEmpty() && null != list) {
			contentBusiness.setId(list.get(0).getId());
			contentBusinessMapper.updateByPrimaryKey(contentBusiness);
		} else {
			contentBusinessMapper.insert(contentBusiness);
		}
	}

	@Override
	public void contentBusiness() {
		List<Map<String, Object>> list = extendCaseAcctService.loadSum();
		ContentBusiness contentBusinessInfo=null;
		for (int i = 0; i < list.size(); i++) {
			Map<String,Object> map = list.get(i);
			contentBusinessInfo = new ContentBusiness();
			contentBusinessInfo.setShareCount(Integer.parseInt(map.get("sharecnt").toString()));
			contentBusinessInfo.setReadCount(Integer.parseInt(map.get("readcnt").toString()));
			contentBusinessInfo.setEntityId(Integer.parseInt(map.get("caseid").toString()));
			contentBusinessInfo.setEntity(map.get("entity").toString());
			calculationR(contentBusinessInfo);
			calculationGratuity(contentBusinessInfo);
			comment(contentBusinessInfo);
			saveOrUpdate(contentBusinessInfo);
		}

	}


}
