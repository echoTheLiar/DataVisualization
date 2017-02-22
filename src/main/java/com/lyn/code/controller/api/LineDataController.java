package com.lyn.code.controller.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyn.entity.EchartsLegend;
import com.lyn.entity.EchartsOption;
import com.lyn.entity.EchartsSeries;
import com.lyn.util.APIStatusCode;
import com.lyn.util.JsonResult;
import com.lyn.util.MockData;

@RestController
public class LineDataController {

	public static final int MAX_NUM_VALUE = 30;

	private static String[] legendDataArray;// Echarts中要求legend.data属性和series中的name保持一致
	private static int count;

	@RequestMapping(value = "api/line", method = RequestMethod.GET)
	public JsonResult echartsOption(@RequestParam(value = "num") String num) {
		EchartsLegend legend;
		String[] xAxis = {};
		String[] yAxis = {};
		ArrayList<EchartsSeries> echartsSeriesList = new ArrayList<EchartsSeries>();

		if (!num.matches("\\d+")) {
			return new JsonResult(APIStatusCode.INVALID_INPUT, null);
		}

		count = Integer.parseInt(num);

		if (count > LineDataController.MAX_NUM_VALUE) {
			return new JsonResult(APIStatusCode.INPUT_TOO_LARGE, null);
		}

		legendDataArray = new String[count];

		for (int i = 0; i < count; i++) {
			echartsSeriesList.add(getEchartsSeries(i));
		}

		legend = new EchartsLegend(legendDataArray);
		// legend = new
		// EchartsLegend(CustomizeEcharts.adjustLegendData(legendDataArray));

		return new JsonResult(APIStatusCode.SUCCESS, new EchartsOption(legend, xAxis, yAxis, echartsSeriesList));
	}

	/**
	 * 
	 * @return an instance for EchartsSeries
	 */
	public static EchartsSeries getEchartsSeries(int i) {
		String template = "line-charts-name-%s";
		String name = String.format(template, MockData.generateRandomString());
		String type = "line";
		int[] data = MockData.generateIntArray(20, (i + 1) * 20);

		// Echarts中要求legend.data属性和series中的name保持一致
		legendDataArray[i] = name;

		return new EchartsSeries(name, type, data);

	}

	/*
	 * public static String[] generateStringArray(int arrayCount, String
	 * template) { if (MockData.empty(template)) { template = "%s"; }
	 * 
	 * 
	 * }
	 */

}
