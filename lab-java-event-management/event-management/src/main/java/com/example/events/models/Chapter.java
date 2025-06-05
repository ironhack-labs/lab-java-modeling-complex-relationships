package com.example.events.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    private Member president;

    @OneToMany
    private List<Member> members;

    public Chapter() {}

    public Chapter(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }

    // Getters y setters
}
