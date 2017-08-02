var now,limt;
var clock;
function getValueBar(valueBar){
	var str = valueBar.parent().next().html();
	now = str.split('(')[1].split('/')[0];
	limt = str.split('/')[1].split(')')[0];
}
function setValueBar(valueBar, now, limt){
	var str = valueBar.parent().next().html().split('(')[0];
	valueBar.parent().next().html(str+'('+now+'/'+limt+')');
	valueBar.parent().next().next().children(0).css('width',(now/limt)*100+'%');
}
$(function(){
	$(".clock").click(function(){
//		clock==0?clock=1:clock=0;
		console.log("lalal");
		if(clock==0||clock==undefined){
			clock = 1;
			$(this).css('background','#FFFF00');
		}else if(clock==1){
			clock = 0;
			$(this).css('background','#999999');
		}
	});
	
	$(".decfive").click(function(){
		getValueBar($(this));
		now -= 5;
		if(clock==1){
			limt -= 5;
		}
		if(now<=0) now = 0;
		setValueBar($(this), now, limt);
	});
	$(".decone").click(function(){
		getValueBar($(this));
		now -= 1;
		if(clock==1){
			limt -= 1;
		}
		if(now<=0) now = 0;
		setValueBar($(this), now, limt);
	});
	$(".addone").click(function(){
		getValueBar($(this));
		now -= "-1";
		if(clock==1){
			if(now>limt){
				limt = now;
			}
		}
		if(now>limt) now = limt;
		setValueBar($(this), now, limt);
	});
	$(".addfive").click(function(){
		getValueBar($(this));
		now -= "-5";
		if(clock==1){
			if(now>limt){
				limt = now;
			}
		}
		if(now>limt) now = limt;
		setValueBar($(this), now, limt);
	});
	
});
function setHeight(){
	$(".container").css('height',$(window).height());
};
setHeight();
