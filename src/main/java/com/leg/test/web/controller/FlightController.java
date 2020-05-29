package com.leg.test.web.controller;

import com.leg.test.domain.po.Flight;
import com.leg.test.service.FlightQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FlightController {
    @Autowired
    private FlightQueryService flightQueryService;

    @RequestMapping(value = "/FlightQuery/{flightNo}/{flightDate}", method = RequestMethod.GET)
    @ResponseBody //返回user的json字符串
    public Flight findByFlight_noAndDate(@PathVariable("flightNo") String flightNo, @PathVariable("flightDate")String flightDate) {
        return flightQueryService.findByFlight_noAndDate(flightNo, flightDate);
    }
}
