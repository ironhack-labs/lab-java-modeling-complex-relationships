package com.example.association.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    public Member president;

    @OneToMany (mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Member> members;





    public Chapter() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }



}
