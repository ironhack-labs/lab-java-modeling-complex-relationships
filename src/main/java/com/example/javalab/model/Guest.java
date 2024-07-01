package com.example.javalab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Guest {
    @Id
    private String name;
    private Status status;


    public Guest(){}
}
