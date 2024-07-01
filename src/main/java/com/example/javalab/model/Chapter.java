package com.example.javalab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Chapter {
    @Id
    String name;
    String district;

    @OneToOne
    Member president;
    @OneToMany(mappedBy ="chapter")
    List<Member> members;

    public Chapter(){};


}
