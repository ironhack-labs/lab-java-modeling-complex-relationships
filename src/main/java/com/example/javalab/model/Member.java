package com.example.javalab.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Member {
    @Id
    String name;
    Status status;
    Date renewalDate;

    @ManyToOne
    @JoinColumn(name = "chapter_name")
    private Chapter chapter;

    public Member(){};
}
