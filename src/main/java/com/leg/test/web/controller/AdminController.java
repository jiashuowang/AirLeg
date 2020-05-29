package com.leg.test.web.controller;

import com.leg.test.dao.MemberDao;
import com.leg.test.domain.po.Member;
import com.leg.test.domain.po.MileageUpgrade;
import com.leg.test.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/Manage")
@Controller
public class AdminController {

    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberDao memberDao;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody //返回user的json字符串
    public Member getById(Integer id){
        Member member = memberService.findById(id);
        return member;
    }

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody //返回user的json字符串
    public List<Member> findId(@PathVariable("id") Integer id){
        Member member = memberService.findById(id);
        List<Member> infos =  new ArrayList<Member>();
        infos.add(member);
        return infos;
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    @ResponseBody
    public List<Member> getAll(){
        return memberService.findAll();
    }


    @RequestMapping(value = "/findAll/{page}/{size}", method = RequestMethod.GET)
    @ResponseBody
    public Page<Member> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return memberDao.findAll(request);
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody Member member){
        return memberService.add(member);
    }


    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteById(@PathVariable("id") Integer id){
        memberService.deleteById(id);
    }


    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody Member member){
        return memberService.update(member);
    }
}
