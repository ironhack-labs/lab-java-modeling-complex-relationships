package com.labs.nursesociety.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Status status;
}

enum Status {
    ATTENDING,
    NOT_ATTENDING,
    NO_RESPONSE
}