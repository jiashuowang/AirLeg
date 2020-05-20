package com.leg.test.web.controller;

import com.leg.test.domain.po.Login;
import com.leg.test.domain.po.Personal;
import com.leg.test.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

class Password{
    private String oldpassword;
    private String newpassword;
    private String newpassword1;

    public Password(String oldPassword, String newPassword, String newPassword1) {
        this.oldpassword = oldPassword;
        this.newpassword = newPassword;
        this.newpassword1 = newPassword1;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getNewpassword1() {
        return newpassword1;
    }

    public void setNewpassword1(String newpassword1) {
        this.newpassword1 = newpassword1;
    }
}

@Controller
@RequestMapping(value = "/Personal")
public class PersonalController {
    @Autowired
    PersonalService personalService;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody //返回user的json字符串
    public Personal getById(Integer id){
        return personalService.findById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody Personal personal){
        return personalService.update(personal);
    }

    @RequestMapping(value = "/changePassword/{id}", method = RequestMethod.PUT)
    @ResponseBody //返回user的json字符串
    public String updatePassword(@RequestBody Password password, @PathVariable("id") Integer id){
        String oldpassword = password.getOldpassword();
        String newpassword = password.getNewpassword();
//        System.out.println(id+"-------------"+oldpassword+"============="+newpassword);
        return personalService.updatePassword(id, oldpassword, newpassword);
    }
}
