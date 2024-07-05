package com.jpa.jpa.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

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

    // Getters and Setters
}
