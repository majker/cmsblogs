package com.cmsblogs.base.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.cmsblogs.base.pojo.Author;

/**
 * 基础controller，提供最基本的功能
 * @Project:cmsblogs
 * @file:BaseController.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月15日
 */
public class BaseController {
	
	@Autowired
	protected HttpServletRequest request;
	
	/**
	 * 获取session
	 * @author:chenssy
	 * @data:2015年9月15日
	 *
	 * @return
	 */
	protected HttpSession getSession(){
		return request.getSession();
	}
	
	/**
	 * 获取作者的session
	 * @author:chenssy
	 * @data:2015年9月15日
	 *
	 * @return
	 */
	protected Author getAuthorSession(){
		HttpSession session = getSession();
		return (Author) session.getAttribute("author_" + session.getId());
	}
	
	/**
	 * 设置作者的session
	 * @author:chenssy
	 * @data:2015年9月15日
	 *
	 * @param author
	 */
	protected void setAuthorSession(Author author){
		HttpSession session = getSession();
		session.setAttribute("author_" + session.getId(), author);
	}
}
