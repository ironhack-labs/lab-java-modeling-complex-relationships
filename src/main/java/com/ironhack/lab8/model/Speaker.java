package com.ironhack.lab8.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;
}
