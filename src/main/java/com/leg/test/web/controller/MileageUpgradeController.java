package com.leg.test.web.controller;

import com.leg.test.domain.po.MileageUpgrade;
import com.leg.test.service.MileageUpgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/MileageUpgrade")
@Controller
public class MileageUpgradeController {
    @Autowired
    private MileageUpgradeService mileageUpgradeService;

    @RequestMapping(value = "/{flight_no}", method = RequestMethod.GET)
    @ResponseBody //返回user的json字符串
    public List<MileageUpgrade> getById(@PathVariable("flight_no") String flight_no){
        return mileageUpgradeService.getFlightInformation(flight_no);
    }

    @RequestMapping(value = "/upgrade/{id}/{mileage}", method = RequestMethod.GET)
    @ResponseBody
    public String upgradeMileage(@PathVariable("id") Integer id, @PathVariable("mileage") int mileage){
        return mileageUpgradeService.upgradeMileage(id, mileage);
    }
}
