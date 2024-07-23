package com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table (name = "conferences")
public class Conference extends Event {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "conference_id")
    private int id;

    @ManyToMany
    @JoinColumn (name = "speaker_list")
    private List<Speaker> speakerList;
}
