package com.leg.test.web.controller;

import com.leg.test.domain.po.Product;
import com.leg.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/Product")
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getAll/{id}", method = RequestMethod.GET)
    @ResponseBody //返回user的json字符串
    public List<Product> findCluster(@PathVariable("id") Integer id){
        List<Product> product=productService.findCluster(id);
        return product;
    }
}
