package com.leg.test.service.impl;


import com.leg.test.dao.LoginDao;
import com.leg.test.dao.PersonalDao;
import com.leg.test.domain.po.Login;
import com.leg.test.domain.po.Personal;
import com.leg.test.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonalServiceImpl implements PersonalService {
    @Autowired
    private PersonalDao personalDao;
    @Autowired
    private LoginDao loginDao;

    @Override
    public Personal findById(Integer id) {
        Optional<Personal> userOptional = personalDao.findById(id);
        Personal personal = userOptional.get();
        return personal;
    }

    @Override
    public String update(Personal personal) {
        Personal result = personalDao.save(personal);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @Override
    public String validatePassword(Integer ID, String oldPassword) {
        Personal personal= personalDao.findByIdAndPassword(ID, oldPassword);
        if(personal==null){
            return "wrong password";
        }else{
            return "success";
        }
    }

    @Override
    public String updatePassword(Integer ID, String oldPassword, String newPassword) {
        if (validatePassword(ID, oldPassword).equals("success")){
            Personal person = personalDao.findById(ID).get();
            person.setPassword(newPassword);
            personalDao.save(person);
            loginDao.save(new Login(person.getId(), person.getPassword()));
            return "success";
        }else{
            return "wrong password";
        }
    }
}
