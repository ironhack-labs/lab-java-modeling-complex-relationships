package com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

@Entity
@Data
@NoArgsConstructor
@Table (name = "speakers")
public class Speaker {

    // properties

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "speaker_id")
    private int id;

    @Column (name = "speaker_name")
    private String name;

    private Duration presentationDuration;
}
