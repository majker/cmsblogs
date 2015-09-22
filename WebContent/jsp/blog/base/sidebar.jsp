<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<!-- 搜索按钮 -->
	<div class="form-group search-col">
		<input id="q" class="input form-control" type="text" name="q" title="关键字查找" autocomplete="off" placeholder="关键字查找">
		<button class="search-submit" type="submit" value="Search" onclick="javascript:void(0)"></button>
	</div>
	<!-- 关注我 -->
	<div class="widget d_postlist d-tg-rz">
		<h3 class="widget_tit">关注我</h3>
		<ul>
			<li><a class="xlwb" href="javascript:void(0)">新浪</a></li>
			<li><a class="wzdy" href="javascript:void(0)">RSS</a></li>
			<li><a class="wdyx" href="javascript:void(0)">邮箱</a></li>
			<li><a class="wdqq" href="javascript:void(0)">qq</a></li>
			<li><a class="wdwx" href="javascript:void(0)">微信</a></li>
		</ul>
		<a class="wdlj github" href="https://github.com/chenssy89" target="_blank">我的Github</a>
		<a class="wdlj cnblogs fl" href="http://blog.csdn.net/chenssy/" target="_blank">我的博客园</a>
		<a class="wdlj csdn fr" href="http://www.cnblogs.com/chenssy" target="_blank">我的CSDN</a>
	</div>
	<!-- 博主简介 -->
	<div class="widget d_postlist">
		<h3 class="widget_tit">博主简介</h3>
		<p>本博客为博主的JAVA技术博客，本着学习与分享的目的，博主将持续不断的进行文章写作。望各位到访看客如有喜欢的文章可以点击一下推荐，若有不同建议或者意见，也请不吝赐教，博主感激不尽。另外，欢迎转载博主的文章，请务必依据文章下方的版权声明转载。</p>
	</div>
</body>
</html>