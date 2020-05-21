package com.leg.test.service;

import com.leg.test.domain.po.Product;

import java.util.List;

public interface ProductService {
    List<Product> findCluster(Integer id);
}
