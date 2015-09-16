package com.cmsblogs.base.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.cmsblogs.base.dao.base.IBaseDao;
import com.cmsblogs.base.pojo.Blog;

/**
 * 博客mapper
 * @Project:cmsblogs
 * @file:IBlogMapper.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月7日
 */
public interface IBlogMapper  extends IBaseDao{
	
	/**
	 * 根据指定条件查询指定书目的博客数量
	 * @author:chenssy
	 * @data:2015年9月11日
	 *
	 * @param blog	
	 * @param params
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	List<Blog> queryBlogListByParams(@Param("blog")Blog blog,@Param("params")Map params);
}