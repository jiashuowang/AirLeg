package com.leg.test.service.impl;

import com.leg.test.dao.PlaceDao;
import com.leg.test.domain.po.Place;
import com.leg.test.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    private PlaceDao placeDao;

    @Override
    public List<Place> findAll(){
        return placeDao.findAll();
    }
}

