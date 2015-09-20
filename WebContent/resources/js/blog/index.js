$(function(){
	$(".tabs-title ul li").click(function(){
		$(".tabs-title ul li").removeClass("hit");
		$(this).addClass("hit");
		var _id = $(this).attr("id");
		$(".tabs-content div").hide();
		$("#" + _id + "_content").show();
	})
});