package com.cmsblogs.blog.blog.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cmsblogs.base.core.AppConstants;
import com.cmsblogs.base.dao.IBlogMapper;
import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.base.pojo.Blog;
import com.cmsblogs.blog.blog.service.IBlogService;

/**
 * 置顶博客服务 实现了
 * @Project:cmsblogs
 * @file:StickBlogService.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年8月19日
 */
@Service("stickBlogService")
public class StickBlogServiceImpl implements IBlogService{
	@Resource
	private IBlogMapper blogMapper;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Blog> getBlogList(int number,Author author) {
		//查询条件
		Blog blog = new Blog();
		blog.setBlogStick(AppConstants.BLOG_STICK_YES);   //置顶
		
		//构建参数
		Map params = new HashMap();
		params.put("number", number);
		params.put("authorId", author.getAuthorId());
		
		//查询置顶博客
		List<Blog> blogs = blogMapper.queryBlogListByParams(blog, params);
		
		return blogs;
	}

}
