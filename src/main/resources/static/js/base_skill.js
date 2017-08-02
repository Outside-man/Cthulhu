function setHeight() {
	$(".mui-control-content").css('min-height', $(window).height());
};

function getSkill() {
		$.ajax({
			type: "POST",
			url: "http://localhost:8088/demo",
			dataType: "json",
			success: function(data) {
				var str = '<div id="unstudy">';
				var index = 0;
				
				var col = new Array();
				col[0] = '<div class="col-4-1">';
				col[1] = '<div class="col-4-2">';
				col[2] = '<div class="col-4-3">';
				col[3] = '<div class="col-4-4">';
				
				for(var o in data) {
					var wid = data[o].skillValue+"%";
					col[index%4]+='<p>' +data[o].skillName+ '(' +data[o].skillValue+ ')</p>'+
					'<div class="progress"><div class="progress-bar progress-bar-striped" role="progressbar" style="width:' +wid+ 
					'"></div></div>';
					index++;
				}
				col[0] += '</div>';
				col[1] += '</div>';
				col[2] += '</div>';
				col[3] += '</div>';
				str+=col[0]+col[1]+col[2]+col[3];
				str += "</div>";
				$("#unstudy").replaceWith(str);

			}
		});
};
setHeight();
//getSkill();