package com.cuidar.controller;

import java.util.List;

import com.cuidar.model.DependentFamilyMember;
import com.cuidar.model.FamilyMember;
import com.cuidar.model.MainFamilyMember;
import com.cuidar.service.FamilyMemberService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("familymembers")
public class FamilyMemberController {

    private FamilyMemberService familymemberservice;
    public FamilyMemberController(FamilyMemberService familymemberservice) {

        this.familymemberservice = familymemberservice;
    }

    @GetMapping("/main")
    public Iterable<MainFamilyMember> get() {
        return this.familymemberservice.findAllMainFamilyMembers();
    }

    @PostMapping("/main")
    public ResponseEntity<MainFamilyMember> create(@RequestBody MainFamilyMember mainFamilyMember){
        return this.familymemberservice.createMainFamilyMember(mainFamilyMember);
    }



}
