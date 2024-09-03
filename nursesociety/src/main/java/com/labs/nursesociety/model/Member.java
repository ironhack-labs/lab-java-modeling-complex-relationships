package com.labs.nursesociety.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Enumerated
    private StatusOfMember status;

    private LocalDate renewal_date;

    @ManyToOne
    private Chapter chapter;
}

enum StatusOfMember {
    ACTIVE,
    LAPSED
}