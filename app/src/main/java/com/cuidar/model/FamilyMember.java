package com.cuidar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familymember")
public class FamilyMember extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String mainDocumentId;
    private Date birthDate;

    public FamilyMember()
    {
        
    }

    public FamilyMember(Long id, String name, String mainDocumentId, Date birthDate) {
        this.id = id;
        this.name = name;
        this.mainDocumentId = mainDocumentId;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMainDocumentId() {
        return mainDocumentId;
    }

    public void setMainDocumentId(String mainDocumentId) {
        this.mainDocumentId = mainDocumentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FamilyMember(Long id) {

        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
