package com.cmsblogs.manager.system.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cmsblogs.base.dao.IPubApparMapper;
import com.cmsblogs.base.pojo.PubAppar;
import com.cmsblogs.manager.system.IApparService;

/**
 * 系统参数服务 实现类
 * @Project:cmsblogs
 * @file:ApparServiceImpl.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月10日
 */
@Service("apparService")
public class ApparServiceImpl implements IApparService{
	
	@Resource
	private IPubApparMapper pubApparMapper;

	@Override
	public List<PubAppar> queryAllApparList() {
		return pubApparMapper.selectAllList();
	}

}
