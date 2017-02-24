package com.njzhaomi.quartz.yuejia.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.njzhaomi.quartz.yuejia.constants.Constants;
import com.njzhaomi.quartz.yuejia.povo.Case;
import com.njzhaomi.quartz.yuejia.povo.CaseComment;
import com.njzhaomi.quartz.yuejia.povo.ExtendCaseAcct;
import com.njzhaomi.quartz.yuejia.service.IActiveCacheService;
import com.njzhaomi.quartz.yuejia.service.ICaseAcctService;
import com.njzhaomi.quartz.yuejia.service.ICaseService;
import com.njzhaomi.quartz.yuejia.service.IContentBusinessService;
import com.njzhaomi.quartz.yuejia.service.IExtendCaseAcctService;
import com.njzhaomi.quartz.yuejia.service.impl.CaseCommentService;

/**
 * 
 * @author xiaoyong
 *
 */
@Component
public class Quartz {
	private static final Logger LOGGER = LoggerFactory.getLogger(Quartz.class);

	@Autowired
	private ICaseAcctService caseAcctService;

	@Autowired
	private ICaseService caseService;

	@Autowired
	private CaseCommentService caseCommentService;

	@Autowired
	private IExtendCaseAcctService extendCaseAcctService;

	//@Autowired
	//private ActiveCacheMapper activeCacheMapper;

	@Autowired
	private IActiveCacheService activeCacheService;
	
	@Autowired
	private  IContentBusinessService contentBusinessService;

	/**
	 * 小美讲这个功能不需要了
	 */
	// @Scheduled(cron = "0 */1 * * * ?")
	public void trunkReport() {
		LOGGER.info("龙虎榜定时任务开始");
		caseAcctService.extension();
		LOGGER.info("龙虎榜定时任务结束");
	}

	// @Scheduled(cron="0 */20 * * * ?")
	public void updateJob() {
		LOGGER.info("更新文章阅读量开始");
		String appID = Constants.APP_ID;
		List<Case> cases = caseService.loadPart(appID);
		for (Case c : cases) {
			Long id = c.getId();
			// 更新阅读量
			try {
				List<ExtendCaseAcct> list = extendCaseAcctService.loadPart(id);
				Integer point = 0;// 累计发放积分
				Integer read = 0;// 阅读
				Integer share = 0;// 转发
				Integer join = 0;// 报名次数
				for (ExtendCaseAcct ca : list) {
					point += ca.getPoint();
					read += ca.getReadcnt();
					share += ca.getSharecnt();
					join += ca.getJoincnt();
				}
				LOGGER.info("文章阅读量、转发量获取，read:" + read + ",share：" + share + ",caseId:" + id);
				Integer commentTimes = 0;// 评论量
				List<CaseComment> commentList = caseCommentService.loadPart(id);
				if (commentList != null) {
					commentTimes = commentList.size();
					LOGGER.info("文章评论量获取成功，commentTimes:" + commentTimes + ",caseId:" + id);
				} else {
					LOGGER.info("文章评论量获取失败，无阅读量，caseId:" + id);
				}
				caseService.updateCase(id, point, read, share, join, commentTimes);
			} catch (Exception e) {
				LOGGER.error("更新文章阅读量、评论量失败，caseId:" + c.getId() + ",e:" + e.getMessage());
				e.printStackTrace();
				continue;
			}
		}
		// 文章下线处理
		LOGGER.info("文章即将开始更新。。。");
		try {
			LOGGER.info("文章有效期开始更新。。。");
			caseService.executeUpdate();
			LOGGER.info("文章有效期更新成功。。。");
		} catch (Exception e) {
			LOGGER.error("文章有效期更新失败，" + e.getMessage());
			e.printStackTrace();
		}
		LOGGER.info("更新文章阅读量接收");
	}
/**
 * 文章缓存任务
 */
	@Scheduled(cron = "0 0 2 * * ?")
	public void activeJob() {
		LOGGER.info("文章缓存任务开始");
		String d = "2016-4-15 ";
		activeCacheService.deleteAll();
		Date date1 = new Date();
		Date date3 = null;
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date3 = form.parse(d);
		} catch (Exception e) {
			e.printStackTrace();
		}

		long temp = date1.getTime() - date3.getTime(); // 相差毫秒数
		long hours = temp / 1000 / 3600 / 24; // 相差小时数

		for (long t = 0; t < hours; t++) {
			try {
				SimpleDateFormat form1 = new SimpleDateFormat("yyyy-MM-dd");
				Date date = form1.parse(d);
				Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				cal.add(Calendar.DAY_OF_MONTH, 1);
				Date nextDay = cal.getTime();
				d = form1.format(nextDay);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String tm = d + " 23:59:59";
			pData(d, tm);
		}
		LOGGER.info("文章缓存任务结束");
	}

	private void pData(String d, String tm) {
		activeCacheService.activeData(d, tm);

	}
	/**
	 * 龙虎榜任务
	 */
	@Scheduled(cron = "0 0 01 * * ?")
	public void scheduler() {
		activeCacheService.scheduler();
		LOGGER.info("任务结束");
	}
	
	/**
	 * 定时统计阅读量，转发量 评论 打赏等
	 */
	@Scheduled(cron="0 0/20 * * * ?")
	public void contentBusiness(){
		LOGGER.info(" 定时统计阅读量，转发量 评论 打赏等任务开始");
		contentBusinessService.contentBusiness();
		LOGGER.info(" 定时统计阅读量，转发量 评论 打赏等任务结束");
	}

}
