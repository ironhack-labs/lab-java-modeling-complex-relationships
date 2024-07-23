package com.ironhack.labjavamodelingcomplexrelationships.associationofnurses.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table (name = "chapters")
public class Chapter {

    // properties
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "chapter_id")
    private int id;

    @Column (name = "chapter_name")
    private String name;

    private String district;

    @OneToOne
    private Member president;

    @OneToMany
    @JoinColumn (name = "members")
    private List<Member> list;

    public Chapter(String name, String district, Member president) {
        this.name = name;
        this.district = district;
        this.president = president;
    }
}
