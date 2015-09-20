package com.cmsblogs.base.core.schedule;

import java.util.List;

import com.cmsblogs.base.pojo.Author;
import com.cmsblogs.base.pojo.Blog;
import com.cmsblogs.base.pojo.BlogColumn;
import com.cmsblogs.base.pojo.BlogTag;
import com.cmsblogs.base.pojo.Menudef;

/**
 * 博客数据池
 * 在博客进行初始化时
 * @Project:cmsblogs
 * @file:BlogData.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月20日
 */
public class BlogData {
	/**
	 * 置顶博客
	 */
	public static List<Blog> sticksBlogs;
	
	/**
	 * 博客专栏
	 */
	public static List<BlogColumn> blogColumns;
	
	/**
	 * 博客菜单(分类)
	 */
	public static List<Menudef> menudefs;
	
	/**
	 * 博主个人信息
	 */
	public static Author author;
	
	/**
	 * 最新博客
	 */
	public static List<Blog> newsBLogs;
	
	/**
	 * 最热博客
	 */
	public static List<Blog> bestBlogs;
	
	/**
	 * 博客标签
	 */
	public static List<BlogTag> blogTags;

	public static List<Blog> getSticksBlogs() {
		return sticksBlogs;
	}

	public static void setSticksBlogs(List<Blog> sticksBlogs) {
		BlogData.sticksBlogs = sticksBlogs;
	}

	public static List<BlogColumn> getBlogColumns() {
		return blogColumns;
	}

	public static void setBlogColumns(List<BlogColumn> blogColumns) {
		BlogData.blogColumns = blogColumns;
	}

	public static List<Menudef> getMenudefs() {
		return menudefs;
	}

	public static void setMenudefs(List<Menudef> menudefs) {
		BlogData.menudefs = menudefs;
	}

	public static Author getAuthor() {
		return author;
	}

	public static void setAuthor(Author author) {
		BlogData.author = author;
	}

	public static List<Blog> getNewsBLogs() {
		return newsBLogs;
	}

	public static void setNewsBLogs(List<Blog> newsBLogs) {
		BlogData.newsBLogs = newsBLogs;
	}

	public static List<Blog> getBestBlogs() {
		return bestBlogs;
	}

	public static void setBestBlogs(List<Blog> bestBlogs) {
		BlogData.bestBlogs = bestBlogs;
	}

	public static List<BlogTag> getBlogTags() {
		return blogTags;
	}

	public static void setBlogTags(List<BlogTag> blogTags) {
		BlogData.blogTags = blogTags;
	}
	
}
