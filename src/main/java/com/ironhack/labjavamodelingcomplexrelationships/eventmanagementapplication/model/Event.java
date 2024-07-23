package com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class Event {

    // properties

    @Column (name = "event_date")
    private LocalDate date;

    @Column (name = "event_location")
    private String location;

    @Column (name = "event_title")
    private String title;

    @ManyToMany
    @JoinColumn (name = "guest_list")
    private List<Guest> list;

}
