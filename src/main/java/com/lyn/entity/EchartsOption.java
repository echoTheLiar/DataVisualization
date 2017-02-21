package com.lyn.entity;

import java.util.List;

public class EchartsOption {

	private EchartsLegend legend;
	private String[] xAxis;
	private String[] yAxis;
	private List<EchartsSeries> echartsSeriesList;

	public EchartsOption(EchartsLegend legend, String[] xAxis, String[] yAxis, List<EchartsSeries> echartsSeriesList) {
		super();
		this.legend = legend;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.echartsSeriesList = echartsSeriesList;
	}

	public EchartsLegend getLegend() {
		return legend;
	}

	public void setLegend(EchartsLegend legend) {
		this.legend = legend;
	}

	public String[] getxAxis() {
		return xAxis;
	}

	public void setxAxis(String[] xAxis) {
		this.xAxis = xAxis;
	}

	public String[] getyAxis() {
		return yAxis;
	}

	public void setyAxis(String[] yAxis) {
		this.yAxis = yAxis;
	}

	public List<EchartsSeries> getEchartsSeriesList() {
		return echartsSeriesList;
	}

	public void setEchartsSeriesList(List<EchartsSeries> echartsSeriesList) {
		this.echartsSeriesList = echartsSeriesList;
	}

}
