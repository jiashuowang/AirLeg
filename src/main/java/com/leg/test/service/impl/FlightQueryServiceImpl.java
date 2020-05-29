package com.leg.test.service.impl;

import com.leg.test.dao.FlightQueryDao;
import com.leg.test.domain.po.Flight;
import com.leg.test.service.FlightQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leg.test.dao.*;
import java.util.List;
import java.util.Optional;

@Service
public class FlightQueryServiceImpl implements FlightQueryService {
    @Autowired
    private FlightQueryDao flightQueryDao;

    @Override
    public Flight findByFlight_noAndDate(String FLIGHT_NO, String date) {
        return flightQueryDao.findByFlightnoAndDate(FLIGHT_NO, date);
    }
}
