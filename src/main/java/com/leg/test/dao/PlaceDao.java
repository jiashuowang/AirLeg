package com.leg.test.dao;

import com.leg.test.domain.po.Place;
import com.leg.test.domain.po.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceDao extends JpaRepository<Place, String> {
}
