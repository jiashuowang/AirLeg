package com.leg.test.web.controller;
import com.leg.test.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value = "/Activity")
@Controller
public class DiscountController {
    @Autowired
    DiscountService discountService;

    @RequestMapping(value = "/getDiscount/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Integer getDiscount(@PathVariable("id") Integer id){
        return discountService.findDiscount(id);
    }

}
