package com.example.events.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected LocalDate date;
    protected int duration;
    protected String location;
    protected String title;

    @OneToMany
    protected List<Guest> guests;

    public Event() {}

    public Event(LocalDate date, int duration, String location, String title, List<Guest> guests) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guests = guests;
    }

    // Getters y setters
}
