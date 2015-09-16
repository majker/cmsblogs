package com.cmsblogs.base.pojo;

import java.util.Date;

/**
 * 博客评价  pojo
 * @Project:cmsblogs
 * @file:Comments.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class Comments {
    private String commentId;

    private String blogId;

    private Date commentTime;

    private String commentPerson;

    private String commentPicture;

    private String categoryParentid;

    private String commentContent;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentPerson() {
        return commentPerson;
    }

    public void setCommentPerson(String commentPerson) {
        this.commentPerson = commentPerson == null ? null : commentPerson.trim();
    }

    public String getCommentPicture() {
        return commentPicture;
    }

    public void setCommentPicture(String commentPicture) {
        this.commentPicture = commentPicture == null ? null : commentPicture.trim();
    }

    public String getCategoryParentid() {
        return categoryParentid;
    }

    public void setCategoryParentid(String categoryParentid) {
        this.categoryParentid = categoryParentid == null ? null : categoryParentid.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}