package com.leg.test.service;

import com.leg.test.domain.po.Flight;

public interface FlightQueryService {
    Flight findByFlight_noAndDate(String FLIGHT_NO,String date);
}
