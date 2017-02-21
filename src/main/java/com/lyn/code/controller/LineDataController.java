package com.lyn.code.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyn.entity.EchartsLegend;
import com.lyn.entity.EchartsOption;
import com.lyn.entity.EchartsSeries;
import com.lyn.util.MockData;

@RestController
public class LineDataController {

	private static String[] legendDataArray = new String[5];
	private static int count;
	
	@RequestMapping(value = "/line", method = RequestMethod.GET)
	public EchartsOption echartsOption() {
		//String[] legend = { "legend-test" };
		EchartsLegend legend;
		String[] xAxis = { "x1", "x2", "x3" };
		String[] yAxis = {};
		ArrayList<EchartsSeries> echartsSeriesList = new ArrayList<EchartsSeries>();
        //count = num;
        
		for (int i = 0; i < 5; i++) {
			echartsSeriesList.add(getEchartsSeries(i));
		}

		legend = new EchartsLegend(legendDataArray);
		EchartsOption echartsOption = new EchartsOption(legend, xAxis, yAxis, echartsSeriesList);
		return echartsOption;
	}

	/**
	 * 
	 * @return an instance for EchartsSeries
	 */
	public static EchartsSeries getEchartsSeries(int i) {
		String template = "line-charts-name-%s";
		String name = String.format(template, MockData.generateRandomString());
		legendDataArray[i] = name;
		String type = "line";
		int[] data = MockData.mockIntArray();

		return new EchartsSeries(name, type, data);

	}

}
