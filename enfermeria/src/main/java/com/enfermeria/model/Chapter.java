package com.enfermeria.model;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Chapter {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Member> members;

}