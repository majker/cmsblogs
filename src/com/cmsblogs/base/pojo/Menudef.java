package com.cmsblogs.base.pojo;

/**
 * 博客菜单  pojo
 * @Project:cmsblogs
 * @file:Menudef.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class Menudef {
    private String mdfId;

    private String mdfDesc;

    private String mdfUrl;

    private String mdfParentid;

    private String mdfSeq;

    private String mdfMenucode;

    public String getMdfId() {
        return mdfId;
    }

    public void setMdfId(String mdfId) {
        this.mdfId = mdfId == null ? null : mdfId.trim();
    }

    public String getMdfDesc() {
        return mdfDesc;
    }

    public void setMdfDesc(String mdfDesc) {
        this.mdfDesc = mdfDesc == null ? null : mdfDesc.trim();
    }

    public String getMdfUrl() {
        return mdfUrl;
    }

    public void setMdfUrl(String mdfUrl) {
        this.mdfUrl = mdfUrl == null ? null : mdfUrl.trim();
    }

    public String getMdfParentid() {
        return mdfParentid;
    }

    public void setMdfParentid(String mdfParentid) {
        this.mdfParentid = mdfParentid == null ? null : mdfParentid.trim();
    }

    public String getMdfSeq() {
        return mdfSeq;
    }

    public void setMdfSeq(String mdfSeq) {
        this.mdfSeq = mdfSeq == null ? null : mdfSeq.trim();
    }

    public String getMdfMenucode() {
        return mdfMenucode;
    }

    public void setMdfMenucode(String mdfMenucode) {
        this.mdfMenucode = mdfMenucode == null ? null : mdfMenucode.trim();
    }
}