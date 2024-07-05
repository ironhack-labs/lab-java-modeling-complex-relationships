package com.jpa.jpa.entities;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Guest() {}

    public Guest(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    // Getters and Setters

    public enum Status {
        ATTENDING,
        NOT_ATTENDING,
        NO_RESPONSE
    }
}
