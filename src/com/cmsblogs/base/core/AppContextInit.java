package com.cmsblogs.base.core;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.servlet.ServletContextEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cmsblogs.base.pojo.PubAppar;
import com.cmsblogs.base.pojo.PubErrcode;
import com.cmsblogs.manager.system.IApparService;
import com.cmsblogs.manager.system.IErrorCodeService;

/**
 * 系统初始化<br>
 * 继承ContextLoaderListener,Web容器启动时，会执行实现它的方法（contextInitialized）。<br>
 * 在系统初始化时，完成系统参数的加载，加载内容全部放入参数池AppData中
 * @Project:cmsblogs
 * @file:AppContextInit.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年8月20日
 */
public class AppContextInit extends ContextLoaderListener{
	private static ApplicationContext context;
	
	@SuppressWarnings("rawtypes")
	@Override
	public void contextInitialized(ServletContextEvent context) {
		setContext(WebApplicationContextUtils.getRequiredWebApplicationContext(context.getServletContext()));
		
		// 初始化系统数据
		Map syspar = this.initAppParam();
		
		//初始化错误码
		Map errCode = this.initErrorCode();
		
		//初始化系统配置文件
		Properties pro = this.loadProperties(AppConstants.SYSTEM_PROPS);
		
		//将其加载到系统数据池中
		new AppData(syspar, errCode, pro);
	}

	/**
	 * 加载配置文件
	 * @author:chenssy
	 * @data:2015年9月4日
	 *
	 * @param systemProps	配置文件名
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private Properties loadProperties(String systemProps) {
		Properties props = new Properties();
		ResourceBundle bundle = ResourceBundle.getBundle(systemProps);
		Enumeration enums = bundle.getKeys();
		Object key = null;
		Object value = null;
		for (; enums.hasMoreElements(); props.put(key, value)) {
			key = enums.nextElement();
			value = bundle.getString(key.toString());
		}
		bundle = null;
		return props;
	}

	/**
	 * 初始化错误代码
	 * @author:chenssy
	 * @data:2015年9月4日
	 *
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private Map initErrorCode() {
		IErrorCodeService errorCodeService = (IErrorCodeService) AppContextUtil.getBean("errorCodeService");
		//查询所有的错误代码
		List<PubErrcode> list = errorCodeService.queryAllErroCodeList();
		//构建错误集 
		Map<String, String> resultMap = new HashMap<String, String>();
		for(PubErrcode errcode:list){
			resultMap.put(errcode.getErcErrcode(), errcode.getErcShowmsg());
		}
		return resultMap;
	}

	/**
	 * 初始化系统参数
	 * @author:chenssy
	 * @data:2015年9月4日
	 *
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private Map initAppParam() {
		IApparService apparService = (IApparService) AppContextUtil.getBean("apparService");
		
		//构建系统参数结果集
		Map<String, Map<String, String>> result = new HashMap<String, Map<String, String>>();
		Map<String, String> resultMap = null;
		String key = null;
		
		List<PubAppar> list = apparService.queryAllApparList();
		for(PubAppar appar : list){
			key = appar.getAprCode();    //获取key
			//如果该key值存在，则更新，否则新建
			if(result.containsKey(key)){
				resultMap = result.get(key);
			}else{
				resultMap = new HashMap<String, String>();
			}
			//更新
			resultMap.put(appar.getAprValue(), appar.getAprShowmsg());
			result.put(key, resultMap);
		}
		return result;
	}

	public static ApplicationContext getContext() {
		return context;
	}

	public static void setContext(ApplicationContext ctx) {
		context = ctx;
	}
}
