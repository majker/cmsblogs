package com.cmsblogs.blog.blog.service;

import java.util.List;

import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.base.pojo.Blog;

/**
 * 博文服务类 接口
 * @Project:cmsblogs
 * @file:IBlogService.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年8月19日
 */
public interface IBlogService {

	/**
	 * 获取指定数量的博文
	 * @author:chenssy
	 * @param sTICK_BLOG_NUMBER 
	 * @data:2015年8月19日
	 * @param number	博客数量
	 * @param author	作者
	 * @return
	 */
	List<Blog> getBlogList(int number,Author author);

}
