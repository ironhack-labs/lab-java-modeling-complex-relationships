package com.example.events.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany
    private List<Speaker> speakers;

    public Conference() {}

    public Conference(LocalDate date, int duration, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(date, duration, location, title, guests);
        this.speakers = speakers;
    }

    // Getters y setters
}
