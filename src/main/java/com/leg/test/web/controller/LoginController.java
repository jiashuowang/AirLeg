package com.leg.test.web.controller;

import com.leg.test.domain.po.Login;
import com.leg.test.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

class Register{
    private Integer id;
    private String password;
    private String password1;
    private Integer age;
    private String work_city;
    private String work_province;
    private String work_country;

    public Register() {
    }

    public Register(Integer id, String password, String password1, Integer age, String work_city, String work_province, String work_country) {
        this.id = id;
        this.password = password;
        this.password1 = password1;
        this.age = age;
        this.work_city = work_city;
        this.work_province = work_province;
        this.work_country = work_country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWork_city() {
        return work_city;
    }

    public void setWork_city(String work_city) {
        this.work_city = work_city;
    }

    public String getWork_province() {
        return work_province;
    }

    public void setWork_province(String work_province) {
        this.work_province = work_province;
    }

    public String getWork_country() {
        return work_country;
    }

    public void setWork_country(String work_country) {
        this.work_country = work_country;
    }
}

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody //返回user的json字符串
    public String login(@RequestBody Login login){
//        System.out.println(login.getId()+"-==================");
//        System.out.println(login.getPassword()+"============");
        return loginService.login(login.getId(), login.getPassword());
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody Register register){
        System.out.println(register.getId()+"==========" + register.getAge());
        return loginService.register(register.getId(), register.getPassword(), register.getAge(), register.getWork_city(), register.getWork_province(), register.getWork_country());
    }
}

