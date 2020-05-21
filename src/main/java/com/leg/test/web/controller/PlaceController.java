package com.leg.test.web.controller;

import com.leg.test.domain.po.Place;
import com.leg.test.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Place")
public class PlaceController {
    @Autowired
    private PlaceService placeService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody //返回user的json字符串
    public List<Place> getAll(){
        return placeService.findAll();
    }
}
