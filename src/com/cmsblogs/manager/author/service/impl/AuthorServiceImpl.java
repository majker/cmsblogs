package com.cmsblogs.manager.author.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cmsblogs.base.dao.IAuthorMapper;
import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.manager.author.service.IAuthorService;

/**
 * 作者服务 实现类
 * @Project:cmsblogs
 * @file:AuthorServiceImpl.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月15日
 */
@Service("authorService")
public class AuthorServiceImpl implements IAuthorService{
	@Resource
	private  IAuthorMapper authorMapper;
	
	@Override
	public Author getAuthorByNickname(String userName) {
		return authorMapper.selectByNickName(userName);
	}

}
