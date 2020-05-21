package com.leg.test.dao;

import com.leg.test.domain.po.MileageUpgrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MileageUpgradeDao extends JpaRepository<MileageUpgrade,String> {
}
