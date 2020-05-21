package com.leg.test.dao;

import com.leg.test.domain.po.ExchangePoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExchangePointsDao extends JpaRepository<ExchangePoints, String> {
    List<ExchangePoints> findByDepctAndArrctAndDeptime(String dep_ct, String arr_ct, String dep_time);
}
