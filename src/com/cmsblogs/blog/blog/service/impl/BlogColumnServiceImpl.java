package com.cmsblogs.blog.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cmsblogs.base.dao.IBlogColumnMapper;
import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.base.pojo.BlogColumn;
import com.cmsblogs.blog.blog.service.IBlogColumnService;

/**
 * 博客专栏服务 实现类
 * @Project:cmsblogs
 * @file:BlogColumnServiceImpl.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
@Service("blogColumnService")
public class BlogColumnServiceImpl implements IBlogColumnService{
	@Resource
	private IBlogColumnMapper blogColumnMapper;
	
	@Override
	public List<BlogColumn> queryAllColumnList(Author author) {
		return blogColumnMapper.queryAllColumnList(author.getAuthorId());
	}

}
