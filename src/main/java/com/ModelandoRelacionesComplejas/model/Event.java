package com.ModelandoRelacionesComplejas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private int duration;
    private String location;
    private String title;
    @Enumerated(EnumType.STRING)
    private EventType type;

    @OneToMany
    private List<Guest> guests;
    @OneToMany
    private List<Speaker> speakers;


    public enum EventType {
        CONFERENCE, EXPOSITION
    }
}
