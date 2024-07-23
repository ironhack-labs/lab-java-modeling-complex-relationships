package com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table (name = "expositions")
public class Exposition extends Event {

    // properties

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "exposition_id")
    private int id;

}
