package com.cmsblogs.base.dao.base;

/**
 * mapper基础类,其余mapper需要继承该基础类
 * @Project:cmsblogs
 * @file:IBaseDao.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月7日
 */
public interface IBaseDao {
	/**
	 * 根据id删除
	 * @author:chenssy
	 * @data:2015年9月2日
	 *
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * 插入记录
	 * @author:chenssy
	 * @data:2015年9月2日
	 *
	 * @param t
	 * @return
	 */
    <T> int insert(T t);

    /**
     * 根据条件进行插入（!= null）
     * @author:chenssy
     * @data:2015年9月2日
     *
     * @param record
     * @return
     */
    <T> int insertSelective(T record);

    /**
     * 根据ID进行查找
     * @author:chenssy
     * @data:2015年9月2日
     *
     * @param authorId
     * @return
     */
    <T> T selectByPrimaryKey(String id);

    /**
     * 更新记录
     * @author:chenssy
     * @data:2015年9月2日
     *
     * @param record
     * @return
     */
    <T> int updateByPrimaryKeySelective(T t);

    /**
     * 更新记录
     * @author:chenssy
     * @param <T>
     * @data:2015年9月2日
     *
     * @param record
     * @return
     */
    <T> int updateByPrimaryKey(T t);
}
