package com.cmsblogs.base.pojo;

/**
 * 博客专栏  pojo
 * @Project:cmsblogs
 * @file:BlogColumn.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class BlogColumn {
    private String blogColumnAlias;
    
    private String authorId;

    private String blogColumnName;

    private String blogColumnRemark;

    private String blogColumnLogo;

    public String getBlogColumnAlias() {
        return blogColumnAlias;
    }

    public void setBlogColumnAlias(String blogColumnAlias) {
        this.blogColumnAlias = blogColumnAlias == null ? null : blogColumnAlias.trim();
    }

    public String getBlogColumnName() {
        return blogColumnName;
    }

    public void setBlogColumnName(String blogColumnName) {
        this.blogColumnName = blogColumnName == null ? null : blogColumnName.trim();
    }

    public String getBlogColumnRemark() {
        return blogColumnRemark;
    }

    public void setBlogColumnRemark(String blogColumnRemark) {
        this.blogColumnRemark = blogColumnRemark == null ? null : blogColumnRemark.trim();
    }

    public String getBlogColumnLogo() {
        return blogColumnLogo;
    }

    public void setBlogColumnLogo(String blogColumnLogo) {
        this.blogColumnLogo = blogColumnLogo == null ? null : blogColumnLogo.trim();
    }

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
}