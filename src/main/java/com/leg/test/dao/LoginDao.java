package com.leg.test.dao;

import com.leg.test.domain.po.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends JpaRepository<Login, Integer> {
    Login findByIdAndPassword(Integer id, String password);
}
