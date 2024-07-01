package com.example.javalab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Speaker {
    @Id
    private String name;
    private int presentationDuration;

    public Speaker(){}
}
