package com.leg.test.dao;

import com.leg.test.domain.po.Login;
import com.leg.test.domain.po.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDao extends JpaRepository<Personal, Integer> {
    Personal findByIdAndPassword(Integer id, String password);
}
