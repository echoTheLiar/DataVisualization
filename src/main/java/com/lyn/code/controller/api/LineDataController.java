package com.lyn.code.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyn.code.service.LineDataService;
import com.lyn.code.util.JsonResult;

@RestController
public class LineDataController {

    private LineDataService lineDataService = new LineDataService();

    /**
     * 
     * @param num
     * @return api response in json format
     */
    @RequestMapping(value = "api/line", method = RequestMethod.GET)
    public JsonResult packLine(@RequestParam(value = "num") String num) {
	return this.lineDataService.echartsOption(num);
    }

}
