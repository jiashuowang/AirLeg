package com.leg.test.dao;

import com.leg.test.domain.po.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository<Member, Integer> {

}
