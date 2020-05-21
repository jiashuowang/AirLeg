package com.leg.test.service;

import com.leg.test.domain.po.ExchangePoints;

import java.util.List;

public interface ExchangePointsService {
    //获取航班信息
    List<ExchangePoints> getFlightInformation(String dep_ct, String arr_ct, String dep_time);

    //扣除积分
    String deductPoints(Integer id, int points_deduct);
}
