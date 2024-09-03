package com.ModelandoRelacionesComplejas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String district;
    @ManyToOne
    private Member president;
    @ManyToMany
    @JoinTable(
            name="chapter_members",
            joinColumns = @JoinColumn(name="chapter_id"),
            inverseJoinColumns = @JoinColumn(name="member_id")
    )
    private List<Member> list;
}
