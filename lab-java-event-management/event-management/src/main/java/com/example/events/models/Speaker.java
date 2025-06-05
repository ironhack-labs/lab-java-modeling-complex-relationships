package com.example.events.models;

import jakarta.persistence.*;

@Entity
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int presentationDuration;

    public Speaker() {}

    public Speaker(String name, int presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    // Getters y setters
}
