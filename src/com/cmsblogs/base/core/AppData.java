package com.cmsblogs.base.core;

import java.util.Map;
import java.util.Properties;

/**
 * 系统配置参数池，用于存放系统参数的配置，其中参数配置采用key-value对应<br>
 * @Project:cmsblogs
 * @file:AppData.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年8月20日
 */
public final class AppData {
	/**
	 * 应用参数列表
	 */
	@SuppressWarnings("rawtypes")
	protected static Map PUB_APPPAR;
	
	/**
	 * 错误代码
	 */
	@SuppressWarnings("rawtypes")
	protected static Map PUB_ERRCODE;
	
	protected static Properties PUB_PROPERTIES;
	
	@SuppressWarnings({ "rawtypes", "static-access" })
	public AppData(Map pub_appar,Map pub_errCode,Properties pub_properties){
		this.PUB_APPPAR = pub_appar;
		this.PUB_ERRCODE = pub_errCode;
		this.PUB_PROPERTIES = pub_properties;
	}
	
}
