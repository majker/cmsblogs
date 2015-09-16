package com.cmsblogs.base.pojo;

import java.util.Date;

/**
 * 
 * 博客 pojo
 * @Project:cmsblogs
 * @file:Blog.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class Blog {
    private String blogId;

    private String blogColumnAlias;

    private String authorId;

    private String blogTitle;

    private Date blogCreatetime;

    private Integer blogViewerContent;

    private String blogStick;

    private Integer blogsRecommend;

    private String blogsThumbnail;

    private String blogsIscomment;

    private String blogsState;

    private String blogContent;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getBlogColumnAlias() {
        return blogColumnAlias;
    }

    public void setBlogColumnAlias(String blogColumnAlias) {
        this.blogColumnAlias = blogColumnAlias == null ? null : blogColumnAlias.trim();
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public Date getBlogCreatetime() {
        return blogCreatetime;
    }

    public void setBlogCreatetime(Date blogCreatetime) {
        this.blogCreatetime = blogCreatetime;
    }

    public Integer getBlogViewerContent() {
        return blogViewerContent;
    }

    public void setBlogViewerContent(Integer blogViewerContent) {
        this.blogViewerContent = blogViewerContent;
    }

    public String getBlogStick() {
        return blogStick;
    }

    public void setBlogStick(String blogStick) {
        this.blogStick = blogStick == null ? null : blogStick.trim();
    }

    public Integer getBlogsRecommend() {
        return blogsRecommend;
    }

    public void setBlogsRecommend(Integer blogsRecommend) {
        this.blogsRecommend = blogsRecommend;
    }

    public String getBlogsThumbnail() {
        return blogsThumbnail;
    }

    public void setBlogsThumbnail(String blogsThumbnail) {
        this.blogsThumbnail = blogsThumbnail == null ? null : blogsThumbnail.trim();
    }

    public String getBlogsIscomment() {
        return blogsIscomment;
    }

    public void setBlogsIscomment(String blogsIscomment) {
        this.blogsIscomment = blogsIscomment == null ? null : blogsIscomment.trim();
    }

    public String getBlogsState() {
        return blogsState;
    }

    public void setBlogsState(String blogsState) {
        this.blogsState = blogsState == null ? null : blogsState.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }
}