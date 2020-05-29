package com.leg.test.service.impl;

import com.leg.test.dao.MemberDao;
import com.leg.test.domain.po.Member;
import com.leg.test.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public Integer findDiscount(Integer id) {
        Member member = memberDao.findById(id).get();
        String cluster = member.getCLUSTER();
        //返回折扣值
        if(cluster.equals("低价值客户")){
            return 95;
        } else if(cluster.equals("一般客户")){
            return 90;
        } else if(cluster.equals("重要挽留客户")){
            return 85;
        } else if(cluster.equals("重要发展客户")){
            return 80;
        } else{
            return 75;
        }
    }
}
