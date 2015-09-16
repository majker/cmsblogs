package com.cmsblogs.manager.author.service;

import com.cmsblogs.base.pojo.Author;

/**
 * 作者服务 接口
 * @Project:cmsblogs
 * @file:IAuthorService.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月15日
 */
public interface IAuthorService {

	/**
	 * 根据昵称获取作者VO
	 * @author:chenssy
	 * @data:2015年9月15日
	 *
	 * @param userName
	 * @return
	 */
	Author getAuthorByNickname(String userName);

}
