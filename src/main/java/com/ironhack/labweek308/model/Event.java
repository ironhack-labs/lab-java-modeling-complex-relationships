package com.ironhack.labweek308.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;

    private String title;
    private Date date;
    private Integer duration;
    private String location;

    @OneToMany
    private List<Guest> listOfGuests;

    @ManyToOne
    private EventManagement eventManagement;

    public Event(String title, Date date, Integer duration, String location, List<Guest> listOfGuests) {
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.listOfGuests = listOfGuests;
    }

}


