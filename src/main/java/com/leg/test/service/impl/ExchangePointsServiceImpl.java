package com.leg.test.service.impl;

import com.leg.test.dao.ExchangePointsDao;
import com.leg.test.dao.MemberPointsDao;
import com.leg.test.domain.po.ExchangePoints;
import com.leg.test.domain.po.Member;
import com.leg.test.domain.po.MemberPoints;
import com.leg.test.service.ExchangePointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangePointsServiceImpl implements ExchangePointsService {
    @Autowired
    private ExchangePointsDao exchangePointsDao;
    @Autowired
    private MemberPointsDao memberPointsDao;

    @Override
    public List<ExchangePoints> getFlightInformation(String dep_ct, String arr_ct, String dep_time) {
        return exchangePointsDao.findByDepctAndArrctAndDeptime(dep_ct, arr_ct, dep_time);
    }

    @Override
    public String deductPoints(Integer id, int points_deduct) {
//        System.out.println("======================================");
        MemberPoints memberPoints = memberPointsDao.findById(id).get();
//        System.out.println(memberPoints);
        //之前积分
        int previousPoints = memberPoints.getPoints_sum();
        //扣除相应积分
        int currentPoints = previousPoints - points_deduct;
        //之前兑换次数
        int previousCount = memberPoints.getExchange_count();
        //扣除积分后兑换次数加一
        int currentCount = previousCount + 1;
        if (currentPoints >= 0){
            MemberPoints newMemberPoints = new MemberPoints(id, memberPoints.getSeg_km_sum(), currentCount, memberPoints.getEp_sum(), memberPoints.getAdd_point_sum(), currentPoints);
            MemberPoints result = memberPointsDao.save(newMemberPoints);
            if(result != null){
                return "success";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }


}
