package com.cmsblogs.base.pojo;

import java.util.Date;

/**
 * 作者 pojo
 * @Project:cmsblogs
 * @file:Author.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class Author {
    private String authorId;

    private String authorPassword;

    private String authorNickname;

    private String authorQq;

    private String authorEmail;

    private Date authorRegisterTime;

    private String authorPicture;

    private String authorSaying;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getAuthorPassword() {
        return authorPassword;
    }

    public void setAuthorPassword(String authorPassword) {
        this.authorPassword = authorPassword == null ? null : authorPassword.trim();
    }

    public String getAuthorNickname() {
        return authorNickname;
    }

    public void setAuthorNickname(String authorNickname) {
        this.authorNickname = authorNickname == null ? null : authorNickname.trim();
    }

    public String getAuthorQq() {
        return authorQq;
    }

    public void setAuthorQq(String authorQq) {
        this.authorQq = authorQq == null ? null : authorQq.trim();
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail == null ? null : authorEmail.trim();
    }

    public Date getAuthorRegisterTime() {
        return authorRegisterTime;
    }

    public void setAuthorRegisterTime(Date authorRegisterTime) {
        this.authorRegisterTime = authorRegisterTime;
    }

    public String getAuthorPicture() {
        return authorPicture;
    }

    public void setAuthorPicture(String authorPicture) {
        this.authorPicture = authorPicture == null ? null : authorPicture.trim();
    }

    public String getAuthorSaying() {
        return authorSaying;
    }

    public void setAuthorSaying(String authorSaying) {
        this.authorSaying = authorSaying == null ? null : authorSaying.trim();
    }
}