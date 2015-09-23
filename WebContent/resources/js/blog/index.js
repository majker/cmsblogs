$(function(){
	$(".tabs-title ul li").click(function(){
		$(".tabs-title ul li").removeClass("hit");
		$(this).addClass("hit");
		var _id = $(this).attr("id");
		$(".tabs-content .sticky,.tabs-content .blog-col").hide();
		$("#" + _id + "_content").show();
	})
});