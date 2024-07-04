package com.example.lab_java_modeling_complex_relationships.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Chapter {
    @Id
    private Integer id;
    private String name;
    private String district;
    private String president;

    @OneToMany
    private List<Member> memberList;

    public Chapter() {
    }

    public Chapter(String name, String district, String president, List<Member> memberList) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.memberList = memberList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", president='" + president + '\'' +
                ", memberList=" + memberList +
                '}';
    }
}
