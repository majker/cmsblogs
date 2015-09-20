package com.cmsblogs.base.core.schedule;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.base.pojo.Blog;
import com.cmsblogs.base.pojo.BlogColumn;
import com.cmsblogs.base.pojo.Menudef;

/**
 * 初始化博客部分<br>
 * 进入博客页面，侧边栏需要加载很多数据，为了加快访问速度，对这部分数据进行数据初始化<br>
 * 初始化的数据加入到blogData中，blogData相当于一个数据池，它存储这部分的初始化数据<br>
 * 为了动态化显示，这部分数据每天初始化一次。
 * @Project:cmsblogs
 * @file:BlogContextInit.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月20日
 */
public class BlogContextInitScheduleJob extends QuartzJobBean{
	private static final Logger logger = Logger.getLogger(BlogContextInitScheduleJob.class);
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		logger.info("....开始执行定时任务(BlogContextInitScheduleJob)");
		
		/* 加载作者基本信息 */
		Author author = this.loadAuthorInfo();
		
		/* 加载置顶博客  */
		List<Blog> sticksBlogs = this.loadSticksBlogs();
		
		/* 加载博主专栏   */
		List<BlogColumn> blogColumns = this.loadBlogsColums();
		
		List<Menudef> menudefs = this.loadMenuDef();
		
		
		
	}

	private List<Menudef> loadMenuDef() {
		// TODO Auto-generated method stub
		return null;
	}

	private List<BlogColumn> loadBlogsColums() {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Blog> loadSticksBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	private Author loadAuthorInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
