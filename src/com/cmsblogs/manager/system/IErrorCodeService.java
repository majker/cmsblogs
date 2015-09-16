package com.cmsblogs.manager.system;

import java.util.List;

import com.cmsblogs.base.pojo.PubErrcode;

/**
 * 系统错误列表服务  接口
 * @Project:cmsblogs
 * @file:IErrorCodeService.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月10日
 */
public interface IErrorCodeService {
	/**
	 * 获取所有的错误码
	 * @author:chenssy
	 * @data:2015年9月10日
	 *
	 * @return
	 */
	public List<PubErrcode> queryAllErroCodeList();
}
