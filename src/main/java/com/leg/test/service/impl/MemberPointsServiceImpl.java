package com.leg.test.service.impl;

import com.leg.test.dao.MemberPointsDao;
import com.leg.test.domain.po.MemberPoints;
import com.leg.test.service.MemberPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberPointsServiceImpl implements MemberPointsService {
    @Autowired
    private MemberPointsDao memberPointsDao;

    @Override
    public MemberPoints getPoints(Integer id) {
        return memberPointsDao.findById(id).get();
    }
}
