package com.cmsblogs.blog.index.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JUtils.base.ValidateHelper;
import com.cmsblogs.base.base.BaseController;
import com.cmsblogs.base.core.AppContextUtil;
import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.base.pojo.Blog;
import com.cmsblogs.base.pojo.BlogColumn;
import com.cmsblogs.blog.blog.service.IBlogColumnService;
import com.cmsblogs.blog.blog.service.IBlogService;
import com.cmsblogs.manager.author.service.IAuthorService;

/**
 * 
 * @Project:cmsblogs
 * @file:IndexController.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年8月19日
 */
@Controller
public class IndexController extends BaseController{
	
	/** 博客 service*/
	@Resource
	private IBlogService blogService;
	
	/** 置顶博客 service */
	@Resource
	private IBlogService stickBlogService;
	
	@Resource
	private IAuthorService authorService;
	
	/** 博客专栏 service **/
	@Resource
	private IBlogColumnService blogColumnService;
	
	/** 置顶博客显示数量-6 */
	private final int STICK_BLOG_NUMBER = 6;
	
	
	
	
	/**
	 * 显示博客首页面<br>
	 * 该页面主要主要显示内容有：置顶博客、博主专栏、前15篇博客、博主个人介绍、最热门博客、最新评价、博主标签、日历
	 * @author:chenssy
	 * @data:2015年8月29日
	 *
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unused")
	@RequestMapping("/index")
	public String index(){
		String userName = request.getParameter("userName");
		
		//如果userName == null,则获取默认用户
		if(ValidateHelper.isEmptyString(userName)){
			userName = AppContextUtil.getPropertiesValue("defaultUser");
		}
		
		//博主个人介绍
		Author author = authorService.getAuthorByNickname(userName);
		//博主信息保存至session中
		setAuthorSession(author);
				
		//获取置顶博客
		List<Blog> stickBlogs = stickBlogService.getBlogList(STICK_BLOG_NUMBER,author);
		
		//博主专栏
		List<BlogColumn> colums =  blogColumnService.queryAllColumnList(author);
		
		//博主前15篇博客
		List<Blog> blogs = blogService.getBlogList(15,author);
		
		//最热门博客
		
		
		//最新评价
		
		//
		
		return "blog/index";
	}
}
