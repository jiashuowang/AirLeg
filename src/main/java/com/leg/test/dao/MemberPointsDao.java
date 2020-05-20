package com.leg.test.dao;

import com.leg.test.domain.po.MemberPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberPointsDao extends JpaRepository<MemberPoints, Integer> {

}
