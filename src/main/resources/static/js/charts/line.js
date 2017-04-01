var lineChart = echarts.init(document.getElementById('linePanel'));
lineChart.showLoading();

// 显示标题，图例和空的坐标轴
lineChart.setOption({
	notMerge: true,
	title : {
		text : 'test-line'
	},
	tooltip : {},
	legend : {
		data : []
	},
	grid : {
		top : []
	},
	xAxis : {
		data : []
	},
	yAxis : {},
	series : []
});

// 设置初始值
getLineCharts(6);

$("#generateLine").click(
		function() {
			var lineNum = $("input[id='lineNum']").val();
			getLineCharts(lineNum);
		}
);

function getLineCharts(num) {
	// 异步加载数据
	$.get('/api/line?num='+num).done(function(data) {
		if (data.code == 200) {
			lineChart.hideLoading();
			
			// 填入数据
			lineChart.setOption({
				legend : data.obj.legend,
				grid : data.obj.grid,
				series : data.obj.echartsSeriesList
			});
		}
		else {
			alert(data.msg);
		}
		
	});
}
