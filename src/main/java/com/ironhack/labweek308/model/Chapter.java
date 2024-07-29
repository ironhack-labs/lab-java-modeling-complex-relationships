package com.ironhack.labweek308.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chapterId;

    private String name;
    private String district;

    @OneToOne
    private Member president;

    @ManyToOne
    private AssociationOfNurses associationOfNurses;

    @OneToMany
    private List<Member> listOfMembers;

    public Chapter(String name, String district, Member president, List<Member> listOfMembers) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.listOfMembers = listOfMembers;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", president=" + president +
                ", listOfMembers=" + listOfMembers +
                '}';
    }
}
