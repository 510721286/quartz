package com.njzhaomi.quartz.yuejia.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @ClassName: After
 * @Description: 后期实现 暂时不提供服务
 * @author: xiaoyong
 * @date: 2016年11月7日 下午3:05:11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface After {

}
