package com.cuidar.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cuidar.model.enums.FamilyMemberLinkType;

@Entity
@Table(name = "dependent_familymember")
public class DependentFamilyMember extends FamilyMember {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private FamilyMemberLinkType linkTypeToMainMember;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "mainFamilyMemberId")
    private MainFamilyMember mainFamilyMember;

    public DependentFamilyMember(){

    }

    public FamilyMemberLinkType getLinkTypeToMainMember() {
        return linkTypeToMainMember;
    }

    public void setLinkTypeToMainMember(FamilyMemberLinkType linkTypeToMainMember) {
        this.linkTypeToMainMember = linkTypeToMainMember;
    }

    public DependentFamilyMember(FamilyMemberLinkType linkTypeToMainMember, MainFamilyMember mainFamilyMember) {
        this.linkTypeToMainMember = linkTypeToMainMember;
        this.mainFamilyMember = mainFamilyMember;
    }

    public MainFamilyMember getMainFamilyMember()
    {
        return mainFamilyMember;
    }
}