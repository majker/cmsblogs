package com.cmsblogs.base.dao;

import java.util.List;

import com.cmsblogs.base.dao.base.IBaseDao;
import com.cmsblogs.base.pojo.BlogColumn;

/**
 * 博客专栏mapper
 * @Project:cmsblogs
 * @file:IBlogColumnMapper.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月7日
 */
public interface IBlogColumnMapper extends IBaseDao {

	/**
	 * 获取博主的博客专栏
	 * @author:chenssy
	 * @data:2015年9月11日
	 * 
	 * @param authorId	博主id
	 * @return
	 */
	List<BlogColumn> queryAllColumnList(String authorId);
}