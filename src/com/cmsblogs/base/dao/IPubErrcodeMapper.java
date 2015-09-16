package com.cmsblogs.base.dao;

import java.util.List;

import com.cmsblogs.base.dao.base.IBaseDao;
import com.cmsblogs.base.pojo.PubErrcode;

/**
 * 错误代码的Mapper
 * @Project:cmsblogs
 * @file:IPubErrcodeMapper.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月7日
 */
public interface IPubErrcodeMapper extends IBaseDao{
	List<PubErrcode> selectAllList();
}