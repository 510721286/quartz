package com.njzhaomi.quartz.yuejia.hander;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.njzhaomi.quartz.yuejia.constants.DynamicDataSourceGlobal;
import com.njzhaomi.quartz.yuejia.timer.Quartz;

/**
 * Created by IDEA User: mashaohua Date: 2016-07-14 10:56 Desc: 动态数据源实现读写分离
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	private static final Logger LOGGER = LoggerFactory.getLogger(DynamicDataSource.class);
	private Object writeDataSource; // 写数据源

	private Object readDataSource; // 读数据源

	@Override
	public void afterPropertiesSet() {
		if (this.writeDataSource == null) {
			throw new IllegalArgumentException("Property 'writeDataSource' is required");
		}
		setDefaultTargetDataSource(writeDataSource);
		Map<Object, Object> targetDataSources = new HashMap<>();
		targetDataSources.put(DynamicDataSourceGlobal.WRITE.name(), writeDataSource);
		if (readDataSource != null) {
			targetDataSources.put(DynamicDataSourceGlobal.READ.name(), readDataSource);
		}
		setTargetDataSources(targetDataSources);
		super.afterPropertiesSet();
	}

	@Override
	protected Object determineCurrentLookupKey() {

		DynamicDataSourceGlobal dynamicDataSourceGlobal = DynamicDataSourceHolder.getDataSource();

		if (dynamicDataSourceGlobal == null || dynamicDataSourceGlobal == DynamicDataSourceGlobal.WRITE) {
			LOGGER.info("使用写库");
			return DynamicDataSourceGlobal.WRITE.name();
		}
		LOGGER.info("使用读库");
		return DynamicDataSourceGlobal.READ.name();
	}

	public void setWriteDataSource(Object writeDataSource) {
		this.writeDataSource = writeDataSource;
	}

	public Object getWriteDataSource() {
		return writeDataSource;
	}

	public Object getReadDataSource() {
		return readDataSource;
	}

	public void setReadDataSource(Object readDataSource) {
		this.readDataSource = readDataSource;
	}
}