package com.leg.test.web.controller;

import com.leg.test.domain.po.ExchangePoints;
import com.leg.test.service.ExchangePointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/ExchangePoints")
@Controller
public class ExchangePointsController {
    @Autowired
    private ExchangePointsService exchangePointsService;

    @RequestMapping(value = "/{dep_ct}/{arr_ct}/{dep_time}", method = RequestMethod.GET)
    @ResponseBody //返回user的json字符串
    public List<ExchangePoints> getById(@PathVariable("dep_ct") String dep_ct, @PathVariable("arr_ct") String arr_ct, @PathVariable("dep_time") String dep_time){
        return exchangePointsService.getFlightInformation(dep_ct, arr_ct, dep_time);
    }

    @RequestMapping(value = "/deductPoints/{id}/{points}", method = RequestMethod.GET)
    @ResponseBody
    public String deductPoints(@PathVariable("id") Integer id, @PathVariable("points") int points){
        return exchangePointsService.deductPoints(id, points);
    }
}
