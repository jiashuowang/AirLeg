package com.leg.test.dao;

import com.leg.test.domain.po.ExchangePoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangePointsDao extends JpaRepository<ExchangePoints, String> {
}
