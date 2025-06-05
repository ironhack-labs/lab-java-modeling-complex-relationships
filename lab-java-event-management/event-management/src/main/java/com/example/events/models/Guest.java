package com.example.events.models;

import com.example.events.enums.GuestStatus;
import jakarta.persistence.*;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    public Guest() {}

    public Guest(String name, GuestStatus status) {
        this.name = name;
        this.status = status;
    }

    // Getters y setters
}
    