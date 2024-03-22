package com.ironhack.EventManagementApplication;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
abstract public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    private int duration;

    private String location;

    private String title;

    @OneToMany(mappedBy = "event")
    private List<Guest> guests;

}