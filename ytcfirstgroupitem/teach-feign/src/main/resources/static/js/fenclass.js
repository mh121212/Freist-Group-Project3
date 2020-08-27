$(function(){
	var $div_li=$("div.fenclass ul li");
	$div_li.mouseover(function(){
		$(this).addClass("selected")
			.siblings().removeClass("selected");
		var index=$div_li.index(this);
		$("div.news > div").eq(index).show()
			.siblings().hide();
	}).hover(function(){
		$(this).addClass("hover");
	},function(){
		$(this).removeClass("hover");
	});
});
