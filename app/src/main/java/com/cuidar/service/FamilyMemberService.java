package com.cuidar.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.cuidar.model.DependentFamilyMember;
import com.cuidar.model.MainFamilyMember;
import com.cuidar.repository.DependentFamilyMemberRepo;
import com.cuidar.repository.MainFamilyMemberRepo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FamilyMemberService {
    
    private MainFamilyMemberRepo mainFMRepo;
    private DependentFamilyMemberRepo dependFMRepo;
    private EntityManager em;

    public FamilyMemberService(MainFamilyMemberRepo mainFMRepo, DependentFamilyMemberRepo dependFMRepo) {

        this.mainFMRepo = mainFMRepo;
        this.dependFMRepo = dependFMRepo;
    }

    public Iterable<MainFamilyMember> findAllMainFamilyMembers() {
        return this.mainFMRepo.findAll();
    }

    public List<DependentFamilyMember> findAllDependentsMembersFromMain(Long id) {
        return this.dependFMRepo.findDependentFamlilyMembers(id);
    }

    public ResponseEntity<MainFamilyMember> createMainFamilyMember(MainFamilyMember mainFamilyMember) {
        return null;
    }
}
