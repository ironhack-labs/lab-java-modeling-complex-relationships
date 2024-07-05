package com.jpa.jpa.entities;


import jakarta.persistence.*;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private int duration;
    private String location;
    private String title;

    @OneToMany
    private List<Guest> guests;

    public Event() {}

    public Event(Date date, int duration, String location, String title, List<Guest> guests) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guests = guests;
    }

    // Getters and Setters
}
