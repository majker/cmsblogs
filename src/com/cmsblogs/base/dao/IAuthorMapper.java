package com.cmsblogs.base.dao;

import com.cmsblogs.base.dao.base.IBaseDao;
import com.cmsblogs.base.pojo.Author;

/**
 * 作者mapper
 * @Project:cmsblogs
 * @file:IAuthorMapper.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月7日
 */
public interface IAuthorMapper extends IBaseDao{

	/**
	 * 根据昵称获取作者VO
	 * @author:chenssy
	 * @data:2015年9月15日
	 *
	 * @param nickName 作者昵称
	 * @return
	 */
	Author selectByNickName(String nickName);
}