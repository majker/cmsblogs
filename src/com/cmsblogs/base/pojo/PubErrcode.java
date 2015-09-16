package com.cmsblogs.base.pojo;

/**
 * 系统错误码  pojo
 * @Project:cmsblogs
 * @file:PubErrcode.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class PubErrcode {
    private String ercId;

    private String ercErrcode;

    private String ercShowmsg;

    public String getErcId() {
        return ercId;
    }

    public void setErcId(String ercId) {
        this.ercId = ercId == null ? null : ercId.trim();
    }

    public String getErcErrcode() {
        return ercErrcode;
    }

    public void setErcErrcode(String ercErrcode) {
        this.ercErrcode = ercErrcode == null ? null : ercErrcode.trim();
    }

    public String getErcShowmsg() {
        return ercShowmsg;
    }

    public void setErcShowmsg(String ercShowmsg) {
        this.ercShowmsg = ercShowmsg == null ? null : ercShowmsg.trim();
    }
}