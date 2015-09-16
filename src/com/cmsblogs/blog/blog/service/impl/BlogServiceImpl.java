package com.cmsblogs.blog.blog.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.base.pojo.Blog;
import com.cmsblogs.blog.blog.service.IBlogService;

/**
 * 博文服务 处理类
 * @Project:cmsblogs
 * @file:BlogServiceImpl.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年8月19日
 */
@Service("blogService")
public class BlogServiceImpl implements IBlogService{

	@Override
	public List<Blog> getBlogList(int number,Author author) {
		return null;
	}

}
