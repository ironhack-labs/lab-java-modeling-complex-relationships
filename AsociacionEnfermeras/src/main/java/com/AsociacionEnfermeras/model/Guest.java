package com.AsociacionEnfermeras.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    // Getters y setters
}

enum GuestStatus {
    ATTENDING, NOT_ATTENDING, NO_RESPONSE
}