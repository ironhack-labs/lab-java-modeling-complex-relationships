package com.example.events.models;

import jakarta.persistence.Entity;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Exposition extends Event {

    public Exposition() {}

    public Exposition(LocalDate date, int duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }

    // No necesita atributos extra
}
