package com.example.javalab.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Date date;
    int duration;
    String location;
    String title;

    @OneToMany(mappedBy = "event")
    List<Guest> guests;
}
