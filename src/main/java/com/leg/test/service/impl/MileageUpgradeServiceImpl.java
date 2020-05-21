package com.leg.test.service.impl;

import com.leg.test.dao.MemberPointsDao;
import com.leg.test.dao.MileageUpgradeDao;
import com.leg.test.domain.po.MemberPoints;
import com.leg.test.domain.po.MileageUpgrade;
import com.leg.test.service.MileageUpgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MileageUpgradeServiceImpl implements MileageUpgradeService {

    @Autowired
    private MileageUpgradeDao mileageUpgradeDao;
    @Autowired
    private MemberPointsDao memberPointsDao;

    @Override
    public List<MileageUpgrade> getFlightInformation(String flightNo) {
        MileageUpgrade info = mileageUpgradeDao.findById(flightNo).get();
        List<MileageUpgrade> infos =  new ArrayList<MileageUpgrade>();
        infos.add(info);
        return infos;
    }

    @Override
    public String upgradeMileage(Integer id, int mileAge) {
        MemberPoints memberPoints = memberPointsDao.findById(id).get();
        //之前里程
        int previousMileage = memberPoints.getSeg_km_sum();
        //扣除相应积分
        int currentMileage = previousMileage - mileAge;
        if (currentMileage >= 0){
            MemberPoints newMemberPoints = new MemberPoints(id, currentMileage, memberPoints.getExchange_count(), memberPoints.getEp_sum(), memberPoints.getAdd_point_sum(), memberPoints.getPoints_sum());
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
