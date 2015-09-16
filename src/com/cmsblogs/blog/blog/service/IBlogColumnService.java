package com.cmsblogs.blog.blog.service;

import java.util.List;

import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.base.pojo.BlogColumn;

/**
 * 博客专栏服务 接口
 * @Project:cmsblogs
 * @file:IBlogColumnService.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public interface IBlogColumnService {

	/**
	 * 查询所有的博客专栏
	 * @author:chenssy
	 * @data:2015年9月11日
	 *
	 * @return
	 */
	List<BlogColumn> queryAllColumnList(Author author);

}
