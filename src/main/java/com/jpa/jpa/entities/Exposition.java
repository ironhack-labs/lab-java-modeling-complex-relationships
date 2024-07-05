package com.jpa.jpa.entities;


import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Exposition extends Event {
    public Exposition() {}

    public Exposition(Date date, int duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }

    // Getters and Setters
}
