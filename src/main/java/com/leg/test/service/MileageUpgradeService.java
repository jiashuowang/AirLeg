package com.leg.test.service;

import com.leg.test.domain.po.MileageUpgrade;

import java.util.List;

public interface MileageUpgradeService {

    List<MileageUpgrade> getFlightInformation(String flightNo);

    String upgradeMileage(Integer id, int mileAge);
}
