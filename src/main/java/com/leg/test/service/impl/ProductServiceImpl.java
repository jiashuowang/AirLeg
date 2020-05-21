package com.leg.test.service.impl;

import com.leg.test.dao.MemberDao;
import com.leg.test.dao.ProductDao;
import com.leg.test.domain.po.Member;
import com.leg.test.domain.po.Product;
import com.leg.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private MemberDao memberDao;

    @Override
    public List<Product> findCluster(Integer id){
        Member member = memberDao.findById(id).get();
        String cluster = member.getCLUSTER();
        List<Product> product=productDao.findByCluster(cluster);
        return product;
    }
}
