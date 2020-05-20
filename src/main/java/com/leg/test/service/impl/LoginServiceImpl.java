package com.leg.test.service.impl;

import com.leg.test.dao.LoginDao;
import com.leg.test.dao.MemberDao;
import com.leg.test.dao.MemberPointsDao;
import com.leg.test.dao.PersonalDao;
import com.leg.test.domain.po.Login;
import com.leg.test.domain.po.Member;
import com.leg.test.domain.po.MemberPoints;
import com.leg.test.domain.po.Personal;
import com.leg.test.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    @Autowired
    private MemberDao memberDao;
    @Autowired
    private PersonalDao personalDao;
    @Autowired
    private MemberPointsDao memberPointsDao;


    @Override
    public String login(Integer ID, String PASSWORD) {

        Login login=loginDao.findByIdAndPassword(ID, PASSWORD);
        //判断login是否为空
        if(login==null){
            return "wrong password";
        }else{
            return "success";
        }

    }

    @Override
    public String register(Integer id, String password, Integer age, String work_city, String work_province, String work_country) {
        Login login=loginDao.findByIdAndPassword(id, password);
        if(login == null){
            //管理员增加一个新的注册用户
            //入会时间为当前时间
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String currentDate = date.format(formatter);
            String ffp_date = currentDate;
            int ffp_tier = 0;
            int flight_count = 0;
            String cluster = "低价值客户";
            double avg_discount = 0.0;
            Member newMember = new Member(id, ffp_date, ffp_tier, age, flight_count, cluster, avg_discount);
            memberDao.save(newMember);
            //个人中心加上新注册信息
            Personal newPersonal = new Personal(id, ffp_date, ffp_tier, age, work_city, work_province, work_country, flight_count, password);
            personalDao.save(newPersonal);
            //登录加上新注册信息
            Login newLogin = new Login(id, password);
            loginDao.save(newLogin);
            //会员积分加上新注册信息
            MemberPoints memberPoints = new MemberPoints(id, 0, 0, 0, 0, 0);
            memberPointsDao.save(memberPoints);
            return "success";
        }else{
            return "error";
        }
    }

}
