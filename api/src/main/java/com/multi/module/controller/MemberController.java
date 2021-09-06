package com.multi.module.controller;

import com.multi.module.model.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping
    public Member member() {
        return Member.builder().id(33L).name("wellbell").build();
    }
}
