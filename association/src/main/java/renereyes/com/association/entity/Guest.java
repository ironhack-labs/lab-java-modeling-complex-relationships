package com.renereyes.association.entity;

import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public enum Status {
        ATTENDING, NOT_ATTENDING, NO_RESPONSE
    }

    // Getters and setters
}
