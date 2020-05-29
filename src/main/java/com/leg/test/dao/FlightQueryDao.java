package com.leg.test.dao;

import com.leg.test.domain.po.Flight;
import com.leg.test.domain.po.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightQueryDao extends JpaRepository<Flight, String> {
    Flight findByFlightnoAndDepscheduled(String FLIGHT_NO,String DEP_SCHEDULED);
    Flight findByFlightnoAndDate(String flight_no, String date);
}
