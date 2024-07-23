package com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table (name = "guests")
public class Guest {

    // properties

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "guest_id")
    private int id;

    @Column (name = "guest_name")
    private String name;

    @Enumerated (EnumType.STRING)
    private Status status;


    // Enum

    public enum Status {
        ATTENDING,
        NOT_ATTENDING,
        NO_RESPONSE
    }
}
