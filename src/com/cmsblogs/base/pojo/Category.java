package com.cmsblogs.base.pojo;

/**
 * 博客分类  pojo
 * @Project:cmsblogs
 * @file:Category.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class Category {
    private String categoryId;

    private String categoryName;

    private Integer categorySeq;

    private Integer categoryBlogcount;

    private String categoryParentid;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCategorySeq() {
        return categorySeq;
    }

    public void setCategorySeq(Integer categorySeq) {
        this.categorySeq = categorySeq;
    }

    public Integer getCategoryBlogcount() {
        return categoryBlogcount;
    }

    public void setCategoryBlogcount(Integer categoryBlogcount) {
        this.categoryBlogcount = categoryBlogcount;
    }

    public String getCategoryParentid() {
        return categoryParentid;
    }

    public void setCategoryParentid(String categoryParentid) {
        this.categoryParentid = categoryParentid == null ? null : categoryParentid.trim();
    }
}