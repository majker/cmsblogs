package com.cmsblogs.base.pojo.core;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.JSONObject;


/**
 * mybatis通用pojo<br>
 * 该类主要用于处理pojo与数据库的，该类提供一些构建基本sql语句，例如增加、修改、删除、简单的查询<br>
 * so，所有的pojo都必须继承该base pojo
 * @Project:cmsblogs
 * @file:MybatisPojo.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年8月20日
 */
@SuppressWarnings("serial")
public class BasePojo implements Serializable{
	
	/**
	 * 用于存放pojo列的信息
	 */
	private transient static Map<Class<? extends BasePojo>, List<String>> columnMap = 
			new HashMap<Class<? extends BasePojo>, List<String>>();
	
	/**
	 * 获取pojo对应的表名<br>
	 * 需要POJO中的属性定义@Table(name)
	 * @author:chenssy
	 * @data:2015年8月20日
	 *
	 * @return
	 */
	protected String getTableName(){
		Table table = this.getClass().getAnnotation(Table.class);  
        if(table != null){
            return table.name();
        }else{
        	throw new RuntimeException("undefine pojo @Table");
        }
	}
	
	/**
	 * 获取pojo对应表中的主键<br>
	 * 需要定义@id
	 * @author:chenssy
	 * @data:2015年8月20日
	 *
	 * @return
	 */
	protected String getPrimaryKey(){
		//获取所有的属性
		Field[] fields = this.getClass().getDeclaredFields();
		for(Field field : fields){
			if(field.isAnnotationPresent(Id.class)){
				return field.getName();
			}
		}
		
		throw new RuntimeException("undefine pojo @Id");
	}
	
	/**
	 * 构建pojo的列<br>
	 * 需要加@column
	 * @author:chenssy
	 * @data:2015年8月20日
	 *
	 */
	protected void buildColumnList(){
		if(columnMap.containsKey(this.getClass())){
			return ;
		}
		
		Field[] fields = this.getClass().getDeclaredFields();
		List<String> columes = new ArrayList<String>();
		
		for(Field field : fields){
			if(field.isAnnotationPresent(Column.class)){
				columes.add(field.getName());
			}
		}
		
		columnMap.put(this.getClass(), columes);
	}
	
	/**
	 * 获取用于where的有值字段
	 * @author:chenssy
	 * @data:2015年8月30日
	 *
	 * @return
	 */
	protected List<WhereColum> getWhereColums(){
		List<WhereColum> list = new ArrayList<WhereColum>();
		
		Field[] fields = this.getClass().getDeclaredFields();
		
		for(Field field : fields){
			if(field.isAnnotationPresent(Column.class) && isNotNull(field)){
				list.add(new WhereColum(field.getName(), field.getGenericType().equals(String.class)));
			}
		}
		
		return list;
	}
	
	/**
	 * 判断字段是否为null
	 * @author:chenssy
	 * @data:2015年8月30日
	 *
	 * @param field
	 * @return
	 */
	private boolean isNotNull(Field field) {
		//设置字段可读
		field.setAccessible(true);
		boolean isNotNull = false;
		try {
			isNotNull = field.get(this) != null;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return isNotNull;
	}

	/**
	 * 判断字段是否为null
	 * @author:chenssy
	 * @data:2015年8月30日
	 *
	 * @param name
	 * @return
	 */
	private boolean isNotNull(String name){
		Field field = null;
		try {
			field = this.getClass().getDeclaredField(name);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		return isNotNull(field);
	}
	
	/**
	 * 内部类，where语句的信息
	 * @Project:cmsblogs
	 * @file:BasePojo.java
	 *
	 * @Author:chenssy
	 * @email:chenssy995812509@163.com
	 * @url : http://cmsblogs.com
	 * @qq : 122448894
	 *
	 * @data:2015年8月30日
	 */
	private class WhereColum{
		/**
		 * 字段名
		 */
		@SuppressWarnings("unused")
		private String name;
		
		/**
		 * 字段是否为String类型
		 */
		@SuppressWarnings("unused")
		private boolean isString;
		
		public WhereColum(String name , boolean isString){
			this.name = name;
			this.isString = isString;
		}
	}
	
	/**
	 * 获取语句的字段部分构建该部分：#{},#{},为空的部分不需要考虑
	 * @author:chenssy
	 * @data:2015年8月30日
	 *
	 * @return
	 */
	protected String getSqlColumnsName(){
		StringBuilder insertString = new StringBuilder();
		
		//获取字段列
		List<String> list = columnMap.get(this.getClass());
		
		for(String column : list){
			if(isNotNull(column)){
				continue;
			}
			insertString.append(",#{").append(column).append("}");
		}
		
		return insertString.toString();
	}
	
	/**
	 * 将pojo转换为json格式
	 * @author:chenssy
	 * @data:2015年8月30日
	 *
	 * @return
	 */
	protected String toJsonString(){
		JSONObject json = new JSONObject(this);
		return json.toString();
	}
	
}
