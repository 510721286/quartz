package com.njzhaomi.quartz.yuejia.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.njzhaomi.quartz.yuejia.constants.DynamicDataSourceGlobal;
/**
 * 
 * @ClassName: DataSource 
 * @Description: TODO
 * @author: xiaoyong
 * @date: 2016年11月7日 下午4:27:53
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {

	public DynamicDataSourceGlobal value() default DynamicDataSourceGlobal.READ;

}