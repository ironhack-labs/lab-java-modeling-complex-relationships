package com.jpa.jpa.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Conference extends Event {
    @OneToMany
    private List<Speaker> speakers;

    public Conference() {}

    public Conference(Date date, int duration, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(date, duration, location, title, guests);
        this.speakers = speakers;
    }

    // Getters and Setters
}
