package com.leg.test.service.impl;
import com.leg.test.domain.po.Login;
import com.leg.test.domain.po.Member;
import com.leg.test.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leg.test.dao.*;
import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;
    @Autowired
    private LoginDao loginDao;

    @Override
    public Member findById(Integer id) {
        Optional<Member> userOptional = memberDao.findById(id);
        Member member = userOptional.get();
        return member;
    }

    @Override
    public List<Member> findAll() {
        return memberDao.findAll();
    }


    @Override
    public String add(Member member) {
        Member result = memberDao.save(member);
        loginDao.save(new Login(member.getID(), "123456"));
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @Override
    public void deleteById(Integer id) {
        memberDao.deleteById(id);
    }

    @Override
    public String update(Member member) {
        Member result = memberDao.save(member);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }
}
