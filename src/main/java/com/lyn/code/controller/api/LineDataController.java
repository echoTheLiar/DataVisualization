package com.lyn.code.controller.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyn.code.entity.EchartsGrid;
import com.lyn.code.entity.EchartsLegend;
import com.lyn.code.entity.EchartsOption;
import com.lyn.code.entity.EchartsSeries;
import com.lyn.code.util.APIStatusCode;
import com.lyn.code.util.CustomizeEcharts;
import com.lyn.code.util.JsonResult;
import com.lyn.code.util.MockData;

@RestController
public class LineDataController {

	public static final int MAX_NUM_VALUE = 100;

	private static String[] legendDataArray;// Echarts中要求legend.data属性和series中的name保持一致
	private static int count;

	/**
	 * 
	 * @param num
	 * @return api response in json format
	 */
	@RequestMapping(value = "api/line", method = RequestMethod.GET)
	public JsonResult echartsOption(@RequestParam(value = "num") String num) {
		try {
			EchartsLegend legend;
			EchartsGrid grid;
			String[] xAxis = {};
			String[] yAxis = {};
			ArrayList<EchartsSeries> echartsSeriesList = new ArrayList<EchartsSeries>();

			if (!num.matches("\\d+")) {
				return new JsonResult(APIStatusCode.INVALID_INPUT, null);
			}

			count = Integer.parseInt(num);

			if (count > MAX_NUM_VALUE) {
				return new JsonResult(APIStatusCode.INPUT_TOO_LARGE, null);
			}

			legendDataArray = new String[count];

			for (int i = 0; i < count; i++) {
				echartsSeriesList.add(getEchartsSeries(i));
			}

			// legend = new EchartsLegend(legendDataArray);
			
			// adjust the legend to avoid the overlapping
			legend = new EchartsLegend(
					CustomizeEcharts.adjustLegendData(legendDataArray));
			// set the distance of which the component is from the top of the container 
			grid = new EchartsGrid(CustomizeEcharts.setGridTop(legendDataArray));
			
			return new JsonResult(APIStatusCode.SUCCESS, new EchartsOption(legend, grid, xAxis, yAxis, echartsSeriesList));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

		return new JsonResult(APIStatusCode.UNKNOWN_ERROR, null);

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
