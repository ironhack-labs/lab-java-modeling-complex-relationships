package com.labs.nursesociety.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String district;
    private Member president;
    private List<Member> members;

}

