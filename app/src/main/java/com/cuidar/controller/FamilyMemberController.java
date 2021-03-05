package com.cuidar.controller;

import com.cuidar.model.FamilyMember;
import com.cuidar.repository.FamilyMemberRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("familymembers")
public class FamilyMemberController {

    FamilyMemberRepo repo;

    public FamilyMemberController(FamilyMemberRepo repository) {

        this.repo = repository;
    }

    @GetMapping(produces = "application/json")
    public Iterable<FamilyMember> get() {
        return this.repo.findAll();
    }

}
