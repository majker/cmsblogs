package com.cmsblogs.base.dao;

import java.util.List;

import com.cmsblogs.base.dao.base.IBaseDao;
import com.cmsblogs.base.pojo.PubAppar;

/**
 * 系统参数的mapper
 * @Project:cmsblogs
 * @file:IPubApparMapper.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月7日
 */
public interface IPubApparMapper extends IBaseDao{
	/**
	 * 查询所有的系统参数
	 * @author:chenssy
	 * @data:2015年9月10日
	 *
	 * @return
	 */
	List<PubAppar> selectAllList();
}