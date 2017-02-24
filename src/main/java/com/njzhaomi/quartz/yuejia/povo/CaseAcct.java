package com.njzhaomi.quartz.yuejia.povo;

import java.io.Serializable;

/**
 * 
 * @ClassName: CaseAcct
 * @Description: TODO
 * @author: xiaoyong
 * @date: 2016年11月8日 下午7:24:49
 */
public class CaseAcct implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2365957020055602117L;
	private String openId;// 用户标识
	private Integer num;
	
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
}
