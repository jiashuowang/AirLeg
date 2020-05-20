package com.leg.test.web.controller;

import com.leg.test.domain.po.MemberPoints;
import com.leg.test.service.MemberPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/MemberPoints")
@Controller
public class MemberPointsController {
    @Autowired
    private MemberPointsService memberPointsService;


    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public MemberPoints getPoints(@PathVariable("id") Integer id){
        System.out.println(id+"===========================");
        return memberPointsService.getPoints(id);
    }
}
