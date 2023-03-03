package com.example.sp5ch09.controller;


import com.example.sp5ch09.dto.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.sp5ch09.repository.MemberRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final MemberRepository memberRepository;

    @GetMapping("/get")
    public String test(){
        System.out.println("hi");
        return "tests";
    }

    @GetMapping("/memberList")
    public List<Member> list(){
        return memberRepository.findAll();
    }
}
