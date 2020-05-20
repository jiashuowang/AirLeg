package com.leg.test.service;

import com.leg.test.domain.po.Member;

import java.util.List;

public interface MemberService {
    Member findById(Integer id);

    List<Member> findAll();

    String add(Member member);

    void deleteById(Integer id);

    String update(Member member);
}
