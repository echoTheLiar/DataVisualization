var myChart = echarts.init(document.getElementById('linePanel'));
// 显示标题，图例和空的坐标轴
myChart.setOption({
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

// 异步加载数据
$.get('/api/line?num=35').done(function(data) {
	// 填入数据
	myChart.setOption({
		legend : data.obj.legend,
		grid : data.obj.grid,
		series : data.obj.echartsSeriesList
	});
});