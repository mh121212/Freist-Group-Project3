$(function(){
	//创建定时器,每3秒钟运行一次showNext函数
	var timer = setInterval(showNext, 3000);
	$('.num span').mouseover(function(){
		//清除定时器
		clearInterval(timer);
		//获取当前SPAN, 并转换为jQuery对象
		var $this = $(this);
		//获取当前SPAN在父容中的位置
		var index = $this.index();
		//隐藏当前显示的DIV
		$('.container div:visible').hide();
		// .container div:eq(1)
		$('.container div:eq(' + index + ')').show(1000);
		//重新创建定时器
		timer = setInterval(showNext, 3000);
	});
});

function showNext(){
	//找到当前显示的图片所在的DIV
	var $hover = $('.container div:visible');
	console.log($hover);
	//隐藏当前DIV  移除hover样式
	//$hover.removeClass('hover');
	$hover.hide();
	//找到当前DIV的下一下DIV
	var $next = $hover.next();
	//获取下一个DIV的DOM对象
	var next = $next.get(0);
	//如果已经到最后一个图片，则下一个等于第一个
	if(next == null){
		$next = $('.container div:first')
	}
	//给要显示的DIV添加hover样式
	//$next.addClass('hover');
	$next.show(1000);
}