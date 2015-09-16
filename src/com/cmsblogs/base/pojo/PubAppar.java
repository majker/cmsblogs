package com.cmsblogs.base.pojo;

/**
 * 系统参数  pojo
 * @Project:cmsblogs
 * @file:PubAppar.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class PubAppar {
    private String aprId;

    private String aprName;

    private String aprCode;

    private String aprValue;

    private String aprShowmsg;

    public String getAprId() {
        return aprId;
    }

    public void setAprId(String aprId) {
        this.aprId = aprId == null ? null : aprId.trim();
    }

    public String getAprName() {
        return aprName;
    }

    public void setAprName(String aprName) {
        this.aprName = aprName == null ? null : aprName.trim();
    }

    public String getAprCode() {
        return aprCode;
    }

    public void setAprCode(String aprCode) {
        this.aprCode = aprCode == null ? null : aprCode.trim();
    }

    public String getAprValue() {
        return aprValue;
    }

    public void setAprValue(String aprValue) {
        this.aprValue = aprValue == null ? null : aprValue.trim();
    }

    public String getAprShowmsg() {
        return aprShowmsg;
    }

    public void setAprShowmsg(String aprShowmsg) {
        this.aprShowmsg = aprShowmsg == null ? null : aprShowmsg.trim();
    }
}