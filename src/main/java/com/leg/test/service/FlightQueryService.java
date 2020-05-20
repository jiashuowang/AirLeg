package com.leg.test.service;

import com.leg.test.domain.po.Flight;

public interface FlightQueryService {
    Flight findByFLIGHT_NOAndDEP_SCHEDULED(String FLIGHT_NO,String DEP_SCHEDULED);
}
