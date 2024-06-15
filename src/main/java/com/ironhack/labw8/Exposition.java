package com.ironhack.labw8;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Exposition extends Event {

    public Exposition() {
        super();
    }

    public Exposition(LocalDate date, int duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }
}