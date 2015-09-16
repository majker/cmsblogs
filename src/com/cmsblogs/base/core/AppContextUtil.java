package com.cmsblogs.base.core;

import java.util.Map;
import java.util.Properties;

/**
 * 系统参数配置工具类<br>
 * 读取系统参数数据池中数据，使用key值获得相对应的value,如果不存在，则返回null
 * @Project:cmsblogs
 * @file:AppContextUtil.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年8月20日
 */
public class AppContextUtil {
	
	/**
	 * 获取service Bean
	 * @author:chenssy
	 * @data:2015年9月7日
	 *
	 * @param beanId
	 * @return
	 */
	public static Object getBean(String beanId) {
		return AppContextInit.getContext().getBean(beanId);
	}
	
	/**
	 * 获取错误信息
	 * @author:chenssy
	 * @data:2015年9月10日
	 *
	 * @param key	错误代码
	 * @return	存在返回value，不存在返回null
	 */
	public static String getErrorMsg( String key) {
		String value = (String) AppData.PUB_ERRCODE.get(key);
		return value;
	}
	
	/**
	 * 
	 * @author:chenssy
	 * @data:2015年9月10日
	 *
	 * @param code	参数code name
	 * @param key	参数代码
	 * @return	存在返回value，不存在返回null
	 */
	@SuppressWarnings("unchecked")
	public static String getApparMsg(String code , String key){
		Map<String, String> map = (Map<String, String>) AppData.PUB_APPPAR.get(code);
		String value = map.get(key);
		
		return value;
	}
	
	/**
	 * 获取系统配置信息
	 * @author:chenssy
	 * @data:2015年9月10日
	 *
	 * @param key	key
	 * @return	存在则返回，否则返回null
	 */
	public static String getPropertiesValue(String key){
		Properties properties = AppData.PUB_PROPERTIES;
		
		return (String) properties.get(key);
	}
}
