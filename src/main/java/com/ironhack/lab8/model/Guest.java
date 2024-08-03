package com.ironhack.lab8.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ResponseStatus status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public enum ResponseStatus {
        ATTENDING,
        NOT_ATTENDING,
        NO_RESPONSE
    }

}
